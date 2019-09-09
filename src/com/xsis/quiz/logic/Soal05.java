package com.xsis.quiz.logic;

public class Soal05 {
    public static void main(String[] args) {

        Soal05 s1 = new Soal05();

        s1.checkPalindromString("101");

    }

    void checkPalindromString(String teks){
        String palindrom = "";
        int max = teks.length();
        for (int i=0; i<teks.length(); i++){
            String test = teks.substring(max-1, max);
            max--;
            palindrom+=test;
        }
         if (teks.equals(palindrom)){
             System.out.println(teks+ " adalah palindrom");
         } else {
             System.out.println(teks+ " bukan palindrom");
         }
    }
}
