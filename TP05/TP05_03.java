package TP05;

public class TP05_03 {

    public static final int MAX = 10;
    public static void main(String[] args) {
       
        int[] arreglo = {21,33,44,1,2,6,12,9,23,10};
        int promedio = promedio(arreglo);
        superior(arreglo, promedio);

    }

    public static int promedio(int[] arreglo){
        int suma = 0;

        for(int i = 0; i < MAX; i++){
            suma += arreglo[i];
        }

        return suma/MAX;
    }

    public static void superior(int[] arreglo, int promedio){

        int cant = 0;

        for(int i = 0; i < MAX; i++){
            if(promedio < arreglo[i]){
                cant++;
            }
        }

        System.out.println("Hay un total de "+ cant+" numeros superior al promedio");

    }


    
    
}
