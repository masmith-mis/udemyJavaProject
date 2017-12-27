package com.MattSmith;

class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    //Use name and cylinders as parameters & Initialize all 4 values.
    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String startEngine() {
        return "Car -> startEngine()";
    }

    public String accelerate() {
        return "Car -> accelerate()";
    }

    public String brake() {
        return "Car -> brake()";
    }

    //Do no need getters for Wheels/Engine becasue they are set to 4 / true.

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }
}

class ES300 extends Car {
    public ES300() {
        super("Lexus ES300", 6);
    }

    @Override
    public String startEngine() {
        return "ES300 -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "ES300 -> accelerate()";
    }

    @Override
    public String brake() {
        return "ES300 -> brake()";
    }
}

class Civic extends Car {
//    public Civic(String name, int cylinders) {
//        super(name, cylinders);
//    }

    public Civic() {
        super("Honda Civic", 4);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " -> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " -> break()";
    }
}

class Mustang extends Car {
    public Mustang() {
        super("Ford Mustang", 8);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " -> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " -> break()";
    }
}

public class Main {

    public static void main(String[] args) {
	    // We are going to go back to the car analogy.
        // Create a base class called Car
        // It should have a few fields that would be appropriate for a generic car class.
        // engine, cylinders, wheels, etc.
        // Constructor should initialize cylinders (number of) and name, and set wheels to 4
        // and engine to true. Cylinders and names would be passed as parameters.
        //
        // Create appropriate getters
        //
        // Create some method like startEngine, accelerate, and break
        //
        // show a message for each int he base class
        // Now create 3 sub classes for your favorite vehicles.
        // Override the appropriate methods to demonstrate polymorphism in use
        // put all classes in the one java file (this one).
        for (int i = 1; i<=10; i++) {
            Car car = selectCar();
            System.out.println("Random car " + car.getName()
                                + "\n" + "Cylinders: " + car.getCylinders()
                                + "\n" + "Start Engine: " + car.startEngine()
                                + "\n" + "Speed: " + car.accelerate()
                                + "\n" + "Break: " + car.brake());
        }
    }

    public static Car selectCar(){
        int randomNumber = (int) (Math.random() * 3) + 1;
        System.out.println("Random number generated was " + randomNumber);

        switch (randomNumber) {
            case 1:
                return new ES300();

            case 2:
                return new Civic();

            case 3:
                return new Mustang();

            default:
                return null;
        }
    }
}
