package com.juaracoding.logikapemprograman;

import java.util.Scanner;

public class cobaMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Masukkan angka: "); Double a = scan.nextDouble();
		
		Double sqrt = Math.sqrt(a);
		System.out.println("Akar kuadrat dari "+ a +" adalah "+sqrt);
		
		Double pow = Math.pow(a, 2);
		System.out.println("Pangkat 2 dari "+ a +" adalah "+pow);
		

	}

}
