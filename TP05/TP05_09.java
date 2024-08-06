package TP05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class TP05_09 {
    
    public static final int MAX = 10;
    public static final int MAXVALOR = 10;
    public static final int MINVALOR = 1;
    public static void main(String[] args) {
        
        int[] arreglo = new int[MAX];
        cargar_arreglo_aleatorio_int(arreglo);
        imprimir_arreglo(arreglo);
        int numero = Entrada();
        insertar_numero(arreglo,numero);
        imprimir_arreglo(arreglo);
    }

    public static void insertar_numero(int[] arreglo,int numero){
        int pos = 0;
        int indice = MAX -1;
        while(pos < indice){
            arreglo[indice] = arreglo[indice - 1];
            indice--;
        }
        arreglo[pos] = numero;
    }

    public static int Entrada() {
        int numero = 0;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {

            System.out.println("\n Ingrese un numero: ");
            numero = Integer.valueOf(entrada.readLine());

        } catch (Exception e) {
            System.out.println(e);
        }

        return numero;
    }

    public static void cargar_arreglo_aleatorio_int(int[] arr) {
        Random r = new Random();
        for (int pos = 0; pos < MAX; pos++) {
            arr[pos] = (r.nextInt(MAXVALOR - MINVALOR + 1) + MINVALOR);
        }
    }

    public static void imprimir_arreglo(int[] arr) {
        System.out.println("\n");
        for (int pos = 0; pos < MAX; pos++) {
            System.out.print(","+arr[pos]);
        }
    }

}
