package TP06;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TP06_13 {
    public static final int N = 4;
    public static final int M = 20;
    public static final int SEPARADOR = 0;

    public static void main(String[] args){
        int mat[][] = {{0,1,5,6,0,0,2,4,5,9,0,0,2,2,0,4,1,3,0,0},
                       {0,0,4,8,1,0,1,3,5,0,6,5,3,0,1,1,2,1,0,0},
                       {0,9,5,1,0,1,4,2,0,0,0,3,3,1,0,4,1,4,0,0},
                       {0,0,0,1,4,0,2,5,1,0,0,0,9,4,1,0,0,0,0,0}};

        mostrar(mat);
        procesar(mat);
        mostrar(mat);
    }

    public static void procesar(int[][]mat){
        int tam = getNumero();
        for(int fila = 0; fila < N; fila++){
            eliminar_secuencias(mat[fila],tam);
        }
    }

    public static void eliminar_secuencias(int[]mat,int tam){
        int inicio = 0, fin = -1;
        while( inicio < M - 1){
            inicio = buscar_inicio(mat,fin+1);
            if(inicio < M - 1){
                fin = buscar_fin(mat,inicio);
                int tam_sec = fin - inicio + 1;
                if(tam_sec == tam){
                    while(inicio <= fin){
                        correr_izquierda(mat, inicio);
                        fin--;
                    }
                }
            }
        }
    }

    public static void correr_izquierda(int[]mat,int pos){
        while(pos < M-1){
            mat[pos] = mat[++pos];
        }
    }

    public static int buscar_inicio(int[]mat,int pos){
        while(pos < M-1 && mat[pos] == SEPARADOR){
            pos++;
        }
        return pos;
    }

    public static int buscar_fin(int[]mat,int pos){
        while(pos < M-1 && mat[pos] != SEPARADOR){
            pos++;
        }
        return pos-1;
    }

    public static int getNumero(){
        int numero = -1;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese un numero: ");
            numero = Integer.valueOf(entrada.readLine()); 
        } catch (Exception e) {
            System.out.println(e);
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

    public static void mostrar(int mat[]){
        System.out.println(" ");
        for (int j = 0; j < M; j++) {
            System.out.print(mat[j] + "|");
        }
    }
}
