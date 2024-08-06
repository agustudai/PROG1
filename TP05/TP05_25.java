package TP05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class TP05_25 {
    
    public static final int MAX = 20, MAXVALOR = 9, MINVALOR = 1;
    public static final double probabilidad_numero = 0.4;
    public static void main(String[] args) {
        int[] arreglo = new int[MAX];
        int[] arregloB = new int[MAX];
        cargar_arreglo_aleatorio_secuencias_int(arreglo);
        imprimir_arreglo_secuencias_int(arreglo);
        imprimir_arreglo_secuencias_int(arregloB);
        procesar(arreglo,arregloB);
        imprimir_arreglo_secuencias_int(arregloB);
    }

    public static void procesar(int[] arreglo,int[] arregloB){
        int inicio = 0, fin = -1;
        int ini_arregloB = 0;        
        
        int entrada = Entrada();
        while(entrada > 0 && inicio < MAX){
            inicio = buscar_inicio(arreglo,fin+1);
            if(inicio < MAX){
                fin = buscar_fin(arreglo,inicio);
                int tam = fin - inicio +1;
                if(tam == entrada){
                    int i = inicio;
                    while(i <= fin){
                        arregloB[ini_arregloB] = arreglo[i];
                        i++;
                        ini_arregloB++;

                    }
                    ini_arregloB++;// suma +1 para dar un espacio entre secuencias
                    
                }
            }
        }
    }

    public static int buscar_inicio(int[]arreglo,int pos){
        while(pos < MAX && arreglo[pos] == 0){
            pos++;
        }
        return pos;
    }

    public static int buscar_fin(int[]arreglo,int pos){
        while(pos < MAX && arreglo[pos] != 0){
            pos++;
        }
        return pos-1;
    }
    
    public static void cargar_arregloB(int[] arreglo){
        for(int i = 0; i < MAX; i++){
            arreglo[i] = 0;
        }
    }

    public static int Entrada(){
        int numero = 0;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("Ingrese un numero entero: ");
            numero = Integer.valueOf(entrada.readLine());
        }catch(Exception e){
            System.out.println(e);
        }
        
        return numero;
    }

    
    public static void cargar_arreglo_aleatorio_secuencias_int(int[] arr) {
        Random r = new Random();
        arr[0] = 0;
        arr[MAX - 1] = 0;
        for (int pos = 1; pos < MAX - 1; pos++) {
            if (r.nextDouble() > probabilidad_numero) {
                arr[pos] = (r.nextInt(MAXVALOR - MINVALOR + 1) + MINVALOR);
            } else {
                arr[pos] = 0;
            }
        }

    }

    public static void imprimir_arreglo_secuencias_int(int[] arr) {
        System.out.print("Arreglo de secuencias int\n|");
        for (int pos = 0; pos < MAX; pos++) {
            System.out.print(arr[pos] + "|");
        }
        System.out.print("\n");
    }
}
