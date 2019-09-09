package com.xsis.quiz.logic.Soal08;

public class Barang {
    String produk;
    int harga;

    public Barang (String produk, int harga){
        this.produk = produk;
        this.harga = harga;
    }

    @Override
    public String toString() {
        return "Barang{" +
                "produk='" + produk + '\'' +
                ", harga=" + harga +
                '}';
    }
}
