package com.MattSmith;

public class TV {
    private String manufacturer;
    private String name;

    public TV(String manufacturer, String name) {
        this.manufacturer = manufacturer;
        this.name = name;
    }

    public void powerOn(){
        System.out.println("TV -> You have powered on your " + manufacturer + " " + name + " TV");
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getName() {
        return name;
    }
}
