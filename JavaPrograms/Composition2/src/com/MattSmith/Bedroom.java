package com.MattSmith;

public class Bedroom {
    private Bed bed;
    private Window window;
    private Door door;

    public Bedroom(Bed bed, Window window, Door door) {
        this.bed = bed;
        this.window = window;
        this.door = door;
    }

    public void tidyRoom(){
        window.closeWindow();
        door.closeDoor();
    }

    public void wakeUp(){
        window.openWindow();
        door.openDoor();
    }


    public Bed getBed() {
        return bed;
    }
}
