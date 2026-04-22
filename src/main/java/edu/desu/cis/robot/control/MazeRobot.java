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
            // wait for fresh sensor data before doing anything
            SensorSnapshot s = awaitNewData();

            // every loop ask the robot if the red cup has been spotted yet
            if (mbot.checkSampleFound()) {
                // stop all running behaviors including scan and any movement
                mbot.stopAllBehaviors();
                 mbot.Play();
                // print to intellij console so we can see it worked
                System.out.println("sample found, stopping robot");
                // exit the loop, our job is done
                break;
            }
        }
    }

    // tm8 line following method - uncomment when followLine() is added to MBot2.java in mian branch
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