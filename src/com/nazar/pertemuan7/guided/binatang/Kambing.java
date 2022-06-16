/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nazar.pertemuan7.guided.binatang;

/**
 *
 * @author Irfan
 */
public class Kambing extends Binatang{
    private String nama;

    public Kambing(String nama) {
        super("Kambing");
        this.nama = nama;
    }
    
    public void suara(){
        System.out.println("Mengembek");
    }
    
    public String toString(){
        return super.toString()+ "" +nama;
    }
}
