import java.util.Scanner;

public class Resto {
	private long Harga;
	
	public void chooseMenu() {
		Scanner in = new Scanner(System.in);
		 	System.out.println("Menu Sarapan:");
	        System.out.println("1. Nasi Goreng");
	        System.out.println("2. Bubur Ayam");
	        System.out.println("3. Soto Ayam");
	        System.out.print("Pilih menu: ");
	        int pilih = in.nextInt();
		
	        long harga = getPrices(pilih);
	        if (harga == 0)
	        	System.out.println("Maaf menu yang anda masukan salah.");
	        else
	        	System.out.println("Ada memesan menu " + pilih + " dengan harga Rp " + harga + ",-");   
	}

	private long getPrices(int pilih) {
		switch (pilih) {
			case 1: Harga = 22000; break;
			case 2: Harga = 15000; break;
			case 3: Harga = 25000; break;
			default: Harga = 0;		
		}
		return Harga;
	}
}
