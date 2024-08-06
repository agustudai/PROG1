package TP05;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class TP05_14 {

    public static final int MAX = 10;
    public static final int MAXVALOR = 10;
    public static final int MINVALOR = 1;
    public static void main(String[] args) {
        
        int[] arreglo = {1,6,4,7,8,3,4,6,5,3};
        imprimir_arreglo(arreglo);
        eliminar_pares(arreglo);
        imprimir_arreglo(arreglo);

    }

    public static void eliminar_pares(int[] arreglo){

        int indice = MAX - 1;
        int pos = 0;

        while(pos < indice){
            if(arreglo[pos] % 2 == 0){
                arreglo[pos] = arreglo[pos + 1];
                if(arreglo[pos] % 2 == 0)
                arreglo[pos] = arreglo[pos + 1];
            }
            pos++;
            
        }

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
