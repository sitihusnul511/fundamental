package com.juaracoding.array;

import java.util.Scanner;

public class contohPenjumlahanMatriks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		
		int baris, kolom;
		System.out.print("Jumlah baris: "); baris = scan.nextInt();
		System.out.print("Jumlah kolom: "); kolom = scan.nextInt();
		
		int matriksA[][] = new int[10][10];
		int matriksB[][] = new int[10][10];
		int hasilMatriks[][] = new int[10][10];
		
		System.out.println("Masukkan Matriks A: ");
		for (int i=0; i<baris; i++) {
			for (int j=0; j<kolom; j++) {
				matriksA[i][j] = scan.nextInt();
			}
		}
		
		System.out.println("Masukkan Matriks B: ");
		for (int i=0; i<baris; i++) {
			for (int j=0; j<kolom; j++) {
				matriksB[i][j] = scan.nextInt();
			}
		}
		
		System.out.println("Hasil Penjumlahan Matriks: ");
		for (int i=0; i<baris; i++) {
			for (int j=0; j<kolom; j++) {
				hasilMatriks[i][j] = matriksA[i][j]+matriksB[i][j];
				System.out.print(hasilMatriks[i][j]+" ");
			}
			System.out.println();
		}

	}

}
