/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nazar.pertemuan11;

/**
 *
 * @author alwi
 */
public class Limas {
    SgtSamaSisi sgt1, sgt2, sgt3, sgt4;
    Persegi psg;
    
    public Limas(double Sx1, double Sy1, 
            double Sx2, double Sy2, 
            double Px1, double Py1, 
            double Px2, double Py2) {
        sgt1 = new SgtSamaSisi(Sx1, Sy1, Sx2, Sy2);
        sgt2 = new SgtSamaSisi(Sx1, Sy1, Sx2, Sy2);
        sgt3 = new SgtSamaSisi(Sx1, Sy1, Sx2, Sy2);
        sgt4 = new SgtSamaSisi(Sx1, Sy1, Sx2, Sy2);
        psg = new Persegi(Px1, Py1, Px2, Py2);
    }
    
    public double hitungLuas() {
        return (4 * sgt1.hitungLuas()) + psg.hitungLuas();
    }
    
    public void tampil() {
        System.out.println("== DATA Segitiga ==");
        sgt1.tampil();
        
        System.out.println();
        
        System.out.println("== DATA Persegi==");
        psg.tampil();
        
        System.out.println();
        System.out.println();
        System.out.println("Luas Limas\t\t\t: " + hitungLuas());
    }
}
