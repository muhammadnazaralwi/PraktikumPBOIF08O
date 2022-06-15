package com.nazar.pertemuan7.guided.binatang;

public class Burung extends Binatang{
    private String nama;

    public Burung(String nama) {
        super("Burung");
        this.nama = nama;
    }
    
    public void suara(){
        System.out.println("berkicau");
    }
    
    public String toString(){
        return super.toString() + "" + nama;
    }
}
