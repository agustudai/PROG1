package TP05;

import java.util.Random;

public class TP05_26 {
    
    public static final int MAX = 20;
    public static void main(String[] args) {
        char[] arreglo = {' ','a',' ','c','d',' ','p',' ','k','j','l',' ',' ','m','n','a',' ','c','d',' '};
        char[] arregloB = {' ',' ',' ','a','c','c','c','d',' ','a',' ',' ','k','o',' ',' ',' ','w','q',' '};
        imprimir_arreglo_secuencias_int(arreglo);
        int inicio = obtener_inicio(arreglo);
        int fin = obtener_fin(arreglo,inicio);
        int iniB = obterner_inicio_B(arreglo);
        int finB = obtener_fin(arreglo,iniB);
        correr(arreglo,arregloB,inicio,fin,iniB,finB);
        imprimir_arreglo_secuencias_int(arreglo);

    }

    public static int obtener_inicio(char[]arreglo){
        return 3;
    }

    public static int obtener_fin(char[] arreglo,int pos){
        while(pos < MAX && arreglo[pos] != ' '){
            pos++;
        }
        return pos-1;
    }

    public static int obterner_inicio_B(char[]arreglo){
        return 3;
    }

    public static void correr(char[] arreglo,char[] B,int inicio,int fin,int iniB,int finB){
        int k = inicio;
        int tam = fin - inicio + 1;                             
        for(;tam >0;tam--){ //borramos el arreglo para luego cargar la secuencia de B en A
            correr_izq(arreglo,k);
        }
        // carga la secuencia de B en A a partir de la ultima pos de la sec a la primera posicion dado de que si iniB <= finB la secuencia seria cargada al reves dccca en vez de acccd
        while(finB >= iniB){ 
            correr_derecha(arreglo,B,inicio,finB);
            finB--;
        }
    }

    public static void correr_derecha(char[] arreglo,char[] B,int inicio, int iniB){
        int indice = MAX-1;
        while(indice > inicio){
            arreglo[indice] = arreglo[indice-1];
            indice--;
        }
        arreglo[inicio] = B[iniB];
        arreglo[MAX-1] = 0;
    }

    public static void correr_izq(char[] arreglo,int pos){
        while(pos < MAX-1){
            arreglo[pos] = arreglo[pos+1];
            pos++;
        }
    }
    public static void imprimir_arreglo_secuencias_int(char[] arr) {
        System.out.print("Arreglo de secuencias int\n|");
        for (int pos = 0; pos < MAX; pos++) {
            System.out.print(arr[pos] + "|");
        }
        System.out.print("\n");
    }
}
