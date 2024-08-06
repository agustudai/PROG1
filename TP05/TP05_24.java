package TP05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class TP05_24 {
   
    public static final int MAX = 20, MAXVALOR = 9, MINVALOR = 1;
    public static final double probabilidad_numero = 0.4;
    public static void main(String[] args) {
        int[] arreglo = new int[MAX];
        cargar_arreglo_aleatorio_secuencias_int(arreglo);
        imprimir_arreglo_secuencias_int(arreglo);
        procesar(arreglo);
        
    }

    public static void procesar(int[] arreglo){

        int entrada = 0;
        int inicio = 0, fin = 0;
        while(entrada < MAX-1){
            entrada = Entrada();
            if(arreglo[entrada]!= 0){
                inicio = buscar_inicio_reversa(arreglo,entrada) + 1;
                if(inicio >= 0){
                    fin = buscar_fin(arreglo,inicio);
                }
                entrada = MAX;
                
            }else{
                inicio = buscar_inicio(arreglo,entrada);
                if(inicio < MAX){
                    fin = buscar_fin(arreglo,inicio);
                    
                }
                entrada = MAX;
            }
        }

        if(inicio == MAX){
            System.out.println("no se encontro una secuencia");            
        }else{
            System.out.println("El inico se encuentra en: "+inicio+" el fin se encuentra en: "+fin);
        }

    }

    public static int buscar_inicio(int[] arreglo, int pos){
        while(pos < MAX && arreglo[pos] == 0){
            pos++;
        }
        return pos;
    }

    public static int buscar_fin(int[] arreglo, int pos){
        while(pos < MAX && arreglo[pos] != 0){
            pos++;
        }
        return pos-1;
    }

    public static int buscar_inicio_reversa(int[] arreglo, int pos){
        while(pos > 0 && arreglo[pos] != 0){
            pos--;
        }
        return pos;
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
