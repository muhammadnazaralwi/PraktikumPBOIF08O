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
public class demoStream1 {
    public static void main(String[] args) {
        byte[] data = new byte[10];
        System.out.print("Masukkan data : ");
        try {
            System.in.read(data);
        } catch (IOException e) {
            System.out.println("Terjadi Exception");
        }
        System.out.print("yang anda ketik adalah : ");
        for (int i = 0; i < data.length; i++) {
            System.out.print((char)data[i]);
        }
    }
}