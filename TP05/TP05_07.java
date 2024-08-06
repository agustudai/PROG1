package TP05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TP05_07 {
    
    public static final int MAX = 10;
    public static void main(String[] args) {
        
        int[] arreglo = {12,3,6,23,3,8,9,7,4,6};
        System.out.println("\n");
        imprimir_arreglo(arreglo);
        int pos = Entrada();
        System.out.println(" ");
        corrimiento_derecha(arreglo, pos);
        imprimir_arreglo(arreglo);
    }
    
    public static void corrimiento_derecha(int[]arreglo,int pos){

        int indice = MAX - 1;
        while(indice > pos){
            arreglo[indice] = arreglo[indice-1];
            indice--;
        }

    }

    public static int Entrada(){
        
        int numero = 0;
        
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try{

            System.out.println("\n Ingrese un numero: ");
            numero = Integer.valueOf(entrada.readLine());

        }catch(Exception e){
            System.out.println(e);
        }

        return numero;
    }

    public static void imprimir_arreglo(int[] arr) {
        for (int pos = 0; pos < MAX; pos++) {
            System.out.print(","+arr[pos]);
        }
    }
}
