/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicional;
import java.util.Scanner;
/**
 *
 * @author Windows 10 Pro
 */
public class Condicional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opinion;
        Scanner leer = new Scanner(System.in);
        System.out.println("clasifique la peli de 1 a 5 estrellas");
        opinion = leer.nextInt();
        if (opinion>=1 && opinion<=5)
            switch (opinion){
                case 1:
                case 2:
                    System.out.println("nos sentimos apenados de que no te gustara la peli");
                    break;
                case 3:
                    System.out.println("Has calificado la peli como buena");
                    break;
                case 4:
                    System.out.println("has calificado la peli como muy buena");
                    break;
                case 5:
                    System.out.println("nos encanta que te haya gustado la peli");
                    break;
                    
    
    
    } else if (opinion<0){
         System.out.println("tan mala fue la pelicula? :(");
    } else if (opinion==0){
    System.out.println("esa calificacion no es valida");
    
    } else if (opinion>5){
    System.out.println("se ve que te encanto la peli :D");
    }
    System.out.println("Hasta la proxima");
}
    
}
