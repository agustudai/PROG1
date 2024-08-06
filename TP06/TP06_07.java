package TP06;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TP06_07 {
    public static final int N = 4;
    public static final int M = 5;
    public static void main(String[] args){
        int matriz[][] = { {1,2,3,4,5},
                           {3,6,7,8,9},
                           {5,7,8,10,11},
                           {2,3,4,6,7},
                           {0,1,2,3,5} };
                        
        mostrar(matriz);
        procesar(matriz);
        mostrar(matriz);

    }

    public static void procesar(int[][] mat){
        int fila   = getNumero();
        int numero = getNumero();
        insertar_numero(mat[fila], numero);
    }


    public static void insertar_numero(int[]mat, int numero){
        int pos = buscar_posicion(mat,numero);
        if(pos == M){
            mat[pos-1] = numero;
        }else{
            mat[pos] = numero;
        }
    }

    public static int buscar_posicion(int[]mat, int numero){
        int pos = 0;
        while(pos < M && mat[pos] < numero){
            pos++;
        }
        return pos;
    }

    public static int getNumero(){
        int numero = -1;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese un numero: ");
            numero = Integer.valueOf(entrada.readLine());
        } catch (Exception e) {
            System.err.println(e);
        }
        return numero;
    }
    public static void mostrar(int mat[][]) {
        System.out.print("Arreglo de secuencias int\n|");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(mat[i][j] + "|");
            }
            System.out.print("\n");
        }
    }
}
