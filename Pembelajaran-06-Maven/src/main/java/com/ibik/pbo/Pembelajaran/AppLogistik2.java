package com.ibik.pbo.Pembelajaran;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AppLogistik2 {
    static ArrayList<String> data = new ArrayList<>();

    static void error(String s) {
        JOptionPane.showMessageDialog(null, s, "Error Info", JOptionPane.ERROR_MESSAGE);
    }

    static String in(String s) {
        String r = JOptionPane.showInputDialog(s);
        if (r != null) return r.trim();
        if (JOptionPane.showConfirmDialog(null, "Apakah anda ingin keluar ?", "Konfirmasi",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) System.exit(0);
        throw new IllegalStateException();
    }

    static int angka(String s) {
        while (true) {
            try { return Integer.parseInt(in(s)); }
            catch (NumberFormatException e) { error("Masukan angka"); }
        }
    }

    public static void main(String[] args) {
        int m = 0;
        while (m != 3) {
            try {
                m = angka("MENU\n1. Kirim Barang\n2. Lacak Resi\n3. Keluar");
                if (m == 1) {
                    String nama = in("Nama pengirim:"), tujuan = in("Kota tujuan:");
                    int berat = angka("Berat (gram):"), jarak = angka("Jarak (km):");
                    int biaya = (berat + 99) / 100 * 5000 + (jarak + 9) / 10 * 8000;
                    String resi = "XYZ" + (data.size() + 1);
                    data.add(resi + "|Pengirim: " + nama + "\nTujuan: " + tujuan + "\nBerat: " + berat
                            + " gr\nJarak: " + jarak + " km\nBiaya: Rp " + biaya + "\nStatus: Sedang dikirim");
                    JOptionPane.showMessageDialog(null, "No. Resi: " + resi + "\nBiaya: Rp " + biaya);
                } else if (m == 2) {
                    if (data.isEmpty()) { error("Belum ada pesanan. Silakan input pesanan terlebih dahulu"); continue; }
                    String resi = in("Nomor resi:"), hasil = "";
                    for (String d : data)
                        if (d.startsWith(resi + "|")) hasil = d.substring(d.indexOf('|') + 1);
                    if (hasil.isEmpty()) error("Data tidak ditemukan");
                    else JOptionPane.showMessageDialog(null, hasil);
                } else if (m != 3) error("Pilihan tidak tersedia");
            } catch (IllegalStateException e) { } 
        }
    }
}