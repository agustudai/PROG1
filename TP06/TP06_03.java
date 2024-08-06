package TP06;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class TP06_03 {
    public static final int N = 5;
    public static final int M = 10;

    public static void main(String[] args) {
        int matriz[][] = { { 1, 6, 9, 5, 9, 4, 8, 6, 2, 5 },
                           { 3, 6, 1, 6, 9, 5, 6, 2, 10, 2 },
                           { 22, 1, 33, 14, 20, 0, 18, 4, 5, 9 },
                           { 3, 4, 67, 33, 1, 3, 4, 8, 1, 2 },
                           { 11, 2, 6, 8, 3, 7, 4, 74, 2, 20 } };


        mostrar(matriz);
        procesar(matriz);
        mostrar(matriz);
        
    }

    public static void procesar(int[][]mat){
            int fila = getNumero();
            int col  = getNumero();
            correr_izquierda(mat[fila],col);

    }

    public static void correr_izquierda(int[] mat,int pos){
        int indice = M-1;
        while(pos < indice){
            mat[pos] = mat[++pos];
        }
    }

    public static int getNumero(){
        int numero = -1;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese un numero; ");
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
}
