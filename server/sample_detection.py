#Will be tracking whether the sample is found or not and will be updated later
sample_detected_flag = [False]

def scan_for_sample_behavior():


    #so basically this will check if the camera can be used if not it skips but if it can it scans
    if not arbiter.acquire("camera","SCAN_SAMPLE", 40,blocking = False):
        return

    #function that uses the camera to identifies the color of the ball it is seeing
    try:
        ball = get_detected_ball()
    # Preston you take is to always release the camera so other behaviors can use it
    finally:
        arbiter.release("camera","SCAN_SAMPLE")

    if ball["color"] != "Red":
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
    #since we found it we are not updating that we found it
    sample_detected_flag[0] = True





