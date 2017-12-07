package com.MattSmith;

public class Main {

    public static void main(String[] args) {
//	    int count = 0;
//	    while(count != 6) {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        count = 1;
//        while(true) {
//	        if(count == 6) {
//	            break;
//            }
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        int count = 6;
//        do {
//            System.out.println("Count value was " + count);
//            count++;
//
//            if(count >100) {
//                break;
//            }
//
//        } while(count != 6);

//        int number = 5;
//        int finishNumber = 20;
//        while(number <= finishNumber){
//            if(!isEvenNumber(number)) {
//                number++;
//                continue;
//            }
//
//            System.out.println("Even number " + number);
//            number++;
//        }

        //Modify the while code above
        //Make it also record the total number of even numbers it has found
        //and break once 5 are found
        //and at the end, display the total number of even numbers found.
        int number = 5;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        while (number <= finishNumber) {
            if (!isEvenNumber(number)) {
                number++;
                continue;
            }

            System.out.println("Even number " + number);
            number++;

            evenNumbersFound++;
            if(evenNumbersFound >= 5) {
                break;
            }
        }

        System.out.println("Total even numbers found = " + evenNumbersFound);
    }

    //create a method called isEvenNumber that takes a parameter of type int
    //its purpose is to determine if the argument passed to the method is
    //an even number or not.
    //return true if an even number, otherwise return false.
    //hint: user remainder operator
    public static boolean isEvenNumber(int number) {
        if ((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
