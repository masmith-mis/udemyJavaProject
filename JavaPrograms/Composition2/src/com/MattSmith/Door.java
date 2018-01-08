package com.MattSmith;


public class Door {
    private int door;
    private int lock;

    public Door(int door, int lock) {
        this.door = door;
        this.lock = lock;
    }

    public void openDoor(){
        System.out.println("Door.openDoor() called");
    }

    public void closeDoor(){
        System.out.println("Door.closeDoor() called");
        lockDoor();
    }

    private void lockDoor() {
        System.out.println("Door.lockDoor() called");
    }

    public int getDoor() {
        return door;
    }

    public int getLock() {
        return lock;
    }
}
