/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helloworld;

/**
 *
 * @author LAB F
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class coba1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // Membuat objek BufferedReader untuk membaca input dari pengguna
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        String nama;
        String nim;
        int tinggi;
        
        System.out.print("Masukan Nama Anda:");
        nama = reader.readLine();
        System.out.print("Masukan Nim Anda:");
        nim = reader.readLine();
        
        System.out.print("Masukan Tinggi Badan Anda:");
        tinggi = Integer.parseInt(reader.readLine());
        
        System.out.println("Hello " + nama+ " Nim anda adalah " + nim + "Tinggi badan anda:" + tinggi + "cm");
    }
}
