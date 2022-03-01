package com.juaracoding.perulangan;

public class contohIfDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=1;
		
		while (x<10) {
			if (x % 2 == 0) {
				System.out.print("* ");
			} else {
				System.out.print(x + " ");
			}
			x++;
		}

	}

}
