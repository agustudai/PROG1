package TP06;

public class TP06_12 {
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
        for(int fila = 0; fila < N; fila++){
            System.out.println("Fila: " + fila);
            buscar_secuencia(mat[fila]);
        }
    }

    public static void buscar_secuencia(int[]mat){
        int inicio = M, fin = M;
        int vueltas = 0;
        
        while(fin >= 0 && vueltas < 2){
            fin = buscar_fin(mat,inicio-1);
            if(fin >= 0){
                inicio =  buscar_inicio(mat,fin);
                vueltas++;
            }
        }
        System.out.println("Inicio en: " + inicio + " termina en: " + fin);
    }

    public static int buscar_fin(int[]mat,int pos){
        while(pos > 0 && mat[pos] == SEPARADOR){
            pos--;
        }
        return pos;
    }

    public static int buscar_inicio(int[]mat,int pos){
        while(pos > 0 && mat[pos] != SEPARADOR){
            pos--;
        }
        return pos+1;
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
