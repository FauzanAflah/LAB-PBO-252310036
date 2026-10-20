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
	
    public static void main(String[] args) {
            int menu;
            int confirm = 0;

            do {
                menu = Integer.parseInt(JOptionPane.showInputDialog(
                    null,
                    "1. Simpan buku\n2. Hapus buku\n3. Tampilkan buku\n4. Keluar",
                    "Menu Inventory Buku",
                    JOptionPane.QUESTION_MESSAGE
                ));

                if (menu == 1) simpan();
                else if (menu == 2) hapus();
                else if (menu == 3) tampilBuku();
                else if (menu == 4) {
                    confirm = JOptionPane.showConfirmDialog(
                        null,
                        "Apakah anda ingin keluar ?",
                        "Confirmation",
                        JOptionPane.YES_NO_OPTION
                    );
                }
            } while (menu != 4 || confirm != 0);

            JOptionPane.showMessageDialog(
                null,
                "Terima kasih, program selesai.",
                "Information",
                JOptionPane.INFORMATION_MESSAGE
            );
        }
	}  
        

