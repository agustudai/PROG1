package TP03;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TP03_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int entrada = Entrada();
		
		while(entrada > 0){
			System.out.println("El numero ingresado es:");
			entrada = Entrada();
		}
		
	}
	
	
	public static int Entrada(){
		
		int numero = 0;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		
		try{
			System.out.println("Ingrese un numero natural:");
			numero = Integer.valueOf(entrada.readLine());
			
		}catch(Exception e){
			System.out.println(e);
		}
		
		
		
		return numero;
	}

}
