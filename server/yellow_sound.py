@register_command("YELLOW_BLOCK_IS_DETECTED")
def return_audio(payload):
    cyberpi.audio.set_vol(80)
    cyberpi.audio.play("hello")

    cyberpi.audio.play_tone(300, 0.1)
    cyberpi.audio.play_tone(800, 0.1)
    cyberpi.audio.play_tone(300, 0.1)
    cyberpi.audio.play_tone(800, 0.1)
    cyberpi.audio.play_tone(300, 0.1)
    cyberpi.audio.play_tone(800, 0.1)

    time.sleep(0.2)


    cyberpi.audio.play_tone(300, 0.1)
    cyberpi.audio.play_tone(800, 0.1)
    cyberpi.audio.play_tone(300, 0.1)
    cyberpi.audio.play_tone(800, 0.1)
    cyberpi.audio.play_tone(300, 0.1)
    cyberpi.audio.play_tone(800, 0.1)
    cyberpi.audio.play_tone(300, 0.1)
    cyberpi.audio.play_tone(800, 0.1)
    return ok_response("Yellow block detected!")
