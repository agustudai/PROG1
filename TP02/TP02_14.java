package TP02;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class TP02_14 {

	public static void main(String[] args) {
		
		
		int numero, cant_pares = 0;
		
		try{
			
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			
			
			System.out.println("Ingrese un numero entero positivo");
			numero = Integer.valueOf(entrada.readLine());
			
			int aux = 1;
			while(aux < 10  && numero >= 0){
				
				if(numero % 2 == 0){
					cant_pares++;
				}
				System.out.println("Ingrese un numero entero positivo");
				numero = Integer.valueOf(entrada.readLine());
				aux++;
			}
			System.out.println(cant_pares);
			
		}catch(Exception err){
			System.out.println(err);
		}

	}

}
