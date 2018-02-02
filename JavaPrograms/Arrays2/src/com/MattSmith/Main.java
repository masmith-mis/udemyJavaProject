package com.MattSmith;

import java.util.Scanner;

public class Main {

    //allows user input;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        int[] myIntArray = new int[25];
//        for(int i = 0; i < myIntArray.length; i++) {
//            myIntArray[i] = i*10;
//        }
//
//        printArray(myIntArray);

        int[] myIntegers = getIntegers(5);
        for(int i = 0; i<myIntegers.length; i++){
            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
        }
        System.out.println("The average is " + getAverage(myIntegers));

    }
    ///return an array and take an int as a parameter
    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values.\r");
        //using the number that was passed and assigning that number to the array
        int[] values = new int[number];
        for (int i = 0; i<values.length; i++){
            //accepts an integer from the console and stores it in our array
            values[i] = scanner.nextInt();
        }

        return values;
    }

    //get the average value of the array:
    public static double getAverage(int[] array){
        int sum = 0;
        for(int i = 0; i<array.length; i++) {
            sum += array[i];
        }

        return (double) sum / (double) array.length;
    }

//    public static void printArray(int[] array){
//        for(int i = 0; i<array.length; i++){
//            System.out.println("Element " + i + ", value is " + array[i]);
//        }
//    }
}

