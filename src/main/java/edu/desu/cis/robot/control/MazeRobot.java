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
        mbot.avoidCrashing(9.0);
        //I am using mbot.forward for now as I am not sure if Conner is done with his
        //line following    code.
        //mbot.forward(50);
        mbot.followLine();


        boolean keepGoing = true;

        while (keepGoing){

            SensorSnapshot data = awaitNewData();


            //basically is something close enough to , us it stops all behaviors
            if (data.distance() <= 15.0){
                //Stops all behaviors including the avoidCrashing
                mbot.stopAllBehaviors();

                //reads what color it encountered and stores it into the variable
                String whatColor = mbot.getColorObjectFromCamera();

                //System.out.println(whatColor);


                if(whatColor.equalsIgnoreCase("RED")){
                    mbot.Play();
                    System.out.println("Yay sample found");
                    try {
                        Thread.sleep(2000);  //  2 seconds
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }

                    mbot.avoidCrashing(9.0);
                    mbot.turnLeft(45);
                    mbot.followLine();
                }
                else if (whatColor.equalsIgnoreCase("YELLOW")) {
                    mbot.yellow_play();
                    System.out.println("Yellow block found");
                    mbot.stop();
                    keepGoing = false; // stops the loop
                }

                // Didn't find red color basically
                else{
                    //Reactivating the avoidCrashing
                    mbot.avoidCrashing(9.0);
                    //mbot.forward(50);
                    mbot.followLine();


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
