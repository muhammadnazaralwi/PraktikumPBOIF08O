/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nazar.pertemuan7.guided.Binatang;

/**
 *
 * @author Irfan
 */
public class Anjing extends Binatang{
    private String nama;

    public Anjing(String nama) {
        super("Anjing");
        this.nama = nama;
    }
    
    public void suara(){
        System.out.println("Mengonggong");
    }
    
    public String toString(){
        return super.toString()+ "" +nama;
    }
    
}
