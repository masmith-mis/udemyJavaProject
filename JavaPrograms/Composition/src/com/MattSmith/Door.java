package com.MattSmith;

public class Door {
    private int numberOfDoors;

    public Door(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public void adjarDoor(String name) {
        System.out.println("Door -> " + name + " has opened the door");
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }
}
