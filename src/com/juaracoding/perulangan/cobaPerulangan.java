package com.juaracoding.perulangan;

public class cobaPerulangan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//cetak bilangan genap
		for (int i=2; i<=10; i=i+2) {
			System.out.print(i+" ");
		}

		System.out.println();
		
		//cetak bilangan ganjil
		for (int i=1; i<=10; i=i+2) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		int nilaiAwal, nilaiAkhir;
		nilaiAwal = 5;
		nilaiAkhir = 1;
		
		for (int i=nilaiAwal; i>=nilaiAkhir; i--) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		int [] bilangan = {10, 20, 30, 40, 50};
		for (int i : bilangan) {
			System.out.print(i+" ");
		}
	}

}
