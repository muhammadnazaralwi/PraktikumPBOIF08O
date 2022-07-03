/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nazar.pertemuan7.guided.pegawai;

/**
 *
 * @author alwi
 */
public abstract class Pegawai {
    private String namaPeg;
    
    // konstruktor
    public Pegawai(String namaPeg) {
        this.namaPeg = namaPeg;
    }
    
    // method (get) untuk mengembalikan nama pegawai
    public String getNamaPeg() {
        return namaPeg;
    }
    
    // Method abstract ini diwariskan ke semua kelas yang
    // diturunkan dari kelas abstrak ini
    public abstract double income();
    // fungsi abstract, hanya deklarasi, tanpa implementasi
}
