package TP05;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class TP05_19 {
    
    public static final int MAX = 20, MAXVALOR = 9, MINVALOR = 1;
    public static final double probabilidad_numero = 0.4;
    public static void main(String[] args) {
        int[] arreglo = new int[MAX];
        cargar_arreglo_aleatorio_secuencias_int(arreglo);
        imprimir_arreglo_secuencias_int(arreglo);
        eliminar_sec_tamanio(arreglo);
        imprimir_arreglo_secuencias_int(arreglo);
    }

    public static void eliminar_sec_tamanio(int[] arreglo){

        int tam_entrada = Entrada();

        int inicio = 0,fin = -1;

        while(inicio < MAX){
            inicio = buscar_inicio(arreglo, fin+1);
            if(inicio < MAX){
                fin = buscar_fin(arreglo, inicio);
                int tamanio = fin - inicio + 1;
                if(tamanio == tam_entrada){
                    while(inicio <= fin){
                        correr_izq(arreglo,inicio);
                        fin--;
                    }
                }
            }
        }

    }


    
    public static void correr_izq(int[] arreglo, int pos){
        while(pos < MAX - 1){
            arreglo[pos] = arreglo[pos+1];
            pos++;
        }
    }

    public static int buscar_inicio(int[] arreglo, int pos){
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

    public static int Entrada(){
        int numero = 0;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        try{

            System.out.println("Ingrese un numero: ");
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
