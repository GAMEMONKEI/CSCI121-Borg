package edu.desu.cis.robot.control;

import edu.desu.cis.robot.service.SensorSnapshot;

public class MazeRobot extends RobotController {

    public MazeRobot(String robotName) {
        super(robotName);
    }

    public void run() {
        mbot.avoidCrashing(15.0);
        mbot.followLine();

        boolean keepGoing = true;

        while (keepGoing) {
            SensorSnapshot data = awaitNewData();

            if (data.distance() <= 17.0) {
                mbot.stopAllBehaviors();
                try { Thread.sleep(300); } catch (InterruptedException e) {}

                String whatColor = mbot.getColorObjectFromCamera();
                System.out.println("Color detected: " + whatColor);

                if (whatColor.equalsIgnoreCase("RED")) {
                    mbot.stopBehavior("STEER_AROUND");
                    mbot.Play();
                    System.out.println("Yay sample found");
                    mbot.turnLeft(45);
                    mbot.forward(30);
                    while (mbot.readLineStatus() == 0) {
                        try { Thread.sleep(50); } catch (InterruptedException e) {}
                    }
                    mbot.stop();
                    mbot.avoidCrashing(15.0);
                    mbot.followLine();

                }else if (whatColor.equalsIgnoreCase("YELLOW")) {
                    mbot.stopBehavior("STEER_AROUND");
                    System.out.println("Yellow block found");
                    mbot.stop();
                    mbot.yellow_play();
                    keepGoing = false; // stops the loop
                } else if (whatColor.equalsIgnoreCase("GREEN")) {
                    mbot.stopBehavior("STEER_AROUND");
                    System.out.println("Green object - pushing it");
                   // mbot.avoidCrashing(15.0);
                    mbot.forward(50,3);
                    mbot.backward(50,3);
                    mbot.followLine();
                } else if (whatColor.equalsIgnoreCase("BLUE")) {
                    System.out.println("Blue object - avoiding it");
                    //mbot.backward(10,0.3);
                    //mbot.steerAround(10,30,0);
                    mbot.turnLeft(35);
                    mbot.forward(30,3);
                    mbot.turnRight(35);
                    mbot.followLine();
                } else {
                    mbot.stopBehavior("STEER_AROUND");
                    System.out.println("Unknown object: " + whatColor);
                    mbot.avoidCrashing(15.0);
                    mbot.followLine();
                }
            }
        }
    }

    public static void main(String[] args) {
        try (MazeRobot amazin = new MazeRobot("Borg")) {
            amazin.run();
        }
    }
}