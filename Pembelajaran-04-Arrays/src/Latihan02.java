public class Latihan02 {
	public static void main(String[] args) {
		int[] angka = new int[5];
		for (int i = 0; i < angka.length; i++) {
			angka[i] = i + 1;

		}
		
		for (int i = 0; i < angka.length; i++) {
			System.out.println("Nilai array index ke-" + i + " = " + angka[i]);
			
		}
	}
	
}
