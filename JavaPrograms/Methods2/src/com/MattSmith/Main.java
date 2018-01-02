package com.MattSmith;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);


        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);


        displayHighScorePosition("Matt", calculateHighScorePosition(1500));
        displayHighScorePosition("Jason", calculateHighScorePosition(900));
        displayHighScorePosition("Tim", calculateHighScorePosition(400));
        displayHighScorePosition("Brent", calculateHighScorePosition(50));
        displayHighScorePosition("Stef", calculateHighScorePosition(1000));
        displayHighScorePosition("Connie", calculateHighScorePosition(500));
        displayHighScorePosition("Madi", calculateHighScorePosition(100));
        displayHighScorePosition("Louise", calculateHighScorePosition(50));

    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position " + highScorePosition
                + " on the high score table.");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if(playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        } else {
            return 4;
        }
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return  finalScore;
        }

        return score;
    }
}
