/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nazar.pertemuan8.guided.relasiAgregasi;

/**
 *
 * @author lab
 */
public class Relasi {
    public static void main(String[] args) {
        Perusahaan Per = new Perusahaan("Stark Industries");
        Pegawai pegawai1,pegawai2,pegawai3;
        
        pegawai1 = new Pegawai("A001","Nazar");
        pegawai2 = new Pegawai("A002","Zayyan");
        pegawai3 = new Pegawai("A003","Farhan");
        
        Per.insertPegawai(pegawai1);
        Per.insertPegawai(pegawai2);
        Per.insertPegawai(pegawai3);
        
        System.out.println("");
        
        Per.tampilPerusahaan();
    }
}
