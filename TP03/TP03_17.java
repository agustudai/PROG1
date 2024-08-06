package TP03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TP03_17 {
    
    public static void main(String[] args) {

       char caracter = Entrada_caracter();
       
       while(caracter >= 'a' && caracter <= 'z'){

        int numero = Entrada_num();
        if(numero >= 1 && numero <= 5){
            tabla_mult(numero);
        }
        caracter = Entrada_caracter();
       }
        
    }

    public static void tabla_mult(int numero){
        for(int i = 1; i <= 10; i++){
            System.out.println(i*numero);
        }
    }

    public static int Entrada_num(){
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

    public static char Entrada_caracter(){
        char caracter = '0';

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{

            System.out.println("Ingrese un caracter: ");
            caracter = entrada.readLine().charAt(0);

        }catch(Exception e){

            System.out.println(e);
        }

        return caracter;
    }
    
}
