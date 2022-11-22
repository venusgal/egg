
package segundo.ejercicio;
 import java.util.Scanner;

public class SegundoEjercicio {

    
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int motor;
        System.out.println("ingrese un numero del 1 al 4");
        motor= leer.nextInt();
        switch (motor) {
            case 1:
                System.out.println("La bomba es una bomba de agua");    
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("la bomba es una bomba de hormigon");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
                    break;
            default:
                System.out.println("No existe un valor no válido para tipo de bomba");
               
        }
    }
}
