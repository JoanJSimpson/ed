package org.institutoserpis.ed;
import java.util.Scanner;
public class Rectangulo {
	
	

	public static void main(String[] args) {


		int base;
		int altura;
		int perimetro;
		int area;
		int x;
		int y;
		do{
			//System.out.print("\033[H\033[2J"); //junto con el comando siguiente
			//System.out.flush(); //sirve para limpiar la pantalla
			Scanner lector = new Scanner(System.in);
			/*aunque el ejercicio pide para unas medidas determinadas, con esto se puede hacer para cualquier
			rectángulo*/
			System.out.print("Introduce la base del rectangulo: ");
			base = lector.nextInt();
			System.out.print("Introduce la altura del rectangulo: ");
			altura = lector.nextInt();
		}while(base<=0 || altura<=0); //se obliga a insertar numeros mayores que 0
		perimetro = 2*(base+altura);
		area = base * altura;
		//los siguientes comandos sirven para dibujar el rectangulo
		System.out.print("╔");
		for (x=2;x<base*2;x++){
			System.out.print("═");
		}
		System.out.println("╗");
		for (x=2;x<altura;x++){
			System.out.print("║");
			
			for (y=2;y<base*2;y++){
				System.out.print(" ");
			}
			if (x==altura/2){
				System.out.print("║");
				System.out.print("Altura= "+altura);
			}else{
				System.out.println("║");
			}
			
			
		}
		System.out.print("╚");
		for (x=2;x<base*2;x++){
			System.out.print("═");
		}
		System.out.println("╝");
		System.out.println("Base= "+base);
		//sacamos por pantalla la base, la altura, el perimetro y el area
		System.out.println("\nEl rectangulo de base: "+ base + " y de altura: "+ altura + " tiene un perimetro de: "+ perimetro +"\nY un area de: "+ area +".");
		

		
		}
	Scanner.close();

	}


