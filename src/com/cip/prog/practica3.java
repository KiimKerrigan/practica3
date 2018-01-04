package com.cip.prog;
import java.util.Scanner;

public class practica3 {

	public static void main(String[] args) {
		
		/* CHAXIRAXI MARÍA CALCINES PADILLA - PRÁCTICA 3
		 * Crear un programa en Java que convierta grados Centígrados a grados Fahrenheit. 
		 * La fórmula a utilizar es la siguinete:
		 * F = C * (9/5) + 32
		 */
		
		//Se crea el lector
		Scanner lector = new Scanner(System.in);
		try {	
	
			System.out.print("-Conversor de grados Cº a Fahrenheit (y viceversa)-\n"
							+ "Introduce ºC para convertir a F: ");
			double grados=lector.nextDouble();	
			
	        // de celsius a fahrenheit
	        double fahrenheit=32+((9*grados)/5);
			System.out.println(grados+" ºC equivale a "+fahrenheit+" fahrenheit");
			
			System.out.print("----------------------------------\n"
					+		 "Introduce F para convertir a ºC: ");
			double fahrenheit2=lector.nextDouble();	
			
	        // de  fahrenheit a celcius
	        double grados2=5*((fahrenheit2-32)/9);
	
			System.out.println(fahrenheit2+" fahrenheit equivale a "+Math.round((grados2 * 100d) / 100d)+" ºC");
		}catch(Exception e){
			System.out.println("Ocurrió error inesperado: "+e);
		}
		
	}

}
