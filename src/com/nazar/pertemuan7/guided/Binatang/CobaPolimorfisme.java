/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nazar.pertemuan7.guided.Binatang;

import java.util.Random;

/**
 *
 * @author Irfan
 */
public class CobaPolimorfisme {
    public static void main(String[] args) {
        Binatang[] peliharaanku = {
            new Burung("Hantu"),
            new Kucing("Persia"),
            new Anjing("Buldog"),
            new Kambing("Etawa")
        };
        
        Binatang kesayangan;
        Random pilihan = new Random();
        kesayangan = peliharaanku[pilihan.nextInt(peliharaanku.length)];
        System.out.println("Binatang Kesayangan Ku : " + kesayangan);
        
        System.out.print("Suarannya : ");
        kesayangan.suara();
    }
}