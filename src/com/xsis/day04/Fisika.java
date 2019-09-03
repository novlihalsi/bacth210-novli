package com.xsis.day04;

public class Fisika {
    public static void main(String[] args) {
        Fisika F = new Fisika();

        double k1 = F.getKalor(5,4.2,10.5);
        F.getKalor(5,10);
        int k3 = F.getKalor();

        System.out.println(k1);
        System.out.println(k3);
        F.testException();
    }

    double getKalor(double m, double c, double dt){
        return  m*c*dt;
    }

    void getKalor(double m, double dt) {
        double c = 4.2;
        double x = m*c*dt;
        System.out.println(x);
    }

    int getKalor() {
        return 5*4*3;
    }

    void testException() {
        int a[] =new int[3];
        try {
            System.out.println(a[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown : "+e);
        } finally {
            a[0] = 7;
            System.out.println("Elemen pertama pada array adalah : " +a[0]);
            System.out.println("Sudah Final.....");
        }

    }
}