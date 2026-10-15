package Praktikum1;

import java.util.Scanner;

public class Latihan1 {
	public static void main(String[] args) {
		System.out.println("Aplikasi penghitung volume kubus");
		Kubus kubus = new Kubus();
		System.out.println("Masukkan sisi kubus:");
		Scanner scanner = new Scanner (System.in);
		int sisi = scanner.nextInt();
		kubus.sisi = sisi;	
		
		int volume = kubus.hitungVolume();
		System.out.print("Volume dari kubus:"+volume);
		System.out.println("Hellow World");
	}
}
