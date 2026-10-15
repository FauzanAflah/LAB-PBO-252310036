import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Latihan04 {

    static String rp(int angka) {
        return String.format(Locale.forLanguageTag("id-ID"), "Rp %,d", angka);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String garis1 = "=================================================";
        String garis2 = "-------------------------------------------------";

        System.out.println(garis1);
        System.out.println("               TOKO SERBAGUNA IBIK");
        System.out.println(garis1);
        System.out.print("Masukan jumlah produk yang dibeli : ");
        int qty = in.nextInt();

        int harga = 6300;
        int total = qty * harga;
        int diskon = qty / 3 * 5;                    
        int subTotal = total - (total * diskon / 100);

        String waktu = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("dd MMM yyyy (HH:mm)", Locale.ENGLISH));

        System.out.println();
        System.out.println(waktu);
        System.out.printf("%-14s %4s %14s %14s%n", "ITEM", "QTY", "HARGA", "TOTAL");
        System.out.println(garis1);
        System.out.printf("%-14s %4d %14s %14s%n", "ROTI ENAK", qty, rp(harga), rp(total));
        System.out.println(garis2);
        System.out.printf("%-10s: %d%%%n", "Diskon", diskon);
        System.out.printf("%-10s: %s%n", "Sub Total", rp(subTotal));
        System.out.println(garis1);
    }
}