/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nazar.pertemuan9.guided;

/**
 *
 * @author lab
 */

public class tryCatch1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        try {
            System.out.println(array[11]);
            System.out.println("Ini adalah baris yang terjadi exception");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Terjadi sebuah array index out of bonds");
        }
        System.out.println("Keluar dari catch");
    }
}
