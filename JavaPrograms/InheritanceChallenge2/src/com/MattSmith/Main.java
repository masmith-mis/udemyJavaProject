package com.MattSmith;

public class Main {

    public static void main(String[] args) {
	    //Challenge.
        //Start with a base class of a Vehicle, then create a car class that inherits from the base class
        //Finally, create another class, a specific type of car that inherits from the Car class.
        //You should be able to handle steering, changing gears, and moving (speed)
        //You will want to decide where to put the appropriate state (fields) and behaviors (methods)
        //As mentioned above, changing gears, increasing/decreasing speed should be included.
        //For your specific type of vehicle you will want to add something specific for that type of car


        Outlander outlander = new Outlander(36);
        outlander.steer(45);
        outlander.accelerate(30);
        outlander.accelerate(20);
        outlander.accelerate(-42);
        outlander.accelerate(-8);

    }
}
