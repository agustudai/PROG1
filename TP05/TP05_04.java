package TP05;

import java.util.Random;

public class TP05_04 {

    public static final int MAX = 10;

    public static void main(String[] args) {
        char[] arreglo = new char[MAX];
        cargar_arreglo_aleatorio_char(arreglo);
        imprimir_arreglo_char(arreglo);
        int pos = obt_pos_arreglo(arreglo, 'c');
        if (pos < MAX) {
            System.out.print("La posicion es : " + pos);
        } else {
            System.out.println("No se encuentra la posicion del elemento");
        }
    }

    public static int obt_pos_arreglo(char[] arreglo, char caracter) {
        int pos = 0;

        while ((pos < MAX) && (arreglo[pos] != caracter)) {
            pos++;
        }

        return pos;
    }

    public static void cargar_arreglo_aleatorio_char(char[] arr) {
        Random r = new Random();
        for (int pos = 0; pos < MAX; pos++) {
            arr[pos] = (char) (r.nextInt(26) + 'a');
        }
    }

    public static void imprimir_arreglo_char(char[] arr) {
        for (int pos = 0; pos < MAX; pos++) {
            System.out.println("nombre_arreglo[" + pos + "]=>: " + arr[pos]);
        }
    }

}
