package com.nazar.pertemuan7.guided.binatang;

public abstract class Binatang {
    private String jenis;

    public Binatang(String jenis) {
        this.jenis = jenis;
    }
    
    protected abstract void suara();

    public String toString(){
        return "Seekor " + jenis; 
    }
}
