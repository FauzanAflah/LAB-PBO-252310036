import java.util.Scanner;

public class Latihan10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long pin =252310036; 
        long saldo = 0;
        long input;
        char lanjut;

        do {
            System.out.print("Masukkan PIN: ");
            input = in.nextLong();
        } while (input != pin);

        do {
            System.out.println("1. Lihat Saldo");
            System.out.println("2. Setor Tunai");
            System.out.println("3. Tarik Tunai");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            int menu = in.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Saldo anda: " + saldo);
                    break;
                case 2:
                    System.out.print("Masukkan nominal setor: ");
                    saldo += in.nextLong();
                    System.out.println("Saldo anda: " + saldo);
                    break;
                case 3:
                    System.out.print("Masukkan nominal tarik: ");
                    long tarik = in.nextLong();
                    if (tarik <= saldo) {
                        saldo -= tarik;
                        System.out.println("Saldo anda: " + saldo);
                    } else {
                        System.out.println("Saldo tidak cukup");
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Menu tidak valid");
            }

            System.out.print("Kembali ke menu? (y/n): ");
            lanjut = in.next().charAt(0);
        } while (lanjut == 'y' || lanjut == 'Y');
    }
}