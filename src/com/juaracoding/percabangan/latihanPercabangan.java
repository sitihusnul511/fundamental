package com.juaracoding.percabangan;

import java.util.Scanner;

public class latihanPercabangan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Gunakan inputan scanner
//		Toko buku memberikan hadiah kepada customer dg minimal pembelian 100000
		Scanner scan = new Scanner (System.in);
		
		int harga;
		System.out.println("Harga: "); harga = scan.nextInt();
		
		if (harga > 100000) {
			System.out.println("Selamat! Dapat hadiah.");
		} else {
			System.out.println("Belum dapat hadiah");
		}

	}

}
