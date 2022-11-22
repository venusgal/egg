
package ej3extra;
import java.util.Scanner;

public class Ej3extra {

    
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese una letra");
        String letra=leer.next();
        if (letra.equals("a")|| letra.equals("e")|| letra.equals("i")|| letra.equals("o")|| letra.equals("u")) {
            System.out.println("La lera ingresada es una vocal");
        }else{
            System.out.println("La letra ingresada NO es una vocal");
        }
    }
    
}
