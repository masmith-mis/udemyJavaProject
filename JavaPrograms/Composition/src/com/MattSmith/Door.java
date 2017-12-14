package com.MattSmith;

public class Door {
    private int numberOfDoors;

    public Door(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public void adjarDoor() {
        System.out.println("Door -> You have opened the door");
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }
}
