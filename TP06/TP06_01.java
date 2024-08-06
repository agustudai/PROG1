package TP06;

public class TP06_01 {
    public static final int N = 5;
    public static final int M = 10;

    public static void main(String[] args) {
        int matriz[][] = { { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 },
                { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 },
                { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 },
                { 20, 19, 18, 17, 16, 15, 14, 13, 12, 11 },
                { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 } };
        mostrar(matriz);
        invertir(matriz);
        System.out.println(" ");
        mostrar(matriz);
    }

    public static void invertir(int[][] mat) {
        for (int i = 0; i < N; i++) {
            procesar(mat[i]);
        }
    }

    public static void procesar(int[] mat) {
        int aux = 0, ini = 0, fin = M-1;

        while (ini < fin) {
            aux = mat[ini];
            mat[ini] = mat[fin];
            mat[fin] = aux;
            ini++;
            fin--;
        }
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
