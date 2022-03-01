package com.juaracoding.perulangan;

public class latihanBintang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i=1; i<8; i++) {
			for (int j=i; j<=8-i; j++) {
			if (j % 2 == 0) {
				System.out.print("*");
			} else {
				System.out.print (j);
			}	
		}
			
			System.out.println();
		}
	}

}
