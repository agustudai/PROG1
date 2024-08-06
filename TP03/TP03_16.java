package TP03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TP03_16 {
    public static void main(String[] args) {
        int mes = Entrada();
       while(mes >= 1 && mes <=12){
            mostrar_mes(mes);
            mes = Entrada();
       }
    }

    public static void mostrar_mes(int mes){

        switch(mes){
            case 2: System.out.println("Tiene 28 dias"); break;
            case 1: case 3: case 5: case 7: case 8: case 10: case 12: System.out.println("El mes tiene 31 dias"); break;
            case 4: case 6: case 9: case 11: System.out.println("El mes tiene 30 dias"); break;
        }

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
