/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer.ejercicio;
import java.util.Scanner;
/**
 *
 * @author Windows 10 Pro
 */
public class PrimerEjercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1;
        int n2;
         Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el primer numero");
        n1 = leer.nextInt();
        System.out.println("ingrese el segundo numero");
        n2= leer.nextInt();
        int suma=n1+n2;
        System.out.println("el resultado de la suma es "+ suma);
    }
    
}
