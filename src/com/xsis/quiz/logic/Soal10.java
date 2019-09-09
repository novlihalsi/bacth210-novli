package com.xsis.quiz.logic;

import java.util.Scanner;

public class Soal10 {
    public static void main(String[] args) {
        int[] angka = new int[7];

        Soal10 s1 = new Soal10();

        s1.largestInArray(angka);

    }

    void largestInArray(int[] angka) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter value : ");
        for (int i = 0; i < angka.length; i++) {
            angka[i] = scanner.nextInt();
                System.out.println(angka[i]);
                }
    }


}