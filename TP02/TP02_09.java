package TP02;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TP02_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char caracter;
		
		try{
			
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Ingrese un caracter digito o un caracter letra en minuscula:");
			caracter = entrada.readLine().charAt(0);
			
			while((caracter >= '0' && caracter <= '9') || (caracter >= 'a' && caracter <= 'z' )){
				
				if(caracter >= '0' && caracter <= '9'){
					System.out.println("El caracter ingresado: " + caracter +" es un digito");
				}
				if(caracter >= 'a' && caracter <= 'z'){
					if(caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter =='u'){
						System.out.println("El caracter ingresado: "+ caracter +" es una vocal");
					}else{
						System.out.println("El caracter ingresado: "+ caracter +" es una consonante");
					}
				}
				System.out.println("Ingrese un caracter digito o un caracter letra en minuscula:");
				caracter = entrada.readLine().charAt(0);
				
			}
			
			System.out.println("Saliendo de la ejecucion!");
			
		}catch(Exception error){
			
		}
		
	}

}
