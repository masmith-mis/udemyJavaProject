package com.MattSmith;

public class Main {

    public static void main(String[] args) {
        //Primitive types:
        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean

        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);

        //append more to your first string:
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);

        myString = myString + "\u00A9";
        System.out.println("myString is equal to " + myString);

        String numberString = "250.55";
        numberString = numberString + " 49.95";
        System.out.println("The result is " + numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("The result is: " + lastString);

        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("The new result is: " + lastString);


    }
}
