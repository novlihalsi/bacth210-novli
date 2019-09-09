package com.xsis.quiz.teory.soal08;

public class Gofood extends Goride {
    private double hargaMakanan;

    public Gofood(int jarakTempuh, double harga, double hargaMakanan) {
        super(jarakTempuh, harga);
        this.hargaMakanan = hargaMakanan;
    }

    public double getHargaMakanan() {
        return hargaMakanan;
    }

    public void setHargaMakanan(double hargaMakanan) {
        this.hargaMakanan = hargaMakanan;
    }

    @Override
    public double getTotalBayar() {
        return super.getTotalBayar()+this.hargaMakanan;
    }

    @Override
    public String toString() {
        return super.toString() + ", Harga Makanan=" + this.getHargaMakanan();
    }
}
