/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej9extra;
import java.util.Scanner;
public class Ej9extra {

    
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("ingrese el dividendo");
        int dividendo=leer.nextInt();
        System.out.println("Ingrese el divisor");
        int divisor=leer.nextInt();
        int c=0;
        do {
            dividendo=dividendo-divisor;
            c++;
        } while (dividendo>divisor);
        System.out.println("El resto es "+ dividendo+" y el cociente es: "+c);
    }
    
}
