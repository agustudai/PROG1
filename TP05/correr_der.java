package TP05;

public class correr_der {
    public static final int MAX = 20;
    public static void main(String[] args) {
        char[] arreglo = {' ','a',' ','c','d',' ','p',' ','k','j','l',' ',' ','m','n','a',' ','c','d',' '};
        char[] arregloB = {' ',' ',' ','a','c','c','c','d',' ','a',' ',' ','k','o',' ',' ',' ','w','q',' '};
        imprimir_arreglo_secuencias_int(arreglo);
        correr(arreglo,arregloB,3,4,3,7);
        imprimir_arreglo_secuencias_int(arreglo);

    }

    public static void correr(char[] arreglo,char[] B,int inicio,int fin,int iniB,int finB){
        /*int i = MAX-1;*/
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
