/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nazar.pertemuan7.guided.binatang;

/**
 *
 * @author Irfan
 */
public class Burung extends Binatang{
    private String nama;

    public Burung(String nama) {
        super("Burung");
        this.nama = nama;
    }
    
    protected void suara() {
        System.out.println("Berkicau");
    }
    
    public String toString(){
        return super.toString() + "" +nama;
    }
}
