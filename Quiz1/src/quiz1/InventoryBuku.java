package quiz1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class InventoryBuku {
	static ArrayList<String> buku = new ArrayList<>();
		
	static void simpan() {
        String judul = JOptionPane.showInputDialog(
                null,
                "Masukkan judul buku:",
                "Simpan Buku",
                JOptionPane.QUESTION_MESSAGE
            );
            buku.add(judul);
        }
	
	static void hapus() {
		System.out.println("Index buku yang dihapus: ");
		int index =  Integer.parseInt(JOptionPane.showInputDialog(
				null,
				"Masukkan index buku yang dihapus: ",
				"Hapus Buku",
				JOptionPane.QUESTION_MESSAGE
				));
		buku.remove(index);		
	}
	
	static void tampilBuku() {
		System.out.println("Tampilkan buku: ");
		String output = "";
        for (int i = 0; i < buku.size(); i++) {
            output += i + ". " + buku.get(i) + "\n";
        }
        JOptionPane.showMessageDialog(null, output, "Data Buku", JOptionPane.INFORMATION_MESSAGE);
        
    }
		
}



