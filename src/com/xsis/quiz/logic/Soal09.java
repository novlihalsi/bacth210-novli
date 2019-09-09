package com.xsis.quiz.logic;

public class Soal09 {
    public static void main(String[] args) {
        int[] score = {10,9,7,10};

        Soal09 Score = new Soal09();

        Score.addScore(score);


    }

    void addScore(int[] score){
        int totalScore = 0;

        for (int i=0; i<score.length; i++){
            totalScore = totalScore + score[i];
        }


        System.out.println(totalScore);
    }
}
