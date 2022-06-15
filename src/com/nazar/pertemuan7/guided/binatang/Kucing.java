package com.nazar.pertemuan7.guided.binatang;

public class Kucing extends Binatang{
    private String nama;

    public Kucing(String nama) {
        super("Kucing");
        this.nama = nama;
    }

    public void suara(){
        System.out.println("Meong");
    }

    public String toString(){
        return super.toString() + "" + nama;
    }
}
