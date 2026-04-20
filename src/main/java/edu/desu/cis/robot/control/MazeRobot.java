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


    public void run(){
        //System.out.println("Please connect please connect please connect");
        //mbot.forward(30.0,1);
        mbot.startSampleScan();


        while(true){

            SensorSnapshot s = awaitNewData();
            if (mbot.checkSampleFound()){
                mbot.stopAllBehaviors();
                //Kaleah's code
                //mbot.Play();

                System.out.print("sample found, now stopping robot");
                break;

            }
        }


    }

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
