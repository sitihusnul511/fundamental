package com.juaracoding.main;
import java.util.Scanner;

public class InputData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int qty= scan.nextInt();
		  double harga= scan.nextDouble();
		  float jumlah;
		  jumlah = (float) (harga*qty);
				
		  System.out.println("Qty: "+qty);
		  System.out.println("Harga: "+harga);
		  System.out.println("Jumlah: "+jumlah);
	}

}
