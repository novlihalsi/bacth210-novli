package com.xsis.day01;

public class Gaya {
    public static void main (String[] args) {
        Gaya gaya = new Gaya ();

        int f = gaya.getResultan(10, 5);
        System.out.println("Resultan Gaya : " + f);

        int m = gaya.getMassa(50, 5);
        System.out.println("Massa : " + m);

        int a = gaya.getPercepatan(50, 10);
        System.out.println("Percepatan : " + a);

    }

    public int getResultan(int m, int a) {
        return m*a;
    }

    public int getMassa(int f, int a) {
        return f/a;
    }

    public int getPercepatan (int f, int m) {
        return f/m;
    }


}
