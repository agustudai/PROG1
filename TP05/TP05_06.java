package TP05;

public class TP05_06 {
    
    public static final int MAX = 10;
    public static void main(String[] args) {
        int[] arreglo = {1,8,6,3,8,5,7,0,2,11};
        imprimir_arreglo(arreglo);
        cant_pares(arreglo);
    }

    public static void cant_pares(int[] arreglo){
        int cant = 0;

        for(int i = 0; i < MAX; i++){
            if(arreglo[i] % 2 == 0){
                cant++;
            }
        }

        System.out.println("El numero de pares es: "+ cant);
    }

    public static void imprimir_arreglo(int[] arr) {
        for (int pos = 0; pos < MAX; pos++) {
            System.out.println("nombre_arreglo[" + pos + "]=>: " + arr[pos]);
        }
    }
}
