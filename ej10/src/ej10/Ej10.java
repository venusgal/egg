/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej10;
import java.util.Scanner;
/**
 *
 * @author Windows 10 Pro
 */
public class Ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // EJERCICIO 10:  Realizar un programa que lea 4 números (comprendidos entre 1 y 20) 
        // e imprima el número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
        //      5 *****
        //      3 ***
        //      11 ***********
        //      2 **
        
        Scanner sc = new Scanner(System.in);
        int num, cont = 0;
        
        do {            
            System.out.println("Ingrese un numero entre 1 y 20");
            num = sc.nextInt();
            System.out.print(num + " ");
            for (int i = 0; i < num; i++) {
                //System.out.print(num + " "); 
                System.out.print("*");
            }
            cont++;
            System.out.println(" ");
        } while (cont<4);
        
    }
    
}

}
