
public class TIPO_PARCIAL {

    public static final int MAX = 42;
    public static final int MAXB = 20;

    public static void main(String[] args) {
        char[] frase = {' ','l','a',' ','c','a','s','a',' ','r','o','j','a',',',' ','a',' ','l','a',' ','v','u','e','l','t','a',' ','d','e',' ','l','a',' ','e','s','q','u','i','n','a','.',' '};
        char[] stp = {' ','a', ' ', 'l', 'o', ' ', 'l', 'o', 's', ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'l', 'a', 's', ' ' };

        imprimir_arreglo_secuencias_int(frase);
        imprimir_arreglo_secuencias_int_B(stp);
        procesar(frase, stp);
        imprimir_arreglo_secuencias_int(frase);

    }

    public static void procesar(char[] frase, char[] stp) {

        int inicio = 0, fin = -1;

        while (inicio < MAX) {
            inicio = obtener_inicio(frase, fin + 1,MAX);
            if (inicio < MAX) {
                fin = obtener_fin(frase, inicio,MAX);
                int tam = fin - inicio + 1;
                if (es_stopword(frase, stp, inicio, fin,tam)) {
                    while (inicio <= fin) {
                        correr_izq(frase, inicio);
                        fin--;
                    }
                }
            }
        }
    }

    public static void correr_izq(char[] arreglo, int pos) {
        while (pos < MAX - 1) {
            arreglo[pos] = arreglo[pos + 1];
            pos++;
        }
    }

    public static boolean es_stopword(char[] frase, char[] stp, int inicio, int fin,int tam_A) {
        boolean son_iguales = false;
        int ini_stp = 0, fin_stp = -1;

        while (ini_stp < MAXB && !son_iguales) {
            ini_stp = obtener_inicio(stp, fin_stp + 1,MAXB);
            if (ini_stp < MAXB) {
                fin_stp = obtener_fin(stp, ini_stp,MAXB);
               int tam_B = fin_stp - ini_stp + 1;
               if(tam_A == tam_B){
                int i = inicio; 
                int k = ini_stp;
                    while(i < fin && frase[i] == stp[k]){
                        i++;
                        k++;
                    }
                    if( i == fin && frase[i] == stp[k]){
                        son_iguales = true;
                    }
               }
            }

        }

        return son_iguales;
    }


    public static int obtener_inicio(char[] arreglo, int pos,int MAXARR) {

        while (pos < MAXARR && arreglo[pos] == ' ') {
            pos++;
        }
        return pos;
    }

    public static int obtener_fin(char[] arreglo, int pos,int MAXARR) {
        while (pos < MAXARR && arreglo[pos] != ' ') {
            pos++;
        }
        return pos - 1;
    }

    public static void imprimir_arreglo_secuencias_int(char[] arr) {
        System.out.print("Arreglo de secuencias int\n|");
        for (int pos = 0; pos < MAX; pos++) {
            System.out.print(arr[pos] + "|");
        }
        System.out.print("\n");
    }
    public static void imprimir_arreglo_secuencias_int_B(char[] arr) {
        System.out.print("Arreglo de secuencias int\n|");
        for (int pos = 0; pos < MAXB; pos++) {
            System.out.print(arr[pos] + "|");
        }
        System.out.print("\n");
    }

}
