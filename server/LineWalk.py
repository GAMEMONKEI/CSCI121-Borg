def follow_line_behavior():
    if arbiter.acquire("line", " FOLLOW_LINE ", 10, blocking=False):
    return
try:
    status = mbuild.quad_rgb_sensor.get_line_sta() // line 1
finally:
arbiter.release("line", " FOLLOW_LINE ")
if not arbiter.acquire("motors", " FOLLOW_LINE ", 10, blocking=False):
    return
try:
    // implement line 2 – 13
finally:
arbiter.release("motors", " FOLLOW_LINE ")
@register_command("FOLLOW_LINE")
def handle_follow_line(payload):
    scheduler.start_behavior("FOLLOW_LINE", follow_line_behavior)
return ok_response("Following Line")