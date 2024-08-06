package TP02;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TP02_13 {

	public static void main(String[] args) {
		
		char car;
		int numero, tabla = 0;

		try{
			
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Ingrese un caracter letra minuscula: ");
			
			car = entrada.readLine().charAt(0);
			
			while(car >= 'a' && car <= 'z'){
				
				System.out.println("ingrese un numero entero:");
				numero = Integer.valueOf(entrada.readLine());
				
				if(numero >= 1 && numero <= 5){
					tabla = numero;
					for(int i = 1; i < 10; i++){
						tabla += numero ;
					}
					System.out.println(tabla);
				}
				
				System.out.println("Ingrese un caracter letra minuscula: ");
				car = entrada.readLine().charAt(0);
				
			}
			System.out.println("Saliendo de la ejecucion:");
			
		}catch(Exception error){
			System.out.println(error);
		}
		
	}

}
