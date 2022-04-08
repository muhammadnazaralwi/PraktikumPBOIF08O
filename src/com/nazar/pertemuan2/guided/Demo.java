/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nazar.pertemuan2.guided;

/**
 *
 * @author alwi
 */
public class Demo {
    public static void main(String[] args) {
        // Untuk mencetak output
        System.out.println("Hello world");
        System.out.println("Hello ");
        System.out.println("World");

        /**
         cara deklarasi variabel:
         type namaVariabel
        **/

        // deklarasi
        int a;
        float b;
        double c;
        char d;
        boolean e;
        
        String nama;

        // assignment
        a = 5;
        b = 0.5f;
        c = 0.5;
        d = 'r';
        e = false;
        
        nama = "Muhammad Nazar Alwi";

        // operasi aritmatika
        int x, y;
        int hasilPenjumlahan, hasilPengurangan, hasilPerkalian, hasilPembagian1;
        float hasilPembagian2;

        x = 10;
        y = 5;
        
        hasilPenjumlahan = x + y;
        hasilPengurangan = x - y;
        hasilPerkalian = x * y;
        hasilPembagian1 = x / y;
        hasilPembagian2 = (float) y / (float) x; // casting -> mengubah tipe data

        System.out.println("Hasil penjumlahan x dan y: " + hasilPenjumlahan);
        System.out.println("Hasil pengurangan x dan y: " + hasilPengurangan);
        System.out.println("Hasil perkalian x dan y: " + hasilPerkalian);
        System.out.println("Hasil pembagian x dan y: " + hasilPembagian1);
        System.out.println("Hasil pembagian y dan x: " + hasilPembagian2);
        System.out.println("Nama: " + nama);
    }
}
