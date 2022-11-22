
package ej14;
import java.util.Scanner;

public class Ej14 {

    
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("ingrese la cantidid de euros");
        double euros= leer.nextInt();
        System.out.println("ingrese la moneda al que los quiere cambiar"); 
        String moneda= leer.next();
        moneda(euros, moneda);
                
    }
    public static void moneda (double e, String m){
        double resultado;
        switch (m){
            case "yen":
                  resultado=e*129.852;
                   System.out.println(e+" euros son "+resultado+" yenes");
                   break;
            case "dolar":
                resultado=e*1.28611;
                   System.out.println(e+" euros son "+resultado+" dolares");
                   break;
            case "libras":
                resultado=e*0.86;
                   System.out.println(e+" euros son "+resultado+" libras");
                   break;
            case "pesos":
                resultado=e*163.5;
                System.out.println(e+" euros son "+resultado+" pesos");
                break;
            default:
                System.out.println("no tenemos disponible esa moneda");
                break;
                       
        }
    }
    
                 
}
