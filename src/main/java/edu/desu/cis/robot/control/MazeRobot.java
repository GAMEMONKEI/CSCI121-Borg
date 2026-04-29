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

        mbot.startSampleScan();

        boolean keep_going = true;



        while (keep_going) {

            SensorSnapshot s = awaitNewData();

            // every loop ask the robot if the red cup has been spotted yet
            if (mbot.checkSampleFound()) {
                // stop all running behaviors
                mbot.stopAllBehaviors();
                mbot.Play();

                System.out.println("sample found, stopping robot");
                // exit the loop
                keep_going = false;
            }
        }
    }


    // public void followLine() {
    //     mbot.followLine();
    // }

    /**
     * The main entry point for the MazeRobot application.
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        try (MazeRobot amazin = new MazeRobot("Preston")) {
            amazin.run();
            //Test
        }
    }
}