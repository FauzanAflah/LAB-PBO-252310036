import java.util.Scanner;

public class Latihan04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        do {
            System.out.print("Masukkan nilai faktor (minimal 20): ");
            n = in.nextInt();
            if (n < 20) System.out.println("Nilai tidak boleh kurang dari 20!");
        } while (n < 20);

        String hasil = "";
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) hasil += (hasil.isEmpty() ? "" : ", ") + i;
        }
        System.out.println("ASC: Faktor " + n + " adalah " + hasil);
    }
}