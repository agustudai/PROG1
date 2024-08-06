package TP02;

import java.io.InputStreamReader;
import java.io.BufferedReader;
public class TP02_01 {

	public static void main(String[] args) {
		int numero = 0;
		char letra;
		int dia = 0;
		int num1, num2, num3;
		try{
			
			//enteros
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese un numero entero: ");
			numero = Integer.valueOf(entrada.readLine());
			if(numero >= 0){
				System.out.println("El numero ingresado: "+ numero + " es positivo");
			}else if(numero < 0){
				System.out.println("El numero ingresadi: "+ numero + " es negativo");
			}else{
				System.out.println("El numero ingresado no es valido");
			}
			
			if(numero >= 100){
				System.out.println("El numero ingresado: "+ numero + " es grande");
			}else{
				System.out.println("El numero ingresado: "+ numero + " es chico");
			}
			
			
			//caracteres
			System.out.println("Ingrese una letra: ");
			letra = entrada.readLine().charAt(0);
			if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
				System.out.println("El caracter ingresado: "+ letra + " es una vocal");
			}else{
				System.out.println("El caracter ingresado: "+ letra + " es una consonante");
			}
			
			System.out.println("Ingrese un numero entre 1-7: ");
			dia = Integer.valueOf(entrada.readLine());
			if((dia >=1) && (dia <= 7)){
				switch(dia){
				case 1: System.out.println("El dia es Lunes"); break;
				case 2: System.out.println("El dia es Martes");break;
				case 3: System.out.println("El dia es Miercoles");break;
				case 4: System.out.println("El dia es Jueves"); break;
				case 5: System.out.println("El dia es Viernes"); break;
				case 6: System.out.println("El dia es Sabado"); break;
				case 7: System.out.println("El dia es Domingo"); break;
				}
			}else{
				System.out.println("El numero ingresado no es valido");
			}
			
			System.out.println("Ingrese tres numeros:");
			System.out.println("Numero 1: ");
			num1 = Integer.valueOf(entrada.readLine());
			System.out.println("Numero 2:");
			num2 = Integer.valueOf(entrada.readLine());
			System.out.println("Numero 3:");
			num3 = Integer.valueOf(entrada.readLine());
			
			if((num1 < num2) && ( num2 < num3)){
				System.out.println("El orden  es creciente");
				
			}else if((num1 > num2) && (num2 > num3)){
				System.out.println("El orden es decreciente");
			}else{
				System.out.println("No esta ordenado");
			}
			
			
		}
		catch(Exception error){
			System.out.println(error);
		}
		
		
	}
	

}
