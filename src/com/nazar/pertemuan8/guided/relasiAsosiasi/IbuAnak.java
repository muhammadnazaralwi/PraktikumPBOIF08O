/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nazar.pertemuan8.guided.relasiAsosiasi;

/**
 *
 * @author lab
 */
public class IbuAnak {
    public static void main(String[] args) {
        Manusia ibu1 = new Manusia("Linda",18);
        Manusia anak1 = new Manusia("Cece", 20);
        
        Manusia ibu2 = new Manusia("Diana", 40);
        Manusia anak2 = new Manusia("Khoiron",17, ibu2);
        
        System.out.println("=============================\n");
        ibu1.cetak();
        anak1.cetak();
        
        System.out.println("==============================\n");
        ibu1.adopsi(anak1);
        ibu1.cetak();
        anak1.cetak();
        
        System.out.println("===============================\n");
        ibu2.cetak();
        anak2.cetak();
        
    }
}
