package TP06;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class TP06_09 {

    public static final int N = 4;
    public static final int M = 5;

    public static void main(String[] args){
        int matriz[][] = { {5,2,1,7,4},{2,1,3,5,10},{4,1,3,6,2}, {3,2,1,5,7}};

        mostrar(matriz);
        procesar(matriz);
        mostrar(matriz);
    }

    public static void procesar(int[][]mat){
        int fila = getNumero();
        int col1 = getNumero();
        int col2 = getNumero();
        ordenar(mat[fila],col1,col2);
    }

    public static void ordenar(int[] arr,int col1, int col2) {
        if(col1 < 1){
            col1 = 1;
        }
        int temp;
        for (int i = col1+1; i < col2; i++) {
            for (int j = col1-1; j < col2; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

   /*  public static void ordenar(int arr[],int col1, int col2) {
        for (int i = col1; i < M; i++) {
            int aux = arr[i];
            int j = i - 1;
            while ((j >= 0) && (arr[j] > aux)) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = aux;
        }
    }*/

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
}
