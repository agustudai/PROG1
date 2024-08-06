package TP05;

public class eje_extra {

    public static final int MAX = 13;
    public static void main(String[] args) {
        int[] arreglo = {0,8,4,-2,0,10,5,1,0,1,25,3,0};
        imprimir_arreglo_secuencias_int(arreglo);
        procesar(arreglo);
        imprimir_arreglo_secuencias_int(arreglo);

    }

    public static void procesar(int[] arreglo){
        int inicio = 0, fin = -1;

        while(inicio < MAX){
            inicio = buscar_inicio(arreglo,fin+1);
            if(inicio < MAX){
                fin = buscar_fin(arreglo,inicio);
                int tam = fin - inicio + 1; 
                if(sec_mult(arreglo,inicio,fin) && tam % 2 != 0){
                    while(tam > 0){
                        correr_izq(arreglo,inicio);
                        tam--;
                    }
                    inicio = 0;
                    fin = -1;
                }
            }
        }
    }

    public static void correr_izq(int[] arreglo,int pos){
        while(pos < MAX - 1){
            arreglo[pos] = arreglo[pos+1];
            pos++;
        }

    }

    /*public static void correrAIzquierda(int [] arr,int inicioSec, int FIN_SEC){
        int i = inicioSec; //inicio de sec que quiero borrar
        int j=  buscar_inicio(arr,FIN_SEC+1); // inicio de prox sec
        while (j<MAX-1){
            arr[i] = arr[j];
            i++;
            j++;
        }
        for (int fin = i; fin<MAX; fin++){
            arr[fin]=0;
        }
    }*/

    public static boolean sec_mult(int[] arreglo, int inicio, int fin){
   
        while(inicio <= fin){
            if(arreglo[inicio] % 2 == 0){
                return true;
            }
            inicio++;
        }
        return false;
    }

    public static int buscar_inicio(int[] arreglo,int pos){
        while(pos < MAX && arreglo[pos] == 0){
            pos++;
        }
        return pos;
    }

    public static int buscar_fin(int[] arreglo, int pos){
        while(pos < MAX && arreglo[pos] != 0){
            pos++;
        }
        return pos-1;
    }



    public static void imprimir_arreglo_secuencias_int(int[] arr) {
        System.out.print("Arreglo de secuencias int\n|");
        for (int pos = 0; pos < MAX; pos++) {
            System.out.print(arr[pos] + "|");
        }
        System.out.print("\n");
    }

    
}
