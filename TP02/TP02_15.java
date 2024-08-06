package TP02;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TP02_15 {

	public static void main(String[] args) {
		
		
		int numero,suma,promedio,mayor_num,menor_num,cant_numeros;
		
		promedio = 0;
		cant_numeros = 0;
		suma = 0;
		try{
			
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Ingrese un numero distinto de 0:");
			numero = Integer.valueOf(entrada.readLine());
			
			mayor_num = numero;
			menor_num = numero;
			while(numero != 0){
				suma += numero;
				cant_numeros++;
				promedio = suma / cant_numeros;
				
				if(numero > mayor_num){
					mayor_num = numero;
				}
				
				if(numero < menor_num){
					menor_num = numero;
				}
				
				System.out.println("El promedio es: "+ promedio);
				System.out.println("El mayor numero es: "+ mayor_num);
				System.out.println("El menor numero es: "+ menor_num);
				
				
				System.out.println("Ingrese un numero distinto de 0: ");
				numero = Integer.valueOf(entrada.readLine());
			}
			
		}catch(Exception err){
			
			System.out.println(err);
			
		}
		
		
	}

}
