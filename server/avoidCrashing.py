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
    distance = mbuild.ultrasonic2.get()

    if distance > threshold:
        mbot2.drive_speed(40, -40)
        return

    mbot2.drive_speed(0, 0)

    mbuild.smart_camera.open_light()
    time.sleep(0.1)
    label = mbuild.smart_camera.get_color_sta(1)
    mbuild.smart_camera.close_light()
    color = COLOR_NAMES.get(label, None)