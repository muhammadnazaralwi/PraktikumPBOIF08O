/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nazar.pertemuan9.guided;

/**
 *
 * @author lab
 */
public class demoFinally {
    public static void main(String[] args) {
        int x = 3;
        int[] array = {10,11,12};
        try {
            System.out.println(array[x]);
            System.out.println("Tidak terjadi exeption");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Terjadi exception");
//            System.out.println(array[x-4]);
        } 
        finally {
            System.out.println("Program selesai dijalankan");
        }
    }
}
