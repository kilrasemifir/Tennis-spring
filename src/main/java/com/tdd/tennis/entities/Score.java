package com.tdd.tennis.entities;

public class Score {
    public static final int ZERO_POINT = 0;
    public static final int PREMIER_POINT = 15;
    public static final int DEUXIEME_POINT = 30;
    public static final int TROISIEME_POINT = 40;

    private int score;

    public int getScore(){
        return this.score;
    }

    public int incrementScore(){
        if (score == ZERO_POINT)
            score = PREMIER_POINT;
        else if(score == PREMIER_POINT)
            score = DEUXIEME_POINT;
        else if(score==DEUXIEME_POINT)
            score = TROISIEME_POINT;
        return score;
    }
}
