package com.afterft1.day02.soal02;

public class Account {
    private int norek;
    private  double saldo;

    public Account(int norek, double saldo) {
        this.norek = norek;
        this.saldo = saldo;
    }

    public int getNorek() {
        return norek;
    }

    public void setNorek(int norek) {
        this.norek = norek;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
