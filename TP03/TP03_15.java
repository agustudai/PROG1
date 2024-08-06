package TP03;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TP03_15 {

    public static void main(String[] args) {
        
        int numero = Entrada();
        System.out.println("La sumatoria del numero dado es: "+ sumatoria(numero));

    }

    public static int sumatoria(int numero){
        int total = 0;
        for(int i = 1; i <= numero; i++){
            total += i;
        }
        return total;
    }
    
    public static int Entrada(){
        int numero = 0;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try{

            System.out.println("Ingrese un numero: ");
            numero = Integer.valueOf(entrada.readLine());

        }catch(Exception e){
            System.out.println(e);
        }
        return numero;
    }
    
}
