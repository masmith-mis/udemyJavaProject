package com.MattSmith;

public class Room {
    private Door door;
    private TV tv;
    private Window window;

    public Room(Door door, TV tv, Window window) {
        this.door = door;
        this.tv = tv;
        this.window = window;
    }

    public void openDoor() {
        System.out.println("Room -> Opening door");
        door.adjarDoor("Matt");
    }

    public void powerOnTv() {
        System.out.println("Room -> turning on TV");
        tv.powerOn();
    }

    public Window getWindow() {
        return window;
    }
}
