package TP03;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TP03_09 {
    
    public static void main(String[] args){
        caracteres();
    }

    public static void caracteres(){

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try{

            int numero;
            char letra;

            System.out.print("Ingrese un numero entre 1 y 10: ");
            numero = Integer.valueOf(entrada.readLine());


            while((numero >= 1) && (numero <= 10)){

                System.out.println("ingrese un caracter: ");
                letra = entrada.readLine().charAt(0);

                if((letra >= 'a') && (letra <= 'z')){
                    System.out.println("El caracter es una letra minuscula");
                }else if((letra >= 'A') && (letra <= 'Z')){
                    System.out.println("El caracter es una letra mayuscula");
                }else if((letra >= '1') && (letra <= '9')){
                    System.out.println("Es un digito");
                }else{
                    System.out.println("otro");
                }

                System.out.print("Ingrese un numero entre 1 y 10: ");
                numero = Integer.valueOf(entrada.readLine());

            }


        }catch(Exception e){
            System.out.println(e);
        }


    }

}
