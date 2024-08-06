package TP05;

import java.util.Random;

public class TP05_21 {
    public static final int MAX = 40, MAXVALOR = 9, MINVALOR = 1, TAMB = 2;
    public static final double probabilidad_numero = 0.4;
    public static void main(String[] args) {
        int[] arreglo = {0,0,0,1,1,2,0,0,0,3,2,1,0,0,0,6,5,4,0,0,0,0,9,8,7,0,0,0,0,0,1,2,0,9,8,6,0,0,0,0};
        //cargar_arreglo_aleatorio_secuencias_int(arreglo);
        imprimir_arreglo_secuencias_int(arreglo);
        borrar_secs_descendetes(arreglo);
        imprimir_arreglo_secuencias_int(arreglo);
    }

    public static void borrar_secs_descendetes(int[] arreglo){
        int inicio = 0, fin= -1;

        while(inicio < MAX){
            inicio = buscar_inicio(arreglo,fin+1);
            if(inicio < MAX){
                fin = buscar_fin(arreglo, inicio);
                if(esDescendente(arreglo,inicio,fin)){
                    int tam = fin - inicio + 1;
                    while(tam > 0){
                        correr_izq(arreglo,inicio);
                        tam--;
                    }
                }                
            }
        }
    }

    public static void correr_izq(int[] arreglo,int pos){
        while(pos < MAX - 1){
            arreglo[pos] = arreglo[pos + 1];
            pos++;
        }
    }

    public static boolean esDescendente(int[] arreglo, int inicio, int fin){
        while(inicio < fin && arreglo[inicio] >= arreglo[inicio+1]){
            inicio++;
        }
        return inicio == fin;
    }

    public static int buscar_inicio(int[] arreglo, int pos){
        while(pos < MAX && arreglo[pos] == 0){
            pos++;
        }
        return pos;
    }

    public static int buscar_fin(int[]arreglo,int pos){
        while(pos < MAX && arreglo[pos] != 0){
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
