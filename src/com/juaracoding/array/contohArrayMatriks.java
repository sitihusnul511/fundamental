package com.juaracoding.array;

public class contohArrayMatriks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int matriksA[][] = {{11,12,13},{14,15,16},{17,18,19}};
		
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				System.out.print(matriksA[i][j]+" ");
			}
			System.out.println();
		}

	}

}
