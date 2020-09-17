
package learning_programming;

import java.util.Scanner;

public class Learning_programming {

    public static void main(String[] args) {
        float base; 
        float altura; 
        float resultado; 
        Scanner tecla=new Scanner(System.in); 
        System.out.println("Ingrese la base"); 
        base=tecla.nextFloat();        
        if(base==0){
            System.out.println("Ingrese otro digito");
            base=tecla.nextFloat();
            }
        System.out.println("Ingrese la altura"); 
        altura=tecla.nextFloat();
        if(altura==0){
            System.out.println("Ingrese otro digito");
            altura=tecla.nextFloat();
            }
        resultado= base*altura; 
        System.out.println("El area del recutangulo es:" +resultado);
    }
    
}
