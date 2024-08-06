package TP02;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TP02_20 {

	public static void main(String[] args) {
		
		 int numero;
		 char car;
		 String texto;
		 int num1,num2,num3,num4,num5;
		 int num_mult1, num_mult2;
		 int total;
		 try{
			 
			 BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			 
			 System.out.println("Ingrese un numero entero positivo:");
			 numero = Integer.valueOf(entrada.readLine());
			 while(numero > 0){
				 
				 System.out.println("Ingrese el caracter minuscula: a o b o c");
				 car = entrada.readLine().charAt(0);
				 
				 if(car == 'a'){
					 System.out.println("Escriba un texto:");
					 texto = entrada.readLine();
					 System.out.println(texto);
				 }else if(car == 'b'){
					 
					 System.out.println("Ingrese el primer numero:");
					 num1 = Integer.valueOf(entrada.readLine());
					 System.out.println("Ingrese el primer numero:");
					 num2 = Integer.valueOf(entrada.readLine());
					 System.out.println("Ingrese el primer numero:");
					 num3 = Integer.valueOf(entrada.readLine());
					 System.out.println("Ingrese el primer numero:");
					 num4 = Integer.valueOf(entrada.readLine());
					 System.out.println("Ingrese el primer numero:");
					 num5 = Integer.valueOf(entrada.readLine());
					 
					 if((num2 > num1) && (num3 > num2) && (num4 > num3) && (num5 > num4)){
						 System.out.println("El orden ingresado es ascendente");
					 }else{
						 System.out.println("El orden ingresado no es ascendente");
					 }
					 
					 
				 }else if(car == 'c'){
					 
					 System.out.println("Ingrese un numero entero negativo a multiplicar");
					 num_mult1 = Integer.valueOf(entrada.readLine());
					 System.out.println("Ingrese un numero entero negativo a multiplicar");
					 num_mult2 = Integer.valueOf(entrada.readLine());
					 
					 total = num_mult1 * num_mult2;
					 
					 System.out.println("La raiz cuadrada de la multiplicacion es: "+ Math.sqrt(total));
					 
				 }else{
					 System.out.println("Ingrese un caracter valido!");
				 }
				 
				 System.out.println("Ingrese un numero entero positivo:");
				 numero = Integer.valueOf(entrada.readLine());
				 
			 }
				 
			 
			 
		 }catch(Exception e){
			 System.out.println(e);
		 }
		
	}

}
