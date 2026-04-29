package edu.desu.cis.robot.control;

import edu.desu.cis.robot.control.RobotController;

public class FlashBot extends RobotController {

    public FlashBot(String robotName) {
        super(robotName);
    }

    @Override
    public void run() {
        // Flash blue 5 times, then flash red 3 times
        mbot.flashLed(4, 0,   255,   0, 0.3);
        //mbot.flashLed(3, 255, 0,   0,   0.2);

        // Drive forward 20 cm AFTER flashing is complete
        //mbot.straight(20);
        for (int i = 0; i < 4; i++){
            mbot.forward(30.0,2);
            mbot.flashLed(1, 255,   0,   0, 0.3);
            mbot.turnLeft(90);
        }
    }

    public static void main(String[] args) {
        try (FlashBot robot = new FlashBot("Preston")) {
            robot.run();
        }
    }
}