package com.xsis.day02;

public class TestLogic {
    public static void main(String[] args) {
//soal 01
        int l = 1;
        for (int i=0; i<7; i++) {
            System.out.print(l +" ");
            l+=2;
        }
        System.out.println();

        //soal 02
        int k = 2;
        for (int i=0; i<7; i++){
            System.out.print(k +" ");
            k+=2;
        }
        System.out.println();

        //soal 04
        int a = 1;
        for (int i=0; i<7; i++){
            System.out.print(a + " ");
            a = a + 3;
        }
        System.out.println();


        //soal 05
        int c = 1;
        for (int x=1; x<6; x++) {
            System.out.print(c + " ");
            c = c + 4;

            if (x % 2 == 0) {
                System.out.print("*" + " ");

            }
        }

        System.out.println();

        //soal 06
        int d = 1;
        for (int y=1; y<8; y++){
            if (d % 3 == 0) {
                System.out.print("*" + " ");
            }else if (d % 3 != 0) {
                System.out.print(d + " ");
            }
            d = d + 4;
        }

        System.out.println();

        //soal 07
        int f = 2;
        for (int i=0; i<=6; i++){
            System.out.print(f + " ");
            f = f * 2;
        }

        System.out.println();

        //soal 08
        int g = 3;
        for (int i=0; i<=6; i++){
            System.out.print(g + " ");
            g = g * 3;
        }

        System.out.println();

        // soal 09
        int h = 4;
        for(int i=1; i<6; i++) {
            System.out.print(h + " ");
            h = h * 4;
            if (i % 2 == 0){
                System.out.print("*" + " ");
            }
        }

        System.out.println();

        //soal 10
        int j = 3;
        for (int i=1; i<=7; i++) {
            if (i == 4) {
                System.out.print("xxx" + " ");
            }else if(i != 4 ){
                System.out.print(j + " ");
            }
            j = j * 3;
        }

    }
}
