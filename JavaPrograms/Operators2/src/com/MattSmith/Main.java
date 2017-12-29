package com.MattSmith;

public class Main {

    public static void main(String[] args) {
        //most common operator:
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        //store the current value of result;
        int previousResult = result;

        //assign result to something else;
        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        //assign previousResult again
        previousResult = result;
        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        //save value again
        previousResult = result;
        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        //remainder operator:
        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        //add a value
        previousResult = result;
        result = result + 1;
        System.out.println("Result is now " + result);
        //increment the result by 1
        result++;
        System.out.println("Result is now " + result);
        //minus result by 1:
        result--;
        System.out.println("Result is now " + result);
        //result equals result + 2;
        result += 2;
        System.out.println("Result is now " + result);
        //multiply by 10;
        result *= 10;
        System.out.println("Result is now " + result);
        //subtract 10
        result -= 10;
        System.out.println("Result is now " + result);
        //divide 10;
        result /= 10;
        System.out.println("Result is now " + result);


        boolean isAlien = false;
        if(!isAlien){
            System.out.println("It is not an alien!");
        }

        int topScore = 80;
        if(topScore <= 100){
            System.out.println("You got the high score! Your high score is: " + topScore);
        }

        //AND operator (both conditions have to be true)
        int secondTopScore = 85;
        if((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        //OR operator (only one has to be true)
        if((topScore > 90) || (secondTopScore <= 90)){
            System.out.println("One of these tests is true");
        }

        int newValue = 50;
        if(newValue == 50){
            System.out.println("This is true");
        }

        boolean isCar = false;
        if(isCar){
            System.out.println("This is not supposed to happen");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar) {
            System.out.println("wasCar is true");
        } else {
            System.out.println("wasCar is false");
        }

        //Challenge:
        //Create a double variable with the value 20
        //Create a second double variable with the value 80
        //Add both numbers up and multiply by 25
        //Use the remainder operator to figure out the remainder from the sum of #3 divided by 40
        //Write an if statement that displays a message "Total was over the limit"
        // if the remaining total is equal to 20 or less.

        double firstDouble = 20;
        double secondDouble = 80;
        double total = (firstDouble + secondDouble) * 25;
        System.out.println("The total is: " + total);
        double remainder = total % 40;
        System.out.println("The remainder is: " + remainder);

        if(remainder <= 20) {
            System.out.println("Total was over the limit. Your total is: " + remainder);
        }



    }
}
