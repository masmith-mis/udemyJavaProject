package com.MattSmith;

import java.util.Scanner;

public class Main {
    //system.in allows you to type inputs
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //accept input from the console.
        //sum up total numbers
        //figure out the average of the numbers.
        int[] myIntegers = getIntegers(5);

        for(int i=0; i<myIntegers.length; i++){
            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
        }
        System.out.println("The average is " + getAverage(myIntegers));

    }

    //return an array - int number = number of array elements we want to define
    public static int[] getIntegers(int number) {
        //print out a message
        System.out.println("Enter " + number + " integer values.\r");
        //define the array
        //assigning the number of elements to the array based on what is passed in the method
        int[] values = new int[number];

        //for loop to assign the values
        for (int i=0; i<values.length; i++){
            //returns an integer that is stored in the array
            values[i] = scanner.nextInt();
        }

        //return the array
        return values;
    }

    //the method parameter is our array, so we need to be able to enter an array (created above)
    //that is why we use int[] array - as a parameter.
    public static double getAverage(int[] array){
        //define local variable that is the sum total
        int sum = 0;

        for(int i=0; i<array.length; i++){
            //add to the sum
            sum += array[i];
        }
        System.out.println("The sum is " + sum);
        //return the average
        return (double) sum / (double) array.length;
    }
}
