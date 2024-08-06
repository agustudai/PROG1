package TP06;

public class TP06_14 {
    public static final int N = 4;
    public static final int M = 20;
    public static final char SEPARADOR = ' ';
    public static final int TAMANIO_PATRON = 3; 
    public static void main(String[] args){
        char mat[][] = {{' ','a','b','d',' ',' ','b','d','e','i',' ',' ','b','b',' ','d','a','c',' ',' '},
                        {' ',' ','d','h','a',' ','a','c','e',' ','f','e','c',' ','a','a','b','a',' ',' '},
                        {' ','i','e','a',' ','a','b','d',' ',' ',' ','c','c','a',' ','d','a','d',' ',' '},
                        {' ',' ',' ','a','d',' ','b','e','a',' ',' ',' ','i','d','a',' ',' ',' ',' ',' '}};
        char[] patron = {'a','b','d'};
        mostrar(mat);
        procesar(mat,patron);
        mostrar(mat);
    } 

    public static void procesar(char[][]mat,char[]patron){
        for(int fila = 0; fila < N; fila++){
            eliminar_secuencias(mat[fila],patron);
        }
    }

    public static void eliminar_secuencias(char[]mat,char[]patron){
        int inicio = 0,fin =-1;

        while(inicio < M - 1){
            inicio = buscar_inicio(mat,fin+1);
            if(inicio < M - 1){
                fin = buscar_fin(mat,inicio);
                int tam_sec = fin - inicio + 1;
                if(tam_sec == TAMANIO_PATRON && patron_secuencia(mat,inicio,fin,patron)){
                    while(inicio <= fin){
                        correr_izquierda(mat,inicio);
                        fin--;
                    }
                }
            }
        }
    }


    public static void correr_izquierda(char[] mat, int pos){
        while(pos < M-1){
            mat[pos] = mat[++pos];
        }
    }

    public static boolean patron_secuencia(char[] mat, int inicio, int fin, char[] patron){
        int ini_patron = 0;
    
        while((inicio < fin)&& mat[inicio] == patron[ini_patron]){
             ini_patron++;
             inicio++;
        }
        return (inicio == fin);
    }


    public static int buscar_inicio(char[]mat,int pos){
        while(pos < M - 1 && mat[pos] == SEPARADOR){
            pos++;
        }
        return pos;
    }

    public static int buscar_fin(char[]mat,int pos){
        while(pos < M - 1 && mat[pos] != SEPARADOR){
            pos++;
        }
        return pos-1;
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
