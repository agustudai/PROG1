package TP06;

public class TP06_15 {
    public static final int N = 4;
    public static final int M = 20;
    public static final int SEPARADOR = ' ';

    public static void main(String[] args){
        char mat[][] = {{' ','d','b','a',' ',' ','b','d','e','i',' ',' ','b','b',' ','d','c','a',' ',' '},
                        {' ',' ','d','h','a',' ','a','c','e',' ','f','e','c',' ','a','a','b','a',' ',' '},
                        {' ','i','e','a',' ','a','b','d',' ',' ',' ','c','c','a',' ','d','a','d',' ',' '},
                        {' ',' ',' ','a','d',' ','b','e','a',' ',' ',' ','i','d','a',' ',' ',' ',' ',' '}};
        mostrar(mat);
        procesar(mat);
        mostrar(mat);

        
    }

    public static void procesar(char[][] mat){
        for(int fila = 0; fila < N; fila++){
            eliminar_secuencias(mat[fila]);
        }
    }

    public static void eliminar_secuencias(char[]mat){
        int inicio = 0, fin = -1;
        while(inicio < M -1){
            inicio = buscar_inicio(mat,fin+1);
            if(inicio < M - 1){
                fin = buscar_fin(mat,inicio);
                if(es_descendente(mat,inicio,fin)){
                    while(inicio <= fin){
                        correr_izquierda(mat,inicio);
                        fin--;
                    }
                }
            }
        }
    }

    public static void correr_izquierda(char[]mat,int pos){
        while(pos < M - 1){
            mat[pos] = mat[++pos];
        }
    }

    public static boolean es_descendente(char[]mat,int inicio,int fin){
        while(inicio < fin && mat[inicio] > mat[inicio+1]){
            inicio++;
        }
        return (inicio == fin);
    }

    public static int buscar_fin(char[]mat,int pos){
        while(pos < M -1 && mat[pos] != SEPARADOR){
            pos++;
        }
        return pos-1;
    }
    public static int buscar_inicio(char[]mat,int pos){
        while(pos < M - 1 && mat[pos] == SEPARADOR) {
            pos++;
        }
        return pos;
    }

    public static void mostrar(char mat[][]) {
        System.out.print("Arreglo de secuencias char\n|");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(mat[i][j] + "|");
            }
            System.out.print("\n");
        }
    }

}
