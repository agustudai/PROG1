package TP05;

public class TP05_02 {

    public static final int MAX = 10;
    public static void main(String[] args) {
        int[] arreglo = {21,33,44,1,2,6,12,9,23,10};
        promedio(arreglo);
    }

    public static void promedio(int[] arreglo){
        int suma = 0;

        for(int i = 0; i < MAX; i++){
            suma += arreglo[i];
        }

        System.out.println("El promedio es: "+ suma/MAX);
    }
    
}
