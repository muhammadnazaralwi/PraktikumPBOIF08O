/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nazar.pertemuan9.guided;
import java.io.*;

/**
 *
 * @author lab
 */
public class demoStream3 {
    public static void main(String[] args) throws IOException {
        char data;
        String str="";
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Ketik : ");
        data = (char) buff.read();
        while (data!='\n') {
            str+=data;
            data = (char) buff.read();
        }
        System.out.println("Yang diketik : " + str);
        System.out.println("Program telah selesai");
    }
}
