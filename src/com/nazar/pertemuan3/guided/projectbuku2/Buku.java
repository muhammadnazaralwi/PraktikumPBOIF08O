/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nazar.pertemuan3.guided.projectbuku2;

/**
 *
 * @author alwi
 */

// Ini ibarat cetakan
public class Buku {
    // Ini attribute
    private String judul;
    private String pengarang;
    private int halaman;
    
    // Ini constructor
    public Buku(String judul,
            String pengarang,
            int halaman) {
       this.judul = judul;
       this.pengarang = pengarang;
       this.halaman = halaman;
    }
    
    // Ini constructor
    public Buku(String judul) {
       this.judul = judul;
       this.pengarang = "Tidak diketahui";
       this.halaman = 0;
    }
    
    // Ini constructor
    public Buku() {
       this.judul = "Tidak diketahui";
       this.pengarang = "Tidak diketahui";
       this.halaman = 0;
    }
    
    // Ini behavior
    public void cetakKeLayar() {
        System.out.println("Judul : " + this.judul);
        System.out.println("Pengarang : " + this.pengarang);
        System.out.println("Halaman: " + this.halaman);
    }
}
