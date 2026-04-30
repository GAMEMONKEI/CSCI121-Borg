import cyberpi
import mbot2
import mbuild
import time
import random

DISTANCE_THRESHOLD = 15.0
SCAN_THRESHOLD = 20.0
PUSH_SPEED = 60
PUSH_DURATION = 1.5
BACKUP_SPEED = 40
BACKUP_DURATION = 0.8


def ball_detection_behavior(threshold=SCAN_THRESHOLD):

    # Read the distance — skip this cycle if the sensor is busy
    if not arbiter.acquire("ultrasonic", "BALL_DETECTION", 50):
        return
    try:
        distance = mbuild.ultrasonic2.get()
    finally:
        arbiter.release("ultrasonic", "BALL_DETECTION")

    # If nothing is close, keep driving forward
    if distance > threshold:
        if not arbiter.acquire("motors", "BALL_DETECTION", 50):
            return
        try:
            mbot2.drive_speed(40, -40)
        finally:
            arbiter.release("motors", "BALL_DETECTION")
        return

    # Object detected — stop and read camera color
    if not arbiter.acquire("motors", "BALL_DETECTION", 50):
        return
    try:
        mbot2.drive_speed(0, 0)
    finally:
        arbiter.release("motors", "BALL_DETECTION")

    # Read the camera — skip this cycle if the camera is busy
    if not arbiter.acquire("camera", "BALL_DETECTION", 50):
        return
    try:
        mbuild.smart_camera.open_light()
        time.sleep(0.1)
        label = mbuild.smart_camera.get_color_sta(1)
        mbuild.smart_camera.close_light()
        color = COLOR_NAMES.get(label, None)
    finally:
        arbiter.release("camera", "BALL_DETECTION")

    # Acquire the motors — skip this cycle if something higher-priority holds them
    if not arbiter.acquire("motors", "BALL_DETECTION", 50):
        return
    try:
        if color == "GREEN":
            # Movable — push through
            cyberpi.console.print("GREEN: pushing")
            mbot2.drive_speed(PUSH_SPEED, -PUSH_SPEED)
            time.sleep(PUSH_DURATION)
            mbot2.drive_speed(0, 0)
        else:
            # BLUE or unknown = immovable — back up and turn
            cyberpi.console.print("BLUE: avoiding")
            mbot2.drive_speed(-BACKUP_SPEED, BACKUP_SPEED)
            time.sleep(BACKUP_DURATION)
            mbot2.drive_speed(0, 0)
            mbot2.turn(90)
    finally:
        arbiter.release("motors", "BALL_DETECTION")


@register_command("BALL_DETECTION")
def handle_ball_detection(payload):
    params = payload.get("parameters", {})
    threshold = params.get("threshold", SCAN_THRESHOLD)
    scheduler.start_behavior("BALL_DETECTION", ball_detection_behavior, threshold)
    return ok_response("Ball detection started")


@register_command("STOP_BALL_DETECTION")
def handle_stop_ball_detection(payload):
    if arbiter.acquire("motors", "STOP_BALL_DETECTION", 180):
        try:
            mbot2.drive_speed(0, 0)
        finally:
            arbiter.release("motors", "STOP_BALL_DETECTION")
    scheduler.stop_behavior("BALL_DETECTION")
    return ok_response("Ball detection stopped")
