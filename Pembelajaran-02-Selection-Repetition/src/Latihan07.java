import java.util.Scanner;

public class Latihan07 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Resto r = new Resto();
		char kembali;
		
		do {
			r.chooseMenu();
			System.out.println("Apakah anda akan memesan kembali? (y/n");
			kembali = in.next().charAt(0);

		}while (kembali == 'y' || kembali == 'Y');
		
		System.out.println("Terima kasih telah memesan.");
	}
	    
}
