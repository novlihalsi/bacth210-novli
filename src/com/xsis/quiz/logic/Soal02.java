package com.xsis.quiz.logic;

public class Soal02 {
    public static void main(String[] args) {
        Soal02 s1 = new Soal02();

        s1.getBilanganPrima(6);

    }
    void getBilanganPrima(int n) {
        int hitung = 0;
        int angka = 2;


        while(hitung < n) {
            boolean prima = true;
            for(int i = 2; i<angka; i++){

                if (angka % i == 0){
                    prima = false;
                    break;
                }
            }
            if(prima){

                hitung++;

                System.out.print(angka + " ");
            }
            angka++;
        }
    }
}
