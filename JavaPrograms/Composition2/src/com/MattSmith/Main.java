package com.MattSmith;


public class Main {

    public static void main(String[] args) {
//        Dimensions dimensions = new Dimensions(20, 20, 5);
//	    Case theCase = new Case("220B", "Dell", "240", dimensions);
//
//	    Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));
//
//	    Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");
//
//	    PC thePC = new PC(theMotherboard, theMonitor, theCase);
//	    thePC.powerUp();
//
        Bed theBed = new Bed(2,2,2,"Queen");
        Window theWindow = new Window("Main window");
        Door theDoor = new Door(1, 2);

        Bedroom mattsBedroom = new Bedroom(theBed, theWindow, theDoor);
        System.out.println("***** TIDY ROOM ******");
        mattsBedroom.tidyRoom();
        System.out.println("**** MAKE BED ******");
        mattsBedroom.getBed().makeBed();
        System.out.println("****** WAKE UP ******");
        mattsBedroom.wakeUp();


    }
}
