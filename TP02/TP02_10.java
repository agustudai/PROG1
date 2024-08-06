package TP02;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TP02_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero,suma = 0;
		
		try{
			
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Ingrese un numero entre 1 y 10:");
			
			numero = Integer.valueOf(entrada.readLine());
			
			while(numero >= 0 && numero <= 10){
				
				suma += numero;
				System.out.println(suma);
				
				System.out.println("Ingrese un numero entre 1 y 10:");
				numero = Integer.valueOf(entrada.readLine());
				
			}
			System.out.println("Saliendo de la ejecucion!");
			
		}catch(Exception error){
			System.out.println(error);
		}
	}

}
