package TP03;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TP03_10 {

    public static void main(String[] args) {

        comun_multiplo();


    }

    public static void comun_multiplo() {
        int numero;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {

            System.out.print("Ingrese un numero entre 1 y 10: ");
            numero = Integer.valueOf(entrada.readLine());

            while (numero >= 1 && numero <= 10) {

                if (numero % 3 == 0) {
                    ingresar_caracter();
                } else if (numero % 5 == 0) {
                    tabla_del_9();
                } else {
                    System.out.println("El numero ingresado no es multipo de 3 o 5");
                }
                System.out.print("Ingrese un numero entre 1 y 10: ");
                numero = Integer.valueOf(entrada.readLine());

            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void ingresar_caracter() {
        char caracter;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingregese un caraceter: ");
            caracter = entrada.readLine().charAt(0);
            tipo_caracter(caracter);

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void tabla_del_9() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i * 9);
        }
    }

    public static void tipo_caracter(char caracter) {
        if ((caracter >= 'a') && (caracter <= 'z')) {
            System.out.println("El caracter es una letra minuscula");
        } else if ((caracter >= 'A') && (caracter <= 'Z')) {
            System.out.println("El caracter es una letra mayuscula");
        } else if ((caracter >= '1') && (caracter <= '9')) {
            System.out.println("Es un digito");
        } else {
            System.out.println("otro");
        }
    }

}
