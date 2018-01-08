package com.MattSmith;

public class Bed {
    private int pillows;
    private int sheets;
    private int blankets;
    private String mattress;

    public Bed(int pillows, int sheets, int blankets, String mattress) {
        this.pillows = pillows;
        this.sheets = sheets;
        this.blankets = blankets;
        this.mattress = mattress;
    }

    public void makeBed(){
        System.out.println("Bed.makeBed() called");
    }

    public int getPillows() {
        return pillows;
    }

    public int getSheets() {
        return sheets;
    }

    public int getBlankets() {
        return blankets;
    }

    public String getMattress() {
        return mattress;
    }
}
