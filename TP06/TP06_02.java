package TP06;

public class TP06_02 {

    public static final int N = 5;
    public static final int M = 10;
    public static final int DIVISOR = 2;

    public static void main(String[] args){
        int matriz[][] = {{1,6,9,5,9,4,8,6,2,5},
                          {3,6,1,6,9,5,6,2,10,2},
                          {22,1,33,14,20,0,18,4,5,9},
                          {3,4,67,33,1,3,4,8,1,2},
                          {11,2,6,8,3,7,4,74,2,20}};
        
    mostrar(matriz);
    procesar(matriz);

        
    }

    public static void procesar(int[][] arr){
        int cant = 0;
        for(int i = 0; i < N; i++){
            cant += cant_pares(arr[i]);
            //System.out.println("CANT PAR FILA: "+ (i+1) + " " + cant);
        }
        System.out.println("TOTAL: " + cant);
    }

    public static int cant_pares(int[]arr){
        int cant = 0;
        for(int i = 0; i < M; i++){
            if(arr[i] % DIVISOR == 0){
                cant++;
            }
        }
        return cant;
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
