package TP02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class TP02_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		try{
			
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Ingrese un numero:");
			numero = Integer.valueOf(entrada.readLine());
			
			if( ((numero % 2 == 0) || (numero % 3 == 0) && numero >= 50) ){
				System.out.println(numero);
			}else{
				System.out.println("El numero no es divisible por 2 ni por 3");
				
			}
			
		}catch(Exception error){
			System.out.println(error);
		}
	}

}
