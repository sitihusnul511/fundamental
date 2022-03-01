package com.juaracoding.percabangan;

import java.util.Scanner;

public class donorDarah {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int beratBadan, usia;
		
		System.out.println("Masukkan usia:"); usia = scan.nextInt();
		System.out.println("Masukkan berat badan:"); beratBadan = scan.nextInt();
		
		if (usia > 17) {
			if (beratBadan > 50) {
				System.out.println("Boleh donor darah");
			} else {
				System.out.println("Belum boleh");
			}
		} else {
			System.out.println("Belum boleh");
		}
		
	}

}
