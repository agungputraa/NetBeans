/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helloworld;

import javax.swing.JOptionPane;
import java.io.IOException;

public class coba2 {

    public static void main(String[] args) throws IOException {

        String nama = JOptionPane.showInputDialog("Masukkan nama Anda:");
        String nim = JOptionPane.showInputDialog("Masukkan nim Anda:");
        int tinggi = Integer.parseInt(JOptionPane.showInputDialog("Masukkan tinggi badan Anda:"));

        JOptionPane.showMessageDialog(null, "Hello " + nama + " Nim anda adalah " + nim + " Tinggi anda: " + tinggi + "cm");
    }
}
