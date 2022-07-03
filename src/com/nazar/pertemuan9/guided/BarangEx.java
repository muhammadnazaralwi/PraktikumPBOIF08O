/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nazar.pertemuan9.guided;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/**
 *
 * @author alwi
 */
public class BarangEx implements Externalizable {
    private String nama;
    private int jumlah;
    
    public BarangEx() { }
    
    public BarangEx(String nm, int jml) {
        nama = nm;
        jumlah = jml;
    }
    
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(nama);
        out.writeInt(jumlah);
    }
    
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        this.nama = (String) in.readObject();
        this.jumlah = in.readInt();
    }
    
    public String toString() {
        return "data barang: " + nama + "\n" + "jumlah barang: " + jumlah;
    }
    
    public static void simpanObject(BarangEx brg) throws IOException {
        FileOutputStream fos = new FileOutputStream("dtEx.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(brg);
        oos.flush();
    }
    
    public static BarangEx bacaObject() throws ClassNotFoundException, IOException {
        FileInputStream fis = new FileInputStream("dtEx.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        return (BarangEx) ois.readObject();
    }
    
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        BarangEx awal = new BarangEx("sepatu", 2);
        simpanObject(awal);
        System.out.println(bacaObject());
    }
}
