package com.MattSmith;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0,2.0));

        for(int i = 0; i < 5; i++){
            System.out.println("Loop " + i + " hello!");
        }

        //using the for statement, call the calculateInterest method with
        //the amount of 10,000 with an interestRate of 2,3,4,5,6,7, and 8
        //and print the results to the console log
        for(int i = 2; i < 9; i++){
            System.out.println("10,000 at " + i + "%" + " = " + calculateInterest(10000.0, i));
        }

        for(int i = 8; i >= 2; i--){
            System.out.println("10,000 at " + i + "%" + " = " + calculateInterest(10000.0, i));
        }

        int count = 0;
        for(int i=10; i<50; i++) {
            if(isPrime(i)){
                count++;
                System.out.println("Number " + i + " is a prime number");
                if(count == 3) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }
    }


    public static boolean isPrime(int n) {

        if(n == 1) {
            return false;
        }

        for(int i=2; i <= n/2; i++) {
            if(n % i == 0) {
                return false;
            }
        }

        return true;

    }

    public static double calculateInterest(double amount, double interestRate){
        return ((amount * interestRate)/100);
    }
}
