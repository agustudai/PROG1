package TP05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TP05_13 {

    public static final int MAX = 10;
    public static final int MAXVALOR = 10;
    public static final int MINVALOR = 1;

    public static void main(String[] args) {

        int[] arreglo = {1,2,3,4,5,6,7,8,9,10};
        imprimir_arreglo(arreglo);
        System.out.println("Ingrese la posicion: ");
        int pos = Entrada();
        System.out.println("Ingrese numero a insertar: ");
        int numero = Entrada();
        insertar_elemento(arreglo,pos,numero);
        imprimir_arreglo(arreglo);
    }

    public static void insertar_elemento(int[] arreglo, int pos, int numero){
        
        int indice = MAX - 1;
        while(pos < indice){
            arreglo[indice] = arreglo[indice-1];
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

    public static void imprimir_arreglo(int[] arr) {
        System.out.println("\n");
        for (int pos = 0; pos < MAX; pos++) {
            System.out.print(","+arr[pos]);
        }
    }
}
