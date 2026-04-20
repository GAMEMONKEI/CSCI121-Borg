def follow_line_behavior():
    #Hello my dear reader, if you are curious what this all means, refer to the LineWalk.pdf
    if not arbiter.acquire("line", "FOLLOW_LINE", 10, blocking=False):
        return

    try:
        status = mbuild.quad_rgb_sensor.get_line_sta()  # line 1
    finally:
        arbiter.release("line", "FOLLOW_LINE")

    if not arbiter.acquire("motors", "FOLLOW_LINE", 10, blocking=False):
        return

    try:
        line = status  # fixed: getLineOffset() doesn't exist, status has your sensor reading
        kp = 0.4
        base_speed = 30
        error = 0
        if line == 0:
            error = 30
        elif line > 1 and line < 4:
            error = -10  # fixed: was missing the = sign
            #means two sensors are on the line and thats a nono
        elif line < 7:
            error = -50
        else:
            error = -100 #HARDEST LEFT EVER!!
        correction = error * kp
        em1_speed = base_speed + correction
        em1_speed = min(max(em1_speed, -50), 50)
        em2_speed = -base_speed + correction
        em2_speed = min(max(em2_speed, -50), 50)
        mbot2.drive_speed(em1_speed, em2_speed)

    finally:
        arbiter.release("motors", "FOLLOW_LINE")


@register_command("FOLLOW_LINE")
def handle_follow_line(payload):
    scheduler.start_behavior("FOLLOW_LINE", follow_line_behavior)
    return ok_response("Following Line")