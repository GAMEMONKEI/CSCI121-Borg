def follow_line_behavior():
    line = getLineOffset()
    kp = 0.4
    base_speed = 30
    if line == 0:
        error = 50
    elif line == 1:
        error = 0
        #this means that its perfect acording to the algorithm and the slideshow
        #gonna test this pull rq

    if not arbiter.acquire("line", "FOLLOW_LINE", 10, blocking=False):
        return

    try:
        status = mbuild.quad_rgb_sensor.get_line_sta()  # line 1
    finally:
        arbiter.release("line", "FOLLOW_LINE")

    if not arbiter.acquire("motors", "FOLLOW_LINE", 10, blocking=False):
        return

    try:
        # implement line 2 – 13
        pass
    finally:
        arbiter.release("motors", "FOLLOW_LINE")


@register_command("FOLLOW_LINE")
def handle_follow_line(payload):
    scheduler.start_behavior("FOLLOW_LINE", follow_line_behavior)
    return ok_response("Following Line")