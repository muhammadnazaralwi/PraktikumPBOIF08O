/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nazar.pertemuan11;

/**
 *
 * @author alwi
 */
public class SgtSamaSisi extends Titik {
    private double sisiSGT;
    
    public SgtSamaSisi(double x1, double y1, 
            double x2, double y2) {
//        super(x1, y1);
//        Titik t2 = new Titik(x2, y2);
        super();
        super.setTitik(x1, y1);
        
        Titik t2 = new Titik();
        t2.setTitik(x2, y2);
        sisiSGT = hitungJarak(t2);
    }
    
    public double hitungLuas() {
        return 0.5 * sisiSGT * Math.sqrt(3);
    }
    
    @Override
    public void tampil() {
        super.tampil();
        System.out.println("Sisi Segitiga\t\t\t: " + sisiSGT);
        System.out.println("Luas Segitiga\t\t\t: " + hitungLuas());
    }
}
