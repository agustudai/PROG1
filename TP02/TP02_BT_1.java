package TP02;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class TP02_BT_1 {

	public static void main(String[] args) {
		
		int opcion;
		int cant_pacientes,cant_prestadores,cant_atendidos;
		int paciente_edad;
		int max_edad = 0;
		int max_atendidos = 0;
		try{
			
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Ingrese una opcion 1, 2 o 3:");
			opcion = Integer.valueOf(entrada.readLine());
			
			while( opcion != 0){
				if(opcion == 1){
					System.out.println("Ingrese la cantidad de pacientes (max 15)");
					cant_pacientes = Integer.valueOf(entrada.readLine());
					for(int i = 0; i < cant_pacientes; i++){
						System.out.println("Ingrese la edad del paciente:");
						paciente_edad = Integer.valueOf(entrada.readLine());
						if(paciente_edad == 78){
							max_edad++;
						}
					}
					System.out.println("La cantidad de pacientes mayores a 78 a�os es: "+ max_edad);
					
				}else if(opcion == 2){
					System.out.println("Ingrese la cantidad de prestadores (max 10)");
					cant_prestadores = Integer.valueOf(entrada.readLine());
					for(int i = 0; i < cant_prestadores; i++){
						System.out.println("Cantidad de pacientes atendidos por el prestador:");
						cant_atendidos = Integer.valueOf(entrada.readLine());
						if(cant_atendidos >= 10){
							max_atendidos++;
						}
					}
					
					System.out.println("En los ultimos 2 dias "+ max_atendidos +" prestadores atendieron a mas de 10 pacientes");
					
					
				}else if(opcion == 3){
					
				}else if(opcion == 4){
					
				}else{
					System.out.println("Ingrese una opcion valida!");
				}
				
				System.out.println("Ingrese una opcion 1, 2 o 3:");
				opcion = Integer.valueOf(entrada.readLine());

				
			}
			
			
		}catch(Exception e){
			System.out.println(e);
		}
		
	}

}
