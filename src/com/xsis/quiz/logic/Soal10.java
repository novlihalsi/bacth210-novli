package com.xsis.quiz.logic;

import java.util.Scanner;

public class Soal10 {
    public static void main(String[] args) {
        int[] angka = new int[7];
        String[] x = new String[7];

        Soal10 s1 = new Soal10();

        s1.largestInArray(angka,x);

    }

    void largestInArray(int[] angka,String[] x) {
        int max = angka[0];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter value, Q to Quit : ");
        for (int i = 0; i < angka.length; i++) {
            x[i] = scanner.next();
            if(x[i].equals("Q")||x[i].equals("q")){
                break;
            }
            angka[i]= Integer.parseInt(x[i]);
            if (max<angka[i]){
                max = angka[i];
            }
        }
        for (int j=0; j<angka.length; j++){
            if (angka[j]==0){
                break;
            } else if (angka[j]==max){
                System.out.println(angka[j] + " <== Largest Value");
            } else {
                System.out.println(angka[j]);
            }
        }
    }
}