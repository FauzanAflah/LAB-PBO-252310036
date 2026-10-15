import java.util.Scanner;

public class Latihan07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nama lengkap: ");
        String nama = in.nextLine();
        System.out.println(nama + " => " + nama.replaceAll("[AIUEOaiueo]", "X"));
    }
}