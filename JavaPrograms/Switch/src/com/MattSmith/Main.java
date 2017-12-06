package com.MattSmith;

public class Main {

    public static void main(String[] args) {
//	    int value = 3;
//	    if(value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2){
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }

        //switch statement with int:
        int switchValue = 6;

	    switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;

            default:
                System.out.println("Value was not 1,2,3,4 or 5");
                break;
        }

	    //Challenge:
        //Create a new switch statement using char instead of int
        //create a new char variable
        //create a switch statement testing for
        //A, B, C, D or E
        //display a message if any of these are found and then break
        //add a default which displays a message saying not found

        char charSwitchValue = 'C';

	    switch(charSwitchValue) {
            case 'A':
                System.out.println("We found your A! Your char is " + charSwitchValue);
                break;
            case 'B':
                System.out.println("We found your B! Your char is " + charSwitchValue);
                break;
            case 'C': case 'D': case 'E':
                System.out.println("We found your char! Your char is " + charSwitchValue);
                break;
            default:
                System.out.println("You char is not A, B, C, D or E. Your char is " + charSwitchValue);
                break;
        }

    }
}
