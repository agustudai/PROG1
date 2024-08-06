package TP02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TP02_06 {

	public static void main(String[] args) {
		
		int numero = 1;
		
		try{
			
			BufferedReader entrada =  new BufferedReader(new InputStreamReader(System.in));
			
			while(numero >= 1 && numero <= 100){
				
				System.out.println("Ingrese un numero entre 1 y 100");
				numero = Integer.valueOf(entrada.readLine());
				if(numero % 2 == 0 && numero % 3 == 0){
					System.out.println("El numero: "+ numero +" es multiplo de 2 y 3");
				}else{
					System.out.println("El numero: "+ numero +" no es multiplo de 2 y 3");
				}
				
			}
			
			System.out.println("numero mayor a 100 o menor a 1, saliendo del programa");
			
		}catch(Exception error){
			System.out.println(error);
		}
	}

}
