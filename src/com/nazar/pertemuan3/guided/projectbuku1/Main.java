/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nazar.pertemuan3.guided.projectbuku1;

/**
 *
 * @author alwi
 */
public class Main {
    public static void main(String[] args) {
        Buku naruto = new Buku();
        
        naruto.setNilai("Naruto Shippuden", "Oda", 56);
//        naruto.judul = "Naruto Shippuden";
//        naruto.pengarang = "Oda";
//        naruto.halaman = 56;

        naruto.cetakKeLayar();
//        System.out.println("Judul : " + naruto.judul);
//        System.out.println("Judul : " + naruto.pengarang);
//        System.out.println("Judul : " + naruto.halaman);
    }
}
