package TP05;

import java.util.Random;

public class TP05_20 {
    public static final int MAX = 20, MAXVALOR = 9, MINVALOR = 1, MAX_PATRON = 2;
    public static final double probabilidad_numero = 0.4;

    public static void main(String[] args) {
        int[] arreglo = { 0, 2, 0, 2, 4, 0, 2, 4, 1, 7, 6, 0, 0, 2, 4, 0, 0, 2, 4, 0 };
        int[] patron = {2,4};
        // cargar_arreglo_aleatorio_secuencias_int(arreglo);
        imprimir_arreglo_secuencias_int(arreglo);
        eliminar_ocurrencias(arreglo, patron);
        imprimir_arreglo_secuencias_int(arreglo);
    }

    public static void eliminar_ocurrencias(int[] arreglo, int[] patron) {
        int inicio = 0, fin = -1;

        while (inicio < MAX) {
            inicio = buscar_inicio(arreglo, fin + 1);
            if (inicio < MAX) {
                fin = buscar_fin(arreglo, inicio);
                if(son_iguales(arreglo, inicio, fin, patron)){
                    int tam = MAX_PATRON;
                    while(inicio <= fin){
                        correrAIzquierda(arreglo, inicio);
                        fin--;
                    }
                    
                }
            }
        }
        inicio = buscar_inicio(arreglo, fin+1);
    }

    public static void correrAIzquierda(int [] arreglo,int pos){
        while(pos < MAX - 1){
            arreglo[pos] = arreglo[pos+1];
            pos++;
        }
    }


    public static boolean son_iguales(int[] arreglo,int inicio,int fin,int[] arregloB){
        int i = inicio;
        int k = 0;
        while(k < MAX_PATRON - 1 && i < fin && arreglo[i] == arregloB[k]){
            k++;
            i++;
        }
        if(k < MAX_PATRON && i == fin && arreglo[i] == arregloB[k]){
            return true;
        }
        return false;
    }

    public static int buscar_inicio(int[] arreglo, int pos) {
        while (pos < MAX && arreglo[pos] == 0) {
            pos++;
        }

        return pos;
    }

    public static int buscar_fin(int[] arreglo, int pos) {
        while (pos < MAX && arreglo[pos] != 0) {
            pos++;
        }
        return pos - 1;
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
