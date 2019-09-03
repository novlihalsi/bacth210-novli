package com.xsis.day04;

public class Phytagoras {
    public static void main(String[] args) {
        int [][] angka = new int[3][7];

        Phytagoras phytagoras = new Phytagoras();

        phytagoras.getPhytagoras(angka);


    }

    void getPhytagoras (int[][] angka){
        for (int n=0; n<angka.length; n++) {
            for (int m=0; m<angka[n].length; m++) {
                if (n>0 && m>0) {
                    int hasil = n * m;
                    System.out.print(hasil + " ");
                } else  {
                    System.out.print(m + n + " ");
                }
            }
            System.out.println();
        }

    }

}
