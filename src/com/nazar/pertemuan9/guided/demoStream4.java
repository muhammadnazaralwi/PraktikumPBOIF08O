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
public class demoStream4 {
    public static void main(String[] args) {
        byte data;
        String namaFile = "demo.txt";
        FileOutputStream fout = null;
        try {
            fout = new FileOutputStream(namaFile, true);
            System.out.print("Ketik : ");
            data = (byte)System.in.read();
            while (data!=(byte)'\n') {
                fout.write(data);
                data = (byte)System.in.read();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File"+namaFile+"Tidak dapat dibuat");
        } catch (IOException e){
            System.out.println("Terjadi Exception");
        }
        
        finally {
            if (fout!=null){
                try {
                    fout.close();
                } catch (IOException e) {
                    System.out.println("Terjadi Exception");
                }
            }
        }
    }
}
