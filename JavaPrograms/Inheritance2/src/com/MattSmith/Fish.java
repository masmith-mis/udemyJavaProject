package com.MattSmith;

public class Fish extends Animal {

    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest() {
        System.out.println("Fish.rest() called.");
    }

    private void moveMuscles() {
        System.out.println("Fish.moveMuscles() called");
    }

    private void moveBackFin(){
        System.out.println("Fish.moveBackFin() called");
    }

    @Override
    public void move(int speed) {
        if(speed > 0) {
            System.out.println("Fish.move() called");
            moveMuscles();
            moveBackFin();
            super.move(speed);
        } else {
            rest();
        }
    }


    public int getGills() {
        return gills;
    }

    public int getEyes() {
        return eyes;
    }

    public int getFins() {
        return fins;
    }
}
