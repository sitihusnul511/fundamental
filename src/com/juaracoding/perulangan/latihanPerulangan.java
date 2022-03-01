package com.juaracoding.perulangan;

import java.util.Scanner;

public class latihanPerulangan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int angkaPertama =scan.nextInt();
		int angkaKedua =scan.nextInt();
		
		for (int i=angkaPertama; i>=angkaKedua; i=i-2) {
			System.out.print(i+" ");
		}

	}

}
