package TP02;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TP02_12 {

	public static void main(String[] args) {
		
		char car;
		
		char car_menor;
		char car_mayor;
		
		try{
			
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Ingrese un caracter letra minuscula:");
			car = entrada.readLine().charAt(0);
			
			car_menor = car;
			car_mayor = car;
			while(car >= 'a' && car <= 'z'){
				if( car_menor > car){
					car_menor = car;
				}else if(car_mayor < car){
					car_mayor = car;
				}
				
				System.out.println("El menor caracter ingresado es: "+ car_menor);
				System.out.println("El mayor caracter ingresado es: "+ car_mayor);
				
				System.out.println("Ingrese un caracter letra minuscula: ");
				car = entrada.readLine().charAt(0);
			}
			System.out.println("Saliendo de la ejecucion!");
			
		}catch(Exception error){
			System.out.println(error);
		}
			
		
	}

}
