package com.MattSmith;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    //Method creation: (setter)
    //This method will update the model:
    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("camry") || validModel.equals("civic")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }
    //Method to return what the current model is (getter)
    public String getModel() {
        return this.model;
    }
}
