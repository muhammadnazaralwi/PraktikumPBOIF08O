/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nazar.pertemuan7.guided.pegawai;

/**
 *
 * @author alwi
 */
public class Direktur extends Pegawai {
    private double gajiDirektur;
    private double dividenSaham;
    
    // Konstruktor kelas Direktur
    public Direktur(String nama, double gajiDirektur, double dividenSaham) {
        super(nama); // Memanggil konstruktor kelas Pegawai
        setGajiDirektur(gajiDirektur);
        setDividen(dividenSaham);
    }
    
    // Mengset gaji direktur
    public void setGajiDirektur(double gaji) {
        if (gaji > 0) {
            gajiDirektur = gaji;
        } else {
            gajiDirektur = 0;
        }
    }
    
    // Mengset hasil pembagian dividen keuntungan saham
    public void setDividen(double dividen) {
        if (dividen > 0) {
            dividenSaham = dividen;
        } else {
            dividenSaham = 0;
        }
    }
    
    // Method yang mengembalikan nama
    public String nama() {
        return super.getNamaPeg();
    }
    
    // Method yang mengembalikan jabatan
    public String jabatan() {
        return "Direktur";
    }
    
    // Method yang mengembalikan besar gaji direktur
    public double gajiPerBulan() {
        return gajiDirektur;
    }
    
    // Method yang mengembalikan besar dividen saham
    public double labDividen() {
        return dividenSaham;
    }
      
    // Pengimplementasian/ Pendefinisian method abstract dari kelas Pegawai
    // Method ini mengembalikan besar gaji direktur
    @Override
    public double income() {
        return gajiDirektur + dividenSaham;
    }
    
}
