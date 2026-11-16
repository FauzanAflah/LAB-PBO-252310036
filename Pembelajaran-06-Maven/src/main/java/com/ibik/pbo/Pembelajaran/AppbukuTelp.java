package com.ibik.pbo.Pembelajaran;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class AppbukuTelp {
    public static void main(String[] args) {
     
        ArrayList<String> field = new ArrayList<>(Arrays.asList("Nama Lengkap", "Alamat", "No Telp"));

        ArrayList<ArrayList<String>> bukuTelp = new ArrayList<>();

        for (int i = 1; i <= 3; i++) {
            ArrayList<String> kontak = new ArrayList<>();
            for (String f : field) {
                kontak.add(JOptionPane.showInputDialog(null, f + " (kontak ke-" + i + ")",
                        "Form Buku Telepon", JOptionPane.QUESTION_MESSAGE));
            }
            bukuTelp.add(kontak);
        }

        String hasil = "";
        for (ArrayList<String> kontak : bukuTelp) {
            for (int j = 0; j < field.size(); j++) {
                hasil += field.get(j) + " : " + kontak.get(j) + "\n";
            }
            hasil += "\n";
        }
        JOptionPane.showMessageDialog(null, hasil, "Buku Telepon", JOptionPane.INFORMATION_MESSAGE);
    }
}