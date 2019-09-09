package com.xsis.quiz.logic;

public class Soal04 {
    public static void main(String[] args) {
        float[] angka = new float[5];
        angka[0] = 2f;
        angka[1] = 5f;
        angka[2] = 3.5f;
        angka[3] = 6.5f;
        angka[4] = 10f;

        Soal04 s1 = new Soal04();
        s1.getLargestNumber(angka);
    }

    void getLargestNumber(float[] angka){
        int x = (int) angka[0];
        for(int i=0; i<angka.length; i++){
            if(x<angka[i]){
                x= (int) angka[i];
            }
        }
        System.out.println(x);
    }
}
