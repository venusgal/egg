
package ej10extra;
import java.util.Scanner;
public class Ej10extra {

    
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int num=(int)(Math.random()*10);
        int num2=(int)(Math.random()*10);
        int numa=num*num2;
        System.out.println("adivine el numero"); 
            int adi=leer.nextInt();
        do {
            System.out.println("adivine el numero"); 
            adi=leer.nextInt();
            
        } while (adi!=numa);
        System.out.println("Felicidades!! adivinaste el numero");
    }
    
}
