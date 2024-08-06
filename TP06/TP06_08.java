package TP06;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class TP06_08 {

    public static final int N = 4;
    public static final int M = 5;
    public static void main(String[] args){
        int matriz[][] = { {1,2,3,4,5},
                           {3,6,7,8,9},
                           {5,7,8,10,11},
                           {2,3,4,6,7}};
        
        mostrar(matriz);
        procesar(matriz);
        mostrar(matriz);
    }

    public static void procesar(int[][]mat){
        int fila = getNumero();
        int numero = getNumero();
        eliminar_numero(mat[fila], numero);
    }

    public static void eliminar_numero(int[]mat,int numero){
        boolean seguir = true;
        if(mat[M-1] == numero){
            mat[M-1] = numero+1;
            seguir = false;
        }
        for(int pos = 0; (pos < M-1) && seguir; pos++){
            if(mat[pos] == numero){
                correr_izquierda(mat,pos);
            }
        }
    }

    public static void correr_izquierda(int[] mat, int pos){
        int indice = M-1;
        while(pos < indice){
            mat[pos] = mat[++pos];
        }
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
}
