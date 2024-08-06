package TP03;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TP03_13 {

    public static void main(String[] args) {
        calculos();
    }

    public static void calculos(){
        int num1,num2,num3;
        System.out.println("Ingrese operacion: 1 raiz cuadradad, 2 promedio, 3 cociente");
        int op = Entrada();
        num1 = Entrada();
        num2 = Entrada();
        num3 = Entrada();
        double calculo = 0;
        switch(op){
            case 1:{
                calculo = Math.sqrt((num1 - num3));
                break;
            }
            case 2:{
                calculo = (num1 + num2 + num3)/3;
                break;
            }
            case 3:{
                calculo = ((double)(num3 - num2)/num1);
                break;
            }
            default:{
                System.out.println("Ingrese una opcion valida");
            }
        }
        System.out.println("El resultado del calculo es: "+ calculo);


    }

    public static int Entrada(){
        int numero = 0;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try{

            System.out.println("Ingrese un numero: ");
            numero = Integer.valueOf(entrada.readLine());

        }catch(Exception e){
           
            System.out.println(e);
       
        }

        return numero;
    }
    
    
}
