package TP03;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class TP03_14 {

    public static void main(String[] args) {
        
        char caraceter = Entrada();

        while(caraceter != '*'){
            comprobar_caracter(caraceter);
            caraceter = Entrada();
        }


    }


    public static void comprobar_caracter(char caracter){

        if(caracter >='0' && caracter <='9'){
            System.out.println("caracter digito");
        }else if(caracter >='a' && caracter <= 'z'){
            System.out.println("El caraceter es una letra: ");
            if(caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u'){
                System.out.println("vocal");
            }else{
                System.out.println("consonante");
            }
        }else{
            System.out.println("otro");
        }

    }

    public static char Entrada(){
        char caracter = '0';

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try{

            System.out.println("Ingrese un caracter: ");
            caracter = entrada.readLine().charAt(0);

        }catch(Exception e){
            System.out.println(e);
        }

        return caracter;
    }
    
}
