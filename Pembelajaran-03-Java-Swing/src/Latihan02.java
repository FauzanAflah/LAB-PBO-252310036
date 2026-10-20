import javax.swing.JOptionPane;

public class Latihan02 {
    public static void main(String[] args) {

        String nama = JOptionPane.showInputDialog("Masukkan Fullname:");
        int usia = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Usia:"));
        String alamat = JOptionPane.showInputDialog("Masukkan Alamat:");

        App_Biodata b = new App_Biodata();
        b.simpan(nama, usia, alamat);

        JOptionPane.showMessageDialog(null,
            "Fullname : " + b.fullname +
            "\nUsia     : " + b.usia + " tahun" +
            "\nAlamat   : " + b.alamat,
            "Data Biodata", JOptionPane.INFORMATION_MESSAGE);
    }
}