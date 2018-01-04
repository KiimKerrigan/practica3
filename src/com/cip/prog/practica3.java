package com.cip.prog;
import java.util.Scanner;

public class practica3 {

	public static void main(String[] args) {
		
		/* CHAXIRAXI MAR�A CALCINES PADILLA - PR�CTICA 3
		 * Crear un programa en Java que convierta grados Cent�grados a grados Fahrenheit. 
		 * La f�rmula a utilizar es la siguinete:
		 * F = C * (9/5) + 32
		 */
		
		//Se crea el lector
		Scanner lector = new Scanner(System.in);
		try {	
	
			System.out.print("-Conversor de grados C� a Fahrenheit (y viceversa)-\n"
							+ "Introduce �C para convertir a F: ");
			double grados=lector.nextDouble();	
			
	        // de celsius a fahrenheit
	        double fahrenheit=32+((9*grados)/5);
			System.out.println(grados+" �C equivale a "+fahrenheit+" fahrenheit");
			
			System.out.print("----------------------------------\n"
					+		 "Introduce F para convertir a �C: ");
			double fahrenheit2=lector.nextDouble();	
			
	        // de  fahrenheit a celcius
	        double grados2=5*((fahrenheit2-32)/9);
	
			System.out.println(fahrenheit2+" fahrenheit equivale a "+Math.round((grados2 * 100d) / 100d)+" �C");
		}catch(Exception e){
			System.out.println("Ocurri� error inesperado: "+e);
		}
		
	}

}
