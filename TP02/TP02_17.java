package TP02;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class TP02_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int max = 10;
		final int min = 1;
		int numero;
		
		try{
			
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Ingrese un numero ente 1 y 10");
			numero = Integer.valueOf(entrada.readLine());
			while((numero >= min) && (numero <= max)){
				
				for(int i = numero; i  >= 0; i--){
					System.out.println(i);
				}
				
				System.out.println("Ingrese un numero ente 1 y 10");
				numero = Integer.valueOf(entrada.readLine());
				
			}
			
			
			
		}catch(Exception err){
			System.out.println(err);
		}
		
	}

}
