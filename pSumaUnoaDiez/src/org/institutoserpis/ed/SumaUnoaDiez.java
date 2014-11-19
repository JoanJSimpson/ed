package org.institutoserpis.ed;

import java.util.Scanner;

public class SumaUnoaDiez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int primer=0;
		int segundo=0;
		int x;
		int suma=0;
		Scanner lector = new Scanner(System.in);
		do{
			System.out.print("Introduce el primer numero: ");
			primer = lector.nextInt();
			System.out.print("Introduce el segundo numero: ");
			segundo = lector.nextInt();
		}while(primer>=segundo);
		
		for(x=primer;x<=segundo;x++){
			suma=suma +x;
			System.out.println(x+" + "+suma+ " = "+(suma+x));
		}
		System.out.print("La suma total es: "+suma);
	}

}
