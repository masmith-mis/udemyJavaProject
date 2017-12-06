package com.MattSmith;

public class Main {

    public static void main(String[] args) {
        //width of an int = 32 (4 bytes)
	    int myIntValue = 5 / 3;

	    //width of a float = 32 (4  bytes)
	    float myFloatValue = 5f / 3f;

	    //width of a double = 64 (8 bytes)
        //double is faster on modern computers
        //more precise
        //you'd use double before float
	    double myDoubleValue = 5d / 3d;

	    //print:
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);


        //Exercise:
        double numPounds = 200d;
        double convertedKilograms = numPounds * 0.45359237d;
        System.out.println("Kilograms = " + convertedKilograms);
        //90.7185

        //underscores to make numbers more readable:
        double pi = 3.141_592_7d;
        System.out.println("pi = " + pi);


    }
}
