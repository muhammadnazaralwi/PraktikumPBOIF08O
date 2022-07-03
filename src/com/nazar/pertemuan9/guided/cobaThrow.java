/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nazar.pertemuan9.guided;

/**
 *
 * @author lab
 */
public class cobaThrow {
    public static void methodLain(){
        try {
            throw new ArrayIndexOutOfBoundsException(1);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ini adalah penanganan dalam methodLain");
            throw e;
        }
    }
    
    public static void main(String[] args) {
        try {
            methodLain();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Penanganan exception");
        }
    }
}
