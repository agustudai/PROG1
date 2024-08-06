package TP05;

public class TP05_05 {

    public static final int MAX = 10;

    public static void main(String[] args) {

        char[] arreglo = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j' };
        imprimir_arreglo_char(arreglo);
        invertir(arreglo);
        imprimir_arreglo_char(arreglo);
    }

    public static void invertir(char[] arreglo) {

        char tmp;
        for (int i = 0; i < MAX / 2; i++) {
            tmp = arreglo[i];//inicio
            int pos = (MAX - i - 1);//valores ultimos
            arreglo[i] = arreglo[pos];//cambio del primer valor por el ultimo
            arreglo[pos] = tmp;//cambio del ultimo valor por el primero
        }
    }

    public static void imprimir_arreglo_char(char[] arr) {
        for (int pos = 0; pos < MAX; pos++) {
            System.out.println("nombre_arreglo[" + pos + "]=>: " + arr[pos]);
        }
    }

}
