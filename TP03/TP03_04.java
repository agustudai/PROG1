package TP03;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class TP03_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int entrada = Entrada();
		
		while(entrada != 0){
			System.out.println("Ingrese el primer numero a multiplicar: ");
			int num1 = Entrada();
			System.out.println("Ingrese el segundo numero a multiplicar: ");
			int num2 = Entrada();
			
			System.out.println("El resultado es: "+ num1 * num2);
			
			entrada = Entrada();
		}
		
	}

	public static int Entrada(){
		
		int numero = 0;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try{
			
			System.out.println("Ingrese un numero  0:");
			numero = Integer.valueOf(entrada.readLine());
			
		}catch(Exception e){
			System.out.println(e);
		}
		
		return numero;
	}
}
