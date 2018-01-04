package com.MattSmith;

public class Main {

    public static void main(String[] args) {
//	    int value = 3;
//	    if(value == 1) {
//            System.out.println("Value was " + value);
//        } else if (value == 2) {
//            System.out.println("Value was " + value);
//        } else {
//            System.out.println("Was not 1 or 2");
//        }
//
//        int switchValue = 3;
//	    switch(switchValue) {
//            case 1:
//                System.out.println("Value was 1");
//                break;
//            case 2:
//                System.out.println("Value was 2");
//                break;
//            case 3: case 4: case 5:
//                System.out.println("Was a 3, or a 4, or a 5");
//                System.out.println("Actually it was " + switchValue);
//                break;
//            default:
//                System.out.println("Value was not 1, 2, 3, 4, 5");
//                break;
//        }

        char charValue = 'A';
	    switch(charValue) {
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("A, B, C, D, or E was found. Value found was " + charValue);
                break;
            default:
                System.out.println("A, B, C, D, or E was NOT found. Value was " + charValue);
                break;
        }
        String month = "January";
	    switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
                break;
        }
    }
}
