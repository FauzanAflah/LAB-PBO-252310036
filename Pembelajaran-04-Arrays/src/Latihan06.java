import javax.swing.JOptionPane;

public class Latihan06 {
	public static void main(String[] args) {
		int[][] A = new int[2][2];
		int[][] B = new int[2][2];
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				A[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai A[" + i + "][" + j + "]:"));
			}
		}
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				B[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai B[" + i + "][" + j + "]:"));
			}
		}
		
		String hasil = "Matrix A:\n";
		for (int i = 0; i < 2; i++) {
			hasil += A[i][0] + " " + A[i][1] + "\n";	
		}
		
		hasil += "\nMatrix B:\n";
		for (int i = 0; i < 2; i++) {
			hasil += B[i][0] + " " + B[i][1] + "\n";
		}
		
		JOptionPane.showMessageDialog(null, hasil, "Output Matrix:", JOptionPane.INFORMATION_MESSAGE);
		
	}
}
