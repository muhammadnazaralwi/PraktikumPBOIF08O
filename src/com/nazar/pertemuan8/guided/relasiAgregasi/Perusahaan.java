/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nazar.pertemuan8.guided.relasiAgregasi;

/**
 *
 * @author lab
 */
public class Perusahaan {
    private String namaPerusahaan;
    private Pegawai Pegawai[];
    private int counter;
    
    public Perusahaan(String namaPerusahaan){
        this.namaPerusahaan = namaPerusahaan;
        counter=0;
        Pegawai = new Pegawai[3];
    }
    
    public void insertPegawai(Pegawai p){
        Pegawai[counter]=p;
        counter++;
    }
    
    public void tampilPerusahaan(){
        System.out.println("Perusahaan "+ namaPerusahaan + "\nMemiliki pegawai : ");
        for (int i = 0; i < counter; i++) {
            Pegawai[i].tampilPegawai();
        }
        
    }
}
