import javax.swing.JOptionPane;

public class Latihan03 {

    static boolean kosong(String s) {
        return s == null || s.trim().isEmpty();
    }

    static void error(String pesan) {
        JOptionPane.showMessageDialog(null, pesan, "Error", JOptionPane.ERROR_MESSAGE);
    }

    public static void main(String[] args) {
        String nama = JOptionPane.showInputDialog("Masukkan Fullname:");
        if (kosong(nama)) {
            error("Field fullname tidak boleh kosong");
            return;
        }

        String usiaStr = JOptionPane.showInputDialog("Masukkan Usia:");
        if (kosong(usiaStr)) {
            error("Field usia tidak boleh kosong");
            return;
        }
        if (!usiaStr.trim().matches("\\d+")) {
            error("Isian usia harus angka");
            return;
        }

        String alamat = JOptionPane.showInputDialog("Masukkan Alamat:");
        if (kosong(alamat)) {
            error("Field alamat tidak boleh kosong");
            return;
        }
        if (alamat.trim().length() < 10) {
            JOptionPane.showMessageDialog(null, "Masukan alamat minimum 10 karakter",
                    "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }


        App_Biodata b = new App_Biodata();
        b.simpan(nama.trim(), Integer.parseInt(usiaStr.trim()), alamat.trim());

        JOptionPane.showMessageDialog(null,
                "Fullname : " + b.fullname +
                "\nUsia     : " + b.usia + " tahun" +
                "\nAlamat   : " + b.alamat,
                "Data Biodata", JOptionPane.INFORMATION_MESSAGE);
    }
}