package TP03;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TP03_11 {

    public static final int MAX = 101
    ;
    public static void main(String[] args){
        int num1,num2;
        for(int i = 1; i <= MAX; i++){
            num1 = Entrada();
            num2 = Entrada();
            System.out.println("El mayor es: "+ numero_mayor(num1, num2));
        }


    }

    public static int numero_mayor(int num1, int num2){
        if(num1 > num2){
            return num1;
        }
        return num2;
    }
    
    public static int Entrada(){
        int num = 0;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try{
            System.out.println("Ingrese un numero: ");
            num = Integer.valueOf(entrada.readLine());
        }catch(Exception e){
            System.out.println(e);
        }
        
        return num;
    }
}
