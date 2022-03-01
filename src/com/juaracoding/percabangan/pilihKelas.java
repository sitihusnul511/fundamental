package com.juaracoding.percabangan;
import java.util.Scanner;

public class pilihKelas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);

		String kelas;
		int hari;
		
		System.out.println("Silahkan pilih kelas : VIP, 1, 2, 3");
		System.out.println("Masukkan Pilihan Kelas:"); kelas = scan.next();
		System.out.println("Masukkan Jumlah Hari:"); hari = scan.nextInt();
		
		
		if (kelas.equalsIgnoreCase("VIP")) {
		System.out.println("Ket : 1 ruangan, 1 orang");
		System.out.println("Tagihan : "+hari*200000);
		}
		
		else if(kelas.equalsIgnoreCase("1")) {
			System.out.println("Ket : 1 ruangan, 2 orang");
			System.out.println("Tagihan : "+hari*150000);
			}
		
		else if(kelas.equalsIgnoreCase("2")) {
			System.out.println("Ket : 1 ruangan, 4 orang");
			System.out.println("Tagihan : "+hari*90000);
			}
		
		else if(kelas.equalsIgnoreCase("3")) {
			System.out.println("Ket : 1 ruangan, 6 orang");
			System.out.println("Tagihan : "+hari*50000);
			}
		else {
			System.out.println("Kelas tidak terdaftar");
		}
	} 

}
