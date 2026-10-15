import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Latihan10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Students09 member = new Students09();

        System.out.print("Nama member: ");
        member.getFullname(in.nextLine());

        System.out.println("===== TOKO SERBAGUNA IBIK =====");
        System.out.print("Masukan jumlah produk yang dibeli : ");
        int qty = in.nextInt();

        int harga = 6300, total = qty * harga;
        int diskon = qty / 3 * 5;

        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd MMM yyyy (HH:mm)")));
        System.out.println("ITEM\tQTY\tHARGA\tTOTAL");
        System.out.println("ROTI ENAK\t" + qty + "\tRp " + harga + "\tRp " + total);
        System.out.println("Diskon : " + diskon + "%");
        System.out.println("Sub Total : Rp " + (total - total * diskon / 100));
        System.out.println("Member Name : " + member.Fullname);
    }
}