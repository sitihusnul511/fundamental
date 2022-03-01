package com.juaracoding.array;

public class contohArray2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int angka [][] = new int[3][3];
		
		angka [0][0]=1;
		angka [0][1]=2;
		angka [0][2]=3;
		angka [1][0]=4;
		angka [1][1]=5;
		angka [1][2]=6;
		angka [2][0]=7;
		angka [2][1]=8;
		angka [2][2]=9;
		
		System.out.println(angka[0][2]);
		
		System.out.println();
		
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				System.out.print(angka[i][j]+" ");
			}
			System.out.println();
		}

	}

}
