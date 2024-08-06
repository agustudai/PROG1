package TP03;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TP03_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculadora();
	}
	
	public static void calculadora(){
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try{
			System.out.println("Ingrese el primer  numero:");
			int num1 = Integer.valueOf(entrada.readLine());
			
			System.out.println("Ingrese el segundo numero:");
			int num2 = Integer.valueOf(entrada.readLine());
			
			System.out.println("Ingrese un Opcion: a suma, b resta, c multiplicacion, d division");
			char opcion = entrada.readLine().charAt(0);
			
			switch(opcion){
				case 'a':{
					 System.out.println("Suma:"+ (num1 + num2));
					 break;
				}
				case 'b':{
					System.out.println("Resta:"+ (num1 - num2));
					break;
				}
				case 'c':{
					System.out.println("Multiplicacion:"+ (num1 * num2));
					break;
				}
				case 'd':{
					System.out.println("Division:"+ (double)(num1 / num2));
					break;
				}
			
			}
			
			
		}catch(Exception e){
			System.out.println(e);
		}
		
	}

}
