package pembelajaran5_array_multidimensi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import javax.swing.JOptionPane;

public class Latihan04 {
	public static void main(String[] args) {
		ArrayList<String> field = new ArrayList<>(Arrays.asList("Nama Lengkap", "Alamat", "No Telp"));

		ArrayList<ArrayList<String>> data = new ArrayList<>();
		data.add(new ArrayList<>(Arrays.asList("Septian Cahyadi", "Dramaga cantik residance II, Bogor", "+62 899-9506-210")));
		data.add(new ArrayList<>(Arrays.asList("Isnan Mulia", "Jl.Manunggal, Bogor", "+62 819-3208-0875")));
		data.add(new ArrayList<>(Arrays.asList("Edi Nurachmad", "Taman Cimanggu Permai, Bogor", "+62 856-9380-0384")));

		data.sort(Comparator.comparing(baris -> baris.get(0)));

		String hasil = "";
		for (int i = 0; i < data.size(); i++) {
			for (int j = 0; j < field.size(); j++) {
				hasil += field.get(j) + ": " + data.get(i).get(j) + "\n";
			}
			hasil += "\n";
		}

		JOptionPane.showMessageDialog(null, hasil, "Message", JOptionPane.INFORMATION_MESSAGE);
	}
}
