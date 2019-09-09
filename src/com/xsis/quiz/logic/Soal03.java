package com.xsis.quiz.logic;

public class Soal03 {
    public static void main(String[] args) {
        Soal03 s1 = new Soal03();


        s1.getGrade(101);

    }

    void getGrade(int score) {
        char grade;
        if (score>=90&&score<=100){
            grade = 'A';
        }else if (score>=80&&score<=89){
            grade = 'B';
        }else if (score>=70&&score<=79){
            grade = 'C';
        }else if (score>=60&&score<=69) {
            grade = 'D';
        }else {
            grade = 'F';
        }

        System.out.print(grade);
    }
}
