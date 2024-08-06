package TP02;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TP02_16 {

	public static void main(String[] args) {
		
		char car;
		int total = 0;
		
		
		try{
			
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			
			for(int i = 0; i < 15; i++){
				
				System.out.println("Ingrese un caracter: ");
				car = entrada.readLine().charAt(0);
				if(car == 'a'){
					total++;
				}
				System.out.println("Se ingreso un total de caracteres 'a' " + total);
			}
		}catch(Exception error){
			System.out.println(error);
		}
	}

}
