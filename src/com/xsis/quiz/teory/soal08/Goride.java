package com.xsis.quiz.teory.soal08;

public class Goride extends Gojek {
    private  double totalBayar;

    public Goride(int jarakTempuh, double harga) {
        super(jarakTempuh, harga);
        this.totalBayar = super.getJarakTempuh() * super.getHarga();
    }

    public double getTotalBayar() {
        return totalBayar;
    }

    public void setTotalBayar(double totalBayar) {
        this.totalBayar = totalBayar;
    }

    @Override
    public String toString() {
        return super.toString()+ ", Total Bayar="+ getTotalBayar();
    }
}
