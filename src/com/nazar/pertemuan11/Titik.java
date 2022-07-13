/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nazar.pertemuan11;

/**
 *
 * @author alwi
 */
public class Titik {
    protected double x;
    protected double y;

    // Ada dua cara untuk mengatur nilai atribut suatu kelas
    // 1. Constructor
    // 2. Fungsi mutator (setter), cirinya: void
//    public Titik(double X, double Y) {
//        this.x = X;
//        this.y = Y;
//    }
    
    public void setTitik(double X, double Y) {
        this.x = X;
        this.y = Y;
    }
    
    public void tampil() {
        System.out.println("Point\t\t\t\t: [" + x + "," + y + "]");
    }
    
    // object vs variable
    // variable -> double, int, char, boolean
    // double a
    
    // object -> tipe data buatan sendiri
    // Titik a
    
    public double hitungJarak(Titik t2) {
        return Math.sqrt(Math.pow(t2.x - this.x, 2) + Math.pow(t2.y - this.y, 2));
        
        // Math.pow(t2.x - this.x, 2)
        // (x2 - x1)^2
    }
}
