import javax.swing.JOptionPane;

public class Latihan04 {

    static boolean keluar() {
        return JOptionPane.showConfirmDialog(null, "Apakah anda ingin keluar ?",
                "Konfirmasi", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
    }

    static String input(String pesan) {
        while (true) {
            String s = JOptionPane.showInputDialog(pesan);
            if (s != null) return s.trim();
            if (keluar()) System.exit(0);
        }
    }

    static void error(String pesan) {
        JOptionPane.showMessageDialog(null, pesan, "Error", JOptionPane.ERROR_MESSAGE);
    }

    public static void main(String[] args) {
        while (true) {

            String nama = input("Masukkan Fullname:");
            while (nama.isEmpty()) {
                error("Field fullname tidak boleh kosong");
                nama = input("Masukkan Fullname:");
            }

            String usia = input("Masukkan Usia:");
            while (usia.isEmpty() || !usia.matches("\\d+")) {
                error(usia.isEmpty() ? "Field usia tidak boleh kosong" : "Isian usia harus angka");
                usia = input("Masukkan Usia:");
            }

            String alamat = input("Masukkan Alamat:");
            while (alamat.length() < 10) {
                if (alamat.isEmpty())
                    error("Field alamat tidak boleh kosong");
                else
                    JOptionPane.showMessageDialog(null, "Masukan alamat minimum 10 karakter",
                            "Warning", JOptionPane.WARNING_MESSAGE);
                alamat = input("Masukkan Alamat:");
            }

            App_Biodata b = new App_Biodata();
            b.simpan(nama, Integer.parseInt(usia), alamat);

            JOptionPane.showMessageDialog(null,
                    "Fullname : " + b.fullname +
                    "\nUsia     : " + b.usia + " tahun" +
                    "\nAlamat   : " + b.alamat,
                    "Data Biodata", JOptionPane.INFORMATION_MESSAGE);

            if (keluar()) break;
        }
    }
}