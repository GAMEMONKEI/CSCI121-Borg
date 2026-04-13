package edu.desu.cis.robot.control;

import edu.desu.cis.robot.service.SensorSnapshot;

public class RovingRobot extends RobotController {
    public RovingRobot(String robotName) {
        super(robotName);
    }

    @Override
    public void run() {
        double threshold = 15.0;
        int turnDirection = 0;

        mbot.avoidCrashing(threshold);
        mbot.forward(50.0);

        while (true) {
            SensorSnapshot myData = awaitNewData();

            if (myData.distance() <= threshold) {
                mbot.turnLeft(90);
                mbot.forward(50);
            }
        }
    }

    public static void main(String[] args) {
        try (RovingRobot robot = new RovingRobot("Borg")) {
            robot.run();
        }
    }
}