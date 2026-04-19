#Will be tracking whether the sample is found or not and will be updated later
found_it = [False]

def scan_for_sample():


    #so basically this will check if the camera can be used if not it skips but if it can it scans
    if not arbiter.acquire("camera","SCAN_SAMPLE", 40,blocking = False):
        return

    #function that uses the camera to identifies the color of the ball it is seeing
    try:
        ball = get_detected_ball()
    # Preston you take is to always release the camera so other behaviors can use it
    finally:
        arbiter.release("camera","SCAN_SAMPLE")

    if ball["color"] != "RED":
        return

    #this part of my code is for using the motors since the sample is found
    #if the motors are busy it skips
    if not arbiter.acquire("motors","SCAN_SAMPLE", 120,blocking = False):
        return
    #this helps stop both motors because 0 speed
    try:
        mbot2.drive_speed(0,0)
    #ofc we release it once again
    finally:
        arbiter.release("motors", "SCAN_SAMPLE")
    #since we found it we are now updating that we found it
    found_it[0] = True

    #Since we found it we now  need to implement a stop behavior
    scheduler.stop_behavior("SCAN_FOR_SAMPLE")

@register_command("SCAN_FOR_SAMPLE")
def handle_scan_for_sample(payload):
    #We are reseting it each time so that we dont have the True before it stopped behavio
    found_it[0] = False
    # I did this to start the function
    scheduler.start_behavior("SCAN_FOR_SAMPLE", scan_for_sample)

    return ok_response("SCAN_FOR_SAMPLE has started")

#Created a checker for java to see if it found the red sample yet using the found_it
@register_command("CHECK_SAMPLE_FOUND")
def handle_check_sample_found(payload):
    #the real checker as it checks if it found it with the true and false thx to found_it
    return ok_response("found it!", {"found": found_it[0]})
    #Java time!
























