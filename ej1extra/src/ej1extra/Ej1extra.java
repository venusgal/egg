
package ej1extra;
import java.util.Scanner;

public class Ej1extra {

    
    public static void main(String[] args) {
       Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese los minutos");
        int min=leer.nextInt();
        int horas=min/60;
        int dias=horas/24;
        horas=horas%24;
        System.out.println(min+" son "+ dias+ " dias, "+ horas+" horas");
    }
    
}
