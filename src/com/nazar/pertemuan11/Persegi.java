/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nazar.pertemuan11;

/**
 *
 * @author alwi
 */
public class Persegi extends Titik {
    private double sisiPSG;
    
    public Persegi(double x1, double y1, 
            double x2, double y2) {
//        super(x1, y1);
//        sisiPSG = hitungJarak(new Titik(x2, y2));

        super();
        super.setTitik(x1, y1);
        
        Titik t2 = new Titik();
        t2.setTitik(x2, y2);
        sisiPSG = hitungJarak(t2);
    }
    
    public double hitungLuas() {
        return sisiPSG * sisiPSG;
    //  return Math.pow(sisiPSG, 2);  
    }
    
    @Override
    public void tampil() {
        super.tampil();
        System.out.println("Sisi Persegi\t\t\t: " + sisiPSG);
        System.out.println("Luas Persegi\t\t\t: " + hitungLuas());
    }
}
