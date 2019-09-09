package com.xsis.quiz.logic;

import java.util.Scanner;

public class Soal01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Harga Produk : ");
        int harga = scanner.nextInt();
        System.out.print("Cash : ");
        int cash = scanner.nextInt();

        int kembalian = cash - harga;
        System.out.println("Kembali : " + kembalian);

    }
}
