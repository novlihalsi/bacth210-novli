package com.xsis.quiz.teory.soal08;

public class Gojek {
    private int jarakTempuh;
    private double harga;

    public Gojek (int jarakTempuh, double harga){
        this.jarakTempuh = jarakTempuh;
        this.harga = harga;

    }

    public int getJarakTempuh() {
        return jarakTempuh;
    }

    public void setJarakTempuh(int jarakTempuh) {
        this.jarakTempuh = jarakTempuh;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    @Override
    public String toString() {
        return "Gojek{" +
                "jarakTempuh=" + jarakTempuh +
                ", harga=" + harga +
                '}';
    }
}
