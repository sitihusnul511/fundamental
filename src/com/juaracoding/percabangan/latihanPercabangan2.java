package com.juaracoding.percabangan;

import java.util.Scanner;

public class latihanPercabangan2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		String huruf;
		System.out.println("Huruf: "); huruf = scan.nextLine();
		
		if (huruf.equalsIgnoreCase("A")) {
			System.out.println("Huruf vokal");

		} else if (huruf.equalsIgnoreCase("I")){
			System.out.println("Huruf vokal");
			
		} else if (huruf.equalsIgnoreCase("U")){
			System.out.println("Huruf vokal");
		
			
		} else if (huruf.equalsIgnoreCase("E")){
			System.out.println("Huruf vokal");
			
		} else if (huruf.equalsIgnoreCase("O")){
			System.out.println("Huruf vokal");
			
		} else {
			System.out.println("Huruf konsonan");
	}
	}
}
