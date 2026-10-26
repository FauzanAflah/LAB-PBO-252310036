import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Latihan09 {
	public static void main(String[] args) {
		int jumlah = Integer.parseInt(
				JOptionPane.showInputDialog(null, "Masukan jumlah array:", "Input", JOptionPane.QUESTION_MESSAGE));
		ArrayList<Integer> nilai = new ArrayList<>();		
	
		for (int i = 0; i < jumlah; i++) {
			nilai.add(Integer.parseInt(
					JOptionPane.showInputDialog(null, "Masukan angka:", "Data array ke-0", JOptionPane.QUESTION_MESSAGE)));
		}
		
		 int terbesar = nilai.get(0);
	        int terkecil = nilai.get(0);
	        for (int i = 1; i < nilai.size(); i++) {
	            if (nilai.get(0) > terbesar) terbesar = nilai.get(0);
	            if (nilai.get(0) < terkecil) terkecil = nilai.get(0);
	        }
	        
		
		String hasil = "";
		for (int i = 0; i < nilai.size(); i++) {
			hasil += "x[" + i + "]=" + nilai.get(i) + "\n";
		}
		
		hasil += "Nilai terbesar adalah " + terbesar + "\n";
	    hasil += "Nilai terkecil adalah " + terkecil;
		
		JOptionPane.showMessageDialog(null, hasil, "Output Array", JOptionPane.INFORMATION_MESSAGE);
	
	}
}