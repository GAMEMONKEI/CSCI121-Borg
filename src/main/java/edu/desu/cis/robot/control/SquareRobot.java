package edu.desu.cis.robot.control;

import edu.desu.cis.robot.control.RobotController;


public class SquareRobot extends RobotController {
    public SquareRobot(String robotName) {
        super(robotName);
    }

    @Override
    public void run() {
        for (int i = 0; i < 4; i++){
            mbot.forward(30.0,1);
            mbot.turnLeft(90);
        }
    }

    public static void main(String[] args) {
        try (SquareRobot robot = new SquareRobot("Borg")) {
            robot.run();
        }
    }
}