/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nazar.pertemuan9.guided;

/**
 *
 * @author lab
 */
public class tryCatch2 {
    public static void main(String[] args) {
        try {
            int x = 0;
            int y = 10/x;
            int[] array = {10,11};
            y = array[x];
            System.out.println("Tidak terjadi exception");
        } catch (ArithmeticException e) {
            System.out.println("Terjadi exception karena dibagi dengan nol");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Terjadi error, karena index keluar dari batas");
        }
        System.out.println("Keluar dari block try catch");
    }
}