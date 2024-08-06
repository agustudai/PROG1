package TP05;

public class buscar_el {

    public static final int MAX = 10;

    public static void main(String[] args) {

        int[] arreglo = {12,3,6,23,3,8,9,7,4,6};
        System.out.println(buscar_pos_desordenado(arreglo, 6));

    }

    private static int buscar_pos_desordenado(int[] arr, int valor) {
        int pos = 0;
        while ((pos < MAX) && (arr[pos] != valor)) {
            pos++;
        }
        if (pos < MAX)
            return pos;
        else
            return -1;

    }

}
