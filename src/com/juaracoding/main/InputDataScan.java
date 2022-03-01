package com.juaracoding.main;
import java.util.Scanner;

public class InputDataScan {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String nama, alamat;
		
//		Inputan
		System.out.print("Nama : "); nama = scan.next();
		System.out.print("Alamat : "); alamat = scan.next();
		
//		Cetak
		System.out.println("              ");
		System.out.println("Nama : "+nama); 
		System.out.println("Alamat : "+alamat);
		
	}

}
