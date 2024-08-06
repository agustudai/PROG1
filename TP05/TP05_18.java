package TP05;

import java.util.Random;

public class TP05_18 {
    public static final int MAX = 20, MAXVALOR = 9, MINVALOR = 1;
    public static final double probabilidad_numero = 0.4;

    public static void main(String[] args) {
        int[] arreglo = new int[MAX];
        cargar_arreglo_aleatorio_secuencias_int(arreglo);
        imprimir_arreglo_secuencias_int(arreglo);
        sec_mayor_longitud(arreglo);

    }

    public static void sec_mayor_longitud(int[] arreglo){
        int inicio = 0, fin = -1,mayor = 0,mayor_inicio = 0,mayor_fin = 0;
        
        while(inicio < MAX){
            inicio = buscar_inicio(arreglo,fin+1);
            if(inicio < MAX){
                fin = buscar_fin(arreglo, inicio);
                int tamanio = fin - inicio + 1;
                if(tamanio > mayor){
                    mayor = tamanio;
                    mayor_inicio = inicio;
                    mayor_fin = fin;
                }
            }
        }

        System.out.println("La secuencia de mayor longitud comienza en: "+ mayor_inicio+" y termina en: "+mayor_fin+" Con un largo de: "+ mayor);
    }

    public static int buscar_inicio(int[]arreglo, int pos){
        while(pos < MAX && arreglo[pos] == 0){
            pos++;
        }
        return pos;
    }

    public static int buscar_fin(int[] arreglo, int inicio){
        while(inicio < MAX && arreglo[inicio] != 0){
            inicio++;
        }
        return inicio - 1;
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
