/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nazar.pertemuan3.guided.projectbuku1;

/**
 *
 * @author alwi
 */
public class Buku {
    private String judul;
    private String pengarang;
    private int halaman;
    
    public Buku() {
       
    }
    
    public void setNilai(String judul, 
            String pengarang, 
            int halaman) {
        // `this` merupakan objek dari kelas itu sendiri
        this.judul = judul;
        this.pengarang = pengarang;
        this.halaman = halaman;
    }
    
    public void cetakKeLayar() {
        System.out.println("Judul : " + this.judul);
        System.out.println("Pengarang : " + this.pengarang);
        System.out.println("Halaman: " + this.halaman);
    }
}
