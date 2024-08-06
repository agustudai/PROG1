package TP02;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class TP02_08 {

	public static void main(String[] args) {
		
		int numero;
		
		try{
			
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Ingrese un numero entero distinto de 0:");
			
			numero = Integer.valueOf(entrada.readLine());
			
			while(numero != 0){
				
				System.out.println("Ingrese un numero:");
				numero = Integer.valueOf(entrada.readLine());
				
				
			}
			System.out.println("Saliendo de la ejecucion!");
			
		}catch(Exception error){
			
			System.out.println(error);
			
		}
		
	}

}
