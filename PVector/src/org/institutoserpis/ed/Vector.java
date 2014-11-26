package org.institutoserpis.ed;

public class Vector {

	public static void main(String[] args) {
		
		int i = 0;
		
		int[] v = new int[5]; // [][][][][]
		int[] v2= new int[]{7,8,9,1,2}; // [7][8][9][1][2]
		for (i=0; i<5; i++){
			//System.out.println("**************************");
			//System.out.println("Vector 1");
			//System.out.println("El valor almacenado en la posición "+(i+1)+" del vector es: "+v[i]);
			System.out.println("**************************");
			System.out.println("Vector 2");
			System.out.println("El valor almacenado en la posición "+(i+1)+" del vector es: "+v2[i]);
		}
	}

}
