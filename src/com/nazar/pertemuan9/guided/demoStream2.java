/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nazar.pertemuan9.guided;

import java.io.IOException;

/**
 *
 * @author lab
 */
public class demoStream2 {
    public static void main(String[] args) {
        byte[] data = new byte[10];
        int panjang = 0;
        System.out.print("Masukkan data : ");
        try {
            panjang = System.in.read(data);
            System.out.print("yang anda ketik : ");
            System.out.write(data);
            System.out.print("Panjang karakter : " + panjang);
            System.out.print("index ke -1 sebanyak 3 : ");
            System.out.write(data,1,3);
        } catch (IOException e) {
            System.out.println("Terjadi exception");
        }
    }
}
