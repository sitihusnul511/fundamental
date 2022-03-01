package com.juaracoding.perulangan;

import java.util.Scanner;

public class latihanForBintang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int alas, tinggi;
		System.out.print("Masukkan alas: "); alas = scan.nextInt();
		System.out.print("Masukkan tinggi: "); tinggi = scan.nextInt();
		
		for (int i=2; i<=alas; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
				

	}

}
