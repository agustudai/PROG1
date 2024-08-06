import TP05.correr_izq;

public class TIPO_PARCIAL2 {

    public static final int MAX = 21;
    public static final int CANT = 3;
    public static final int SEPARADOR = -1;
    public static void main(String[] args) {
        int[] arreglo = {-1,12,22,44,-1,23,34,55,-1,23,34,55,-1,23,34,55,-1,23,34,57,-1};
        imprimir_arreglo_secuencias_int(arreglo);
        procesar(arreglo);
        imprimir_arreglo_secuencias_int(arreglo);
    }

    public static void procesar(int[] arreglo){
        int inicio = MAX, fin = MAX;

        while(fin > 0){
            fin = buscar_fin(arreglo,inicio-1);
            if(fin > 0){
                inicio = buscar_inicio(arreglo,fin) + 1;
                int cantidad = repeticiones(arreglo,inicio,fin);
                if(cantidad >= CANT){
                    eliminar_secuencia(arreglo, inicio, fin);
                    fin = inicio;
                }
            }
        }
    }

    public static int repeticiones(int[] arreglo, int inicio, int fin){
        int ini_B = MAX, fin_B = MAX, total = 0;

        while(fin_B > 0){
            fin_B = buscar_fin(arreglo,ini_B-1);
            if(fin_B > 0){
                 ini_B = buscar_inicio(arreglo, fin_B)+1;
                if(son_iguales(arreglo,inicio,fin,ini_B,fin_B)){
                    total++;
                }
            }
        }
        return total;
    }

    public static boolean son_iguales(int[] arreglo, int inicio, int fin, int ini_B, int fin_B){
        while(inicio < fin && arreglo[inicio] == arreglo[ini_B]){
            inicio++;
            ini_B++;
        }
        return(inicio == fin && arreglo[inicio] == arreglo[ini_B]);
    }

    public static void eliminar_secuencia(int[] arreglo, int inicio, int fin) {
        for (int i = inicio; i <= fin; i++)
            correr_izq(arreglo, inicio);
    }
    public static void correr_izq(int[] arreglo,int pos){
        while(pos < MAX-1){
            arreglo[pos] = arreglo[pos+1];
            pos++;
        }
    }



    public static int buscar_inicio(int[] arreglo, int pos){
        while(pos > 0 && arreglo[pos] != SEPARADOR){
            pos--;
        }
        return pos;
    }

    public static int buscar_fin(int[] arreglo, int pos){
        while(pos > 0 && arreglo[pos] == SEPARADOR){
            pos--;
        }
        return pos;
    }

    public static void imprimir_arreglo_secuencias_int(int[] arr) {
        System.out.print("Arreglo de secuencias int\n|");
        for (int pos = 0; pos < MAX; pos++) {
            System.out.print(arr[pos] + "|");
        }
        System.out.print("\n");
    }
    
}
