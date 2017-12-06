package com.MattSmith;

public class Main {

    public static void main(String[] args) {
        //most common operator
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        //save the previous result
        int previousResult = result;
        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        //multiplication
        previousResult = result;
        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        //divide
        previousResult = result;
        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        //remainder (%)
        //return the remainder using two operands
        previousResult = result;
        result = result % 3;
        //give me the remainder of 4 divided by 3 (4/3 remainder =1 )
        System.out.println(previousResult + " % 3 = " + result);

        //add a value
        previousResult = result;
        result = result + 1;
        System.out.println("Result is now " + result);
        result++;
        System.out.println("Result is now " + result);
        result--;
        System.out.println("Result is now " + result);

        //abbreviations:
        //this is the same as doing result = result + 2;
        result += 2;
        System.out.println("Result is now " + result);
        result *= 10;
        System.out.println("Result is now " + result);
        result -= 10;
        System.out.println("Result is now " + result);
        result /= 10;
        System.out.println("Result is now " + result);
        result %= 2;
        System.out.println("Result is now " + result);

        //If Then Statement:
        //Conditional code: execute code on the next line if the previous line is true.
        boolean isAlien = false;
        //if (isAlien == false)
        //    System.out.println("It is not an alien!");

        if (isAlien == true)
            System.out.println("It is not an alien!");

        //int topScore = 100;
        int topScore = 80;
        //if (topScore == 100)
        //    System.out.println("you got the high score");

        //if (topScore != 100)
        //    System.out.println("you got the high score");

        //if (topScore > 100)
        //    System.out.println("you got the high score");

        //if (topScore >= 100)
        //    System.out.println("you got the high score");

        //if (topScore < 100)
        //    System.out.println("you got the high score");

        if (topScore <= 100)
            System.out.println("you got the high score");

        int secondTopScore = 91;
        if ((topScore > secondTopScore) && (topScore < 100))
            System.out.println("Greater than second top score and less then 100");

        //or operator, only one needs to be true:
        if ((topScore > 90) || (secondTopScore <= 90))
            System.out.println("One of these tests is true");

        //challenges:
        int newValue = 50;
        if (newValue == 50)
            System.out.println("This is true");

        boolean isCar = false;
        if(isCar)
            System.out.println("This is not supposed to happen");

        //ternary operator
        //a way to set a value based on two conditions:
        boolean wasCar = isCar ? true : false;
        if(wasCar)
            System.out.println("wasCar is true");
        else
            System.out.println("wasCar is false");


        //Challenge:
        //1. create a double variable with the value 20
        //2. create a second variable of type double with the value 80
        //3. add both numbers up and multiply by 25
        //4. use the remainder operator to figure o ut the remainder from the sum of #3 divided by 40
        //5. write an "if" statement that displays a message "total was over the limit"
        //      if the remaining total (#4) is equal to 20 or less.

        double firstDouble = 20d;
        double secondDouble = 80d;
        double totalDouble = (firstDouble + secondDouble) * 25;
        System.out.println("totalDouble = " + totalDouble);
        double myRemainder = totalDouble % 40;
        System.out.println("myRemainder = " + myRemainder);
        if (myRemainder <= 20)
            System.out.println("Total was over the limit");


    }
}