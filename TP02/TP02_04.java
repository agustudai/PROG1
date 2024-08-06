package TP02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TP02_04 {

	public static void main(String[] args) {
	
		int numero;
		
		try{
			
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese un numero entre 0 y 999");
			numero = Integer.valueOf(entrada.readLine());
			
			if((numero > 0) && (numero < 10)){
				System.out.println("El numero tiene un solo digito");
			}else if( (numero >= 10) && (numero < 100) ){
				System.out.println("El numero tiene 2 digitos");
			}else if( (numero >= 100) && (numero < 999)){
				System.out.println("El numero es: " + numero +" y tiene 3 digitos");
			}else{
				System.out.println("Ingrese un numero entre 0 y 999!");
			}
			
		}catch(Exception error){
			System.out.println(error);
		}

	}

}
