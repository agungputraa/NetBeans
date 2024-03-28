/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package helloworld;
import java.util.Scanner;

/**
 *
 * @author LAB F
 */


public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);
        
        // Meminta pengguna untuk memasukkan input
        System.out.print("Masukkan nama Anda: ");
        
        // Membaca input pengguna
        int nama = scanner.nextInt();
        
        
        
        // Menampilkan pesan dengan input dari pengguna
        System.out.println("Halo, " + nama + "! Selamat datang di program HelloWorld!");
    }
}



