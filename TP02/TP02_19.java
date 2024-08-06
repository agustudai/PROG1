package TP02;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TP02_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int mes;
		int anio;
		
		boolean esValido = true;
		try{
			
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			while(esValido){
				System.out.println("Ingrese un numero de mes:");
				mes = Integer.valueOf(entrada.readLine());
				
				switch(mes){
				case 1:
					System.out.println("El mes tiene 31 dias");
					break;
				case 2:
					System.out.println("ingrese un a�o: ");
					anio = Integer.valueOf(entrada.readLine());
					if((anio >= 2000) && (anio <= 2019)){
						if(((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))){
							System.out.println("El a�o es bisiesto");
							System.out.println("El mes tiene 29 dias");
						}else{
							System.out.println("El a�o no es bisiesto");
							System.out.println("El mes tiene 28 dias");
						}
						break;
					}
					esValido = false;
					break;
				case 3:
					System.out.println("El mes tiene 31 dias");
					break;
				case 4:
					System.out.println("El mes tiene 30 dias");
					break;
				case 5:
					System.out.println("El mes tiene 31 dias");
					break;
				case 6:
					System.out.println("El mes tiene 30 dias");
					break;
				case 7:
					System.out.println("El mes tiene 31 dias");
					break;
				case 8:
					System.out.println("El mes tiene 31 dias");
					break;
				case 9:
					System.out.println("El mes tiene 30 dias");
					break;
				case 10:
					System.out.println("El mes tiene 31 dias");
					break;
				case 11:
					System.out.println("El mes tiene 30 dias");
					break;
				case 12:
					System.out.println("El mes tiene 31 dias");
					break;
				default:{
					System.out.println("Ingrese un mes valido");
					}
				}
				
				
			}
			
		}catch(Exception e){
			System.out.println(e);
		}
		
	}

}
