package TP03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TP03_BT1 {


  
    public static final int NO_STOCK = 0;
    public static void main(String[] args) {

        compra();

    }

    public static void compra() {
        int compra = Entrada_int();

        int ID_producto = 15, cantidad = 100;
        String fecha = "05/05", hora = "16:30", prioridad = "Baja", nombre = "Yerba";

        
        while (compra != 0) {
            if(compra > cantidad){ //excede la cantidad disponible
                System.out.println("La compra supera la cantidad disponible!");
                System.out.println("Cantidad disponible: "+ cantidad);

            }
            cantidad -= compra;
            if(compra >= cantidad * 0.3 && compra < cantidad * 0.7){//compra >= 30% ^ compra < 70%
                prioridad = "Media";
                System.out.println("La prioridad del producto pasara a ser media!");
                System.out.println("Actualize la fecha");
                fecha = Entrada_str();
                System.out.println("Cantidad restante: "+ cantidad);
                compra = Entrada_int();
            }else if(compra >= cantidad * 0.7 && compra < cantidad * 0.99){ //compra es superior al 70% 

                prioridad = "Alta";
                System.out.println("La prioridad del producto pasara a ser media!");
                System.out.println("Actualize la fecha");
                fecha = Entrada_str();
                System.out.println("Cantidad restante: "+ cantidad);
                compra = Entrada_int();
            }
            if(cantidad == NO_STOCK ){ //cant 0
                compra = 0;
                System.out.println("No hay más unidades del producto " + ID_producto
                + " "+ nombre);
                fecha = Entrada_str();
                hora = Entrada_str();

            }
            
        }

    }
    

    public static int Entrada_int() {
        int numero = 0;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {

            System.out.println("Introduzca un numero: ");
            numero = Integer.valueOf(entrada.readLine());

        } catch (Exception e) {
            System.out.println(e);
        }

        return numero;
    }
    public static String Entrada_str() {
        String cadena ="String" ;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {

            System.out.println("Introduzca un texto: ");
            cadena = entrada.readLine();
            

        } catch (Exception e) {
            System.out.println(e);
        }
        return cadena;
        
    }

}
