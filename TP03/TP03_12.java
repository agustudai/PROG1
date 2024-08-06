package TP03;
public class TP03_12 {
    
    public static final int MAX = 1000;
    public static final int numero = 4;
    public static void main (String[] args){

        jugar(numero);
    }


    public static void jugar(int numero){
        int cant = 0;

        for(int i = 1; i <= MAX; i++){
            int dado = tirarDado();
            if(dado == numero){
                System.out.println("El dado salio en la iteracion: "+ i);
                cant++;
            }

        }
        System.out.println("El dado con el numero: "+ numero +" salio "+ cant+ " veces");
    }

    public static int tirarDado(){
        return (int) (6*Math.random() + 1);
    }

     

}
