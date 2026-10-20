import java.util.Scanner;

public class Latihan05 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of row: ");
		int n = in.nextInt();
		
		for (int i = 1; i <= 2 * n; i++) {
			int k = (i <= n) ? n - i + 1 : i - n;
			for (int j = 1; j <= 2 * n + 1; j++) {
				if (j <= k || j > 2 * n + 1 - k)
					System.out.print("* ");
				else
					System.out.print("  ");
				
			}
			System.out.println();
		}	
	}
}
