package TP02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TP02_07 {

	public static void main(String[] args) {
	
		char caracter;
		
		try{
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Ingrese una caracter: ");
			caracter = entrada.readLine().charAt(0);
			while(caracter != '*'){
				
				if(caracter >= '0' && caracter <= '9'){
					System.out.println(caracter + " es un caracter digito");
				}
				else if(caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u'){
					System.out.println(caracter + " es una vocal minuscula");
				}else{
					System.out.println("No es una vocal o un caracter digito");
				}
				
				System.out.println("Ingrese una caracter: ");
				caracter = entrada.readLine().charAt(0);
				
			}
			
			
		}catch(Exception error){
			System.out.println();
		}
	}

}
