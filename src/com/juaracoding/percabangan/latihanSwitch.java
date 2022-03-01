package com.juaracoding.percabangan;

import java.util.Scanner;

public class latihanSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);

		String kelas;
		int hari;
		
		System.out.println("Silahkan pilih kelas : VIP, 1, 2, 3");
		System.out.println("Masukkan Pilihan Kelas:"); kelas = scan.next();
		System.out.println("Masukkan Jumlah Hari:"); hari = scan.nextInt();
		
		switch (kelas) {
			case "VIP" :
				System.out.println("1 ruangan 1 orang");
				System.out.println("Tagihan : "+hari*200000);
				break;
				
			case "1" :
				System.out.println("1 ruangan, 2 orang");
				System.out.println("Tagihan : "+hari*150000);
				break;
				
			case "2" :
				System.out.println("1 ruangan, 4 orang");
				System.out.println("Tagihan : "+hari*90000);
				break;
			
			case "3" :
				System.out.println("1 ruangan, 6 orang");
				System.out.println("Tagihan : "+hari*50000);
				break;
			
				default:
				System.out.println("Kelas tidak ditemukan");
		}

	}

}
