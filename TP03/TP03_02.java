package TP03;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class TP03_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char entrada_char = Entrada();
		
		while(((entrada_char >= 'a') && (entrada_char <= 'z')) || ((entrada_char >= '0')  && (entrada_char <= '9'))){
			
			System.out.println("El caracter ingresado es: "+ entrada_char);
			
			if(((entrada_char >= 'a') && (entrada_char <= 'z'))){
				if(esVocal(entrada_char)){
					System.out.println("El caracter ingresado: "+ entrada_char +" es vocal");
				}else{
					System.out.println("El caracter ingresado: "+ entrada_char +" es consonante");
				}
			}
			
			entrada_char= Entrada();
			
		}
		
	}
	
	public static boolean esVocal(char caracter){
		
		return (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u');
	}

	
	public static char Entrada(){
		
		char caracter = 'k';
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try{
			
			System.out.println("Ingrese un caracter:");
			
			caracter = entrada.readLine().charAt(0);
			
		}catch(Exception e){
			System.out.println(e);
		}
		
		
		return caracter;
		
	}
	
	
}
