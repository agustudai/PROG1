package TP02;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TP02_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char car;
		int cant = 0;
		
		try{
			
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Ingrese un caracter letra minuscula:");
			
			car = entrada.readLine().charAt(0);
			
			while(car >= 'a' && car <= 'z'){
				
				if(car == 'a' || car == 'e' || car == 'i' || car == 'o' || car == 'u'){
					cant++;
				}
				
				System.out.println("Cantidad de vocales ingresadas: "+ cant);
				
				System.out.println("Ingrese un caracter letra minuscula:");
				car = entrada.readLine().charAt(0);
				
			}
			System.out.println("Saliendo de la ejecucion");
			
		}catch(Exception error){
			System.out.println(error);
		}
		
	}

}
