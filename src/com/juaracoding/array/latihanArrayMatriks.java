package com.juaracoding.array;

import java.util.Scanner;

public class latihanArrayMatriks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Masukkan jumlah array: "); int array1 = scan.nextInt();
		
		int array[] = new int[10];
		
		for (int i=0; i<array.length; i++) {
			System.out.println(array[i]+" ");
		}
		

	}

}
