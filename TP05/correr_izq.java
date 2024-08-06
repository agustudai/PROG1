package TP05;

public class correr_izq {

    public static final int MAX = 10;
    public static void main(String[] args) {
    
        int[] arreglo ={12,3,6,23,3,8,9,7,4,6};
        imprimir_arreglo(arreglo);
        correr_izquierda(arreglo, 6);
        System.out.println(" ");
        imprimir_arreglo(arreglo);

    }
 
    public static void correr_izquierda(int[] arreglo,int pos){
        int indice = MAX-1;

        while(indice > pos){
            arreglo[pos] = arreglo[pos + 1];
            pos++;
        } 
    }

    public static void imprimir_arreglo(int[] arr) {
        for (int pos = 0; pos < MAX; pos++) {
            System.out.print(arr[pos]);
        }
    }
      
}
