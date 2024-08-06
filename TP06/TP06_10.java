package TP06;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TP06_10 {
    public static final int N = 4;
    public static final int M = 20;
    public static final int SEPARADOR = 0;


    public static void main(String[] args){

        int mat[][] = {{0,1,5,6,0,0,2,4,5,9,0,0,2,2,0,4,1,3,0,0},
                       {0,0,4,8,1,0,1,3,5,0,6,5,3,0,1,1,2,0,0,0},
                       {0,9,5,1,0,1,4,2,0,0,0,3,3,1,0,4,1,4,0,0},
                       {0,0,0,1,4,0,2,5,1,0,0,0,9,4,1,0,0,0,0,0}};
        mostrar(mat);
        procesar(mat);
        mostrar(mat);
    }

    public static void procesar(int[][]mat){

        int fila = getNumero();
        int pos  = getNumero();
        
        buscar(mat[fila],pos);

    }

    public static void buscar(int[] mat,int pos){
        int fin = -1;
        boolean seguir = true;

        while(pos < M-1 && seguir){
            if(mat[pos] != SEPARADOR){
                pos = buscar_inicio_atras(mat,pos)+1;
            }else{
                pos = buscar_inicio(mat,pos);
            }

            if(pos == M-1){
                System.out.println("No se encontro secuencia");
            }else{                
                fin = buscar_fin(mat, pos);
                System.out.println("La secuencia empieza en: " + pos + " y termina en: " + fin);
            }
            seguir = false;
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

    public static int buscar_inicio_atras(int[]mat,int pos){
        while(pos > 0 && mat[pos] != SEPARADOR){
            pos--;
        }
        return pos;
    }

    public static int getNumero(){
        int numero = -1;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese un Numero: ");
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
