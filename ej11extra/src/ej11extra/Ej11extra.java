
package ej11extra;
import java.util.Scanner;

public class Ej11extra {

    public static void main(String[] args) {
          Scanner leer= new Scanner(System.in);
        System.out.println("ingrese un numero para saber la cantidad de digitos que tiene"); 
            int num=leer.nextInt();
            int c=1;
        while (num>9){
          num=num/10; 
            c++;
        } 
        System.out.println("el numero tiene "+ c+ " digitos");
    }
    
}
