/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nazar.pertemuan3.guided.projectbuku2;

/**
 *
 * @author alwi
 */
public class Main {
        public static void main(String[] args) {
        // Buat object `naruto`
        Buku naruto = new Buku("Naruto Shippuden",
                "Oda",
                56);
        
        // Buat object `onePiece`
        Buku onePiece = new Buku("One Piece");
        
        // Buat object `nothing`
        Buku nothing = new Buku();
        
        // Panggil fungsi `cetakKeLayar()`
        // melalui object
        naruto.cetakKeLayar();
        onePiece.cetakKeLayar();
        nothing.cetakKeLayar();
    }
}
