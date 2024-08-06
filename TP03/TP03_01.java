package TP03;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class TP03_01 {

	
	public static void main(String[] args){
		
		//Solicito el numero
		
		int num = Input();
		
		//Comprobar si num != 0
		
		while(num != 0){
			num = Input();
			System.out.println(num);
		}
	}
	
	
	public static int Input(){
		
		int numero = 0;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try{
			
			System.out.println("Ingrese un numero distinto de 0:");
			numero = Integer.valueOf(entrada.readLine());
			
		}catch(Exception e){
			System.out.println(e);
		}
		
		return numero;
		
		
	}
	
	
}
