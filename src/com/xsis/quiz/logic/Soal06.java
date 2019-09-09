package com.xsis.quiz.logic;

public class Soal06 {
    public static void main(String[] args) {
        Soal06 s1 = new Soal06();

        s1.getJumlahChar("xsis java programer developer winner ", 'a');

    }

    void getJumlahChar(String kalimat, char abjad){
        int jumlahKarakter = 0;
        for (int i=0; i<kalimat.length(); i++){
            if(kalimat.charAt(i)==abjad){
                jumlahKarakter+=1;
            }

        }
        System.out.println(jumlahKarakter);
    }
}
