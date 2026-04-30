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
        mbot.avoidCrashing(15.0);
        //I am using mbot.forward for now as I am not sure if Conner is done with his
        //line following    code.
        mbot.forward(50);
        //mbot.followLine();


        boolean keepGoing = true;

        while (keepGoing){
            System.out.println("awaiting data");
            SensorSnapshot data = awaitNewData();
            System.out.println("Got data");

            //basically is something close enough to , us it stops all behaviors
            if (data.distance() <= 15.0){
                //Stops all behaviors including the avoidCrashing
                mbot.stopAllBehaviors();

                //reads what color it encountered and stores it into the variable
                String whatColor = mbot.getColorObjectFromCamera();

                System.out.println(whatColor);


                if(whatColor.equalsIgnoreCase("RED")){
                    mbot.Play();
                    System.out.println("Yay sample found");
                    keepGoing = false;
                }
                // Didn't find red color basically
                else{
                    //Reactivating the avoidCrashing
                    mbot.avoidCrashing(15.0);
                    mbot.forward(50);
                    //mbot.followLine();


                }
            }

        }
    }


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