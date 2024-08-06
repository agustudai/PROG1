package TP05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TP05_01 {
    
    public static final int MAX = 15;
    public static void main(String[] args) {
        int[] arreglo = new int[MAX];
        cargar_arreglo(arreglo);
        mostrar_arreglo(arreglo);
    }

    public static void cargar_arreglo(int[] arreglo){

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < MAX; i++){
            try{
                System.out.println("Ingrese un numero entero para cargar: ");
                arreglo[i] = Integer.valueOf(entrada.readLine());
            }
            catch(Exception e){
                System.out.println(e);
            }
        }

    }

    public static void mostrar_arreglo(int[] arreglo){
        
        for(int i = 0; i < MAX; i++){
            System.out.println("arreglo["+i+"] = "+ arreglo[i]);
        }
    }
}
