/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nazar.pertemuan4.guided.projectbuku;

import java.util.Scanner;

/**
 *
 * @author alwi
 */
public class Main {
    public static void main(String[] args) {
        Buku novel, fiksi;
        
        novel = new Buku();
        fiksi = new Buku();
        
        System.out.println();
        
        Scanner inputBilangan = new Scanner(System.in);
        Scanner inputKalimat = new Scanner(System.in);
        
        System.out.println("Masukkan judul Buku: ");
        novel.setJudul(inputKalimat.nextLine());
        
        System.out.println("Masukkan pengarang: ");
        novel.setPengarang(inputKalimat.nextLine());
        
        novel.setInfo(0.2f, 45000);
        
        System.out.println("Masukkan jumlah halaman: ");
        novel.setJumlahHalaman(inputBilangan.nextInt());
        
        novel.cetak();
        
        System.out.println();
        
        System.out.println("Masukkan judul Buku: ");
        fiksi.setJudul(inputKalimat.nextLine());
        
        System.out.println("Masukkan pengarang: ");
        fiksi.setPengarang(inputKalimat.nextLine());
        
        fiksi.setInfo(79000);
        
        System.out.println("Masukkan jumlah halaman: ");
        fiksi.setJumlahHalaman(inputBilangan.nextInt());
        
        fiksi.cetak();
    }
}
