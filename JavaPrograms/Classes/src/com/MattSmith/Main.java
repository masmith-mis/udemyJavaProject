package com.MattSmith;

public class Main {

    public static void main(String[] args) {

        Car porsche = new Car();
        Car toyota = new Car();
        Car honda = new Car();
        porsche.setModel("Carrera");
        toyota.setModel("Camry");
        honda.setModel("Civic");
        System.out.println("Model is " + porsche.getModel());
        System.out.println("Model is " + toyota.getModel());
        System.out.println("Model is " + honda.getModel());
    }
}
