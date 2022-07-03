/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nazar.pertemuan7.guided.pegawai;

import java.text.DecimalFormat;

/**
 *
 * @author alwi
 */
public class Test {
    public static void main(String[] args) {
        Pegawai pgw;
        
        // Membuat objek referensi dari kelas abstrak Pegawai
        String output = "";
        Direktur d = new Direktur("Wahyu", 12_000_000.00, 7_500_000.00);
        DecimalFormat digitPresisi = new DecimalFormat("0.00");
        pgw = d;
        
        /*Objek referensi dari kelas abstrak pegawai (pgw) merefer objek
        dari kelas Direktur (d) yang diturunkan dari kelas abstrak Pegawai
        */
        System.out.println("\nDEMO INHERITANCE, ENCAPSULATION, POLYMORPHISM");
        System.out.println("----------------------------------------------\n");
        
        // Mencetak informasi Direktur ke console
        System.out.println("Nama    : " + d.nama() + "\n" 
                + "Jabatan  : " + d.jabatan() + "\n" 
                + "Gaji : " + digitPresisi.format(d.gajiPerBulan()) + "\n" 
                + "Dividen  : " + digitPresisi.format(d.labDividen()) + "\n"
                + "Total    : " + digitPresisi.format(d.income()) + "\n");
        System.exit(0);
    }
}
