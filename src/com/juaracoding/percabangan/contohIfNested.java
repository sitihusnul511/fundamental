package com.juaracoding.percabangan;

public class contohIfNested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String gender = "p";
		int usia = 50;
		
		if (gender.equalsIgnoreCase("L")) {
			if (usia > 6) {
				System.out.println("Gender: "+gender);
				System.out.println("Usia: "+usia);
				System.out.println("Harus vaksin");
			} else {
				System.out.println("Gender: "+gender);
				System.out.println("Usia: "+usia);
				System.out.println("Belum boleh vaksin");
			}
		} else if (gender.equalsIgnoreCase("P")){
			if (usia > 6) {
				System.out.println("Gender: "+gender);
				System.out.println("Usia: "+usia);
				System.out.println("Harus vaksin");
			} else {
				System.out.println("Gender: "+gender);
				System.out.println("Usia: "+usia);
				System.out.println("Belum boleh vaksin");
			}

	}
	}
}


