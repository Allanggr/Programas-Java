package com.AllanRibeiro;

public class Main {

    public static void main(String[] args) {

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Percy", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Gilbert", highScorePosition);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted,
                                        int bonus){


        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }

        return -1;
    }

    public static void displayHighScorePosition(String name, int positionScore){
        System.out.println( name + " managed to get into position " + positionScore +
                                " on the high score table");
    }

    public static int calculateHighScorePosition(int score){

        if (score >= 1000)
            return 1;
        else if((score >= 500) && (score <1000))
            return 2;
        else if((score < 500) && (score >= 100))
            return  3;
        else
            return  4;

    }
}
