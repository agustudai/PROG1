package TP05;

import java.util.Random;

public class TP05_17 {
    public static final int MAX = 20, MAXVALOR = 9, MINVALOR = 1;
    public static final double probabilidad_numero = 0.4;
    public static void main(String[] args) {
        int[] arreglo = new int[MAX];
        cargar_arreglo_aleatorio_secuencias_int(arreglo);
        imprimir_arreglo_secuencias_int(arreglo);
        buscar_anteultima(arreglo);
    }

    public static void buscar_anteultima(int[] arreglo){

        int inicio = MAX, fin = MAX, secuencia = 0;
        
        while(fin >= 0 && secuencia < 2){
            fin = buscar_fin(arreglo,inicio-1);
            if(fin >= 0){
                inicio = buscar_inicio(arreglo, fin) + 1;
                secuencia++;
            }
        }
        System.out.println("La secuencia comienza en: "+ inicio+" y termina en: "+ fin);

    }

    public static int buscar_fin(int[] arreglo,int pos){
        
        while(pos > 0 && arreglo[pos] == 0){
            pos--;
        }
        
        return pos;
    }

    public static int buscar_inicio(int[] arreglo,int pos){
        while(pos > 0 && arreglo[pos] != 0){
            pos--;
        }
        return pos;
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
