package TP02;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class TP02_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int numero, num1,num2;
		
		try{
			
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Ingrese un numero distinto de 0:");
			numero = Integer.valueOf(entrada.readLine());
			
			while(numero != 0){
				
				System.out.println("Ingrese el numero a dividir:");
				num1 = Integer.valueOf(entrada.readLine());
				System.out.println("Ingrese el divisor:");
				num2 = Integer.valueOf(entrada.readLine());
				
				System.out.println("La division de los numeros dados es: "+ (num1 / num2));
				
			}
			
		}catch(Exception err){
			System.out.println(err);
		}
		
	}

}
