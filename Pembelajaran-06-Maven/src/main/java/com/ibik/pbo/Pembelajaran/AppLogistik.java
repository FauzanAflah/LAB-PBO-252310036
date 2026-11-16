package com.ibik.pbo.Pembelajaran;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AppLogistik {
    static String in(String s) { return JOptionPane.showInputDialog(s); }

    public static void main(String[] args) {
        ArrayList<String> data = new ArrayList<>();
        String m;
        while ((m = in("MENU\n1. Kirim Barang\n2. Lacak Resi\n3. Keluar")) != null && !m.equals("3")) {
            if (m.equals("1")) {
                String nama = in("Nama pengirim:"), tujuan = in("Kota tujuan:");
                int berat = Integer.parseInt(in("Berat (gram):")), jarak = Integer.parseInt(in("Jarak (km):"));
                int biaya = (berat + 99) / 100 * 5000 + (jarak + 9) / 10 * 8000;
                String resi = "XYZ" + (data.size() + 1);
                data.add(resi + "|Pengirim: " + nama + "\nTujuan: " + tujuan + "\nBerat: " + berat + " gr\nJarak: "
                        + jarak + " km\nBiaya: Rp " + biaya + "\nStatus: Sedang dikirim");
                JOptionPane.showMessageDialog(null, "No. Resi: " + resi + "\nBiaya: Rp " + biaya);
            } else if (m.equals("2")) {
                String resi = in("Nomor resi:"), hasil = "Resi tidak ditemukan";
                for (String d : data)
                    if (d.startsWith(resi + "|")) hasil = d.substring(d.indexOf('|') + 1);
                JOptionPane.showMessageDialog(null, hasil);
            }
        }
    }
}