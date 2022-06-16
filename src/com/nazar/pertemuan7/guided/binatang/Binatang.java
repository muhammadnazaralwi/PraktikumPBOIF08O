/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nazar.pertemuan7.guided.binatang;

/**
 *
 * @author Irfan
 */
public abstract class Binatang {
    private String jenis;
    
    public Binatang(String jenis) {
        this.jenis=jenis;
    }
    
    protected abstract void suara();
    
    public String toString(){
        return "seekor" + jenis;
    }
}
