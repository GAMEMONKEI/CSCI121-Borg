package edu.desu.cis.robot.control;

import edu.desu.cis.robot.service.SensorSnapshot;

/**
 * A specific implementation of a robot controller that navigates a maze,
 * identifies objects, and performs actions based on the object's color.
 *
 */
public class MazeRobot extends RobotController {

    /**
     * Constructs a new MazeRobot.
     */
    public MazeRobot(String robotName) {
        super(robotName);
    }

    public void run() {
        // start watching for the red cup in the background
        mbot.startSampleScan();

        while (true) {

            SensorSnapshot s = awaitNewData();


            if (mbot.checkSampleFound()) {

                mbot.stopAllBehaviors();

                // mbot.play();  -- uncomment when teammate adds play() to MBot2.java

                System.out.println("sample found, stopping robot");
                // exit the loop, our job is done
                break;
            }
        }
    }

    // teammate's line
    // public void followLine() {
    //     mbot.followLine();
    // }

    /**
     * The main entry point for the MazeRobot application.
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {

        try (MazeRobot amazin = new MazeRobot("Borg")) {
            amazin.run();
        }
    }
}