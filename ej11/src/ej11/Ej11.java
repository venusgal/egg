
package ej11;

import java.util.Scanner;


public class Ej11 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int num = leer.nextInt();
        for (int i= 0; i<num ; i++) {
            for (int j= 0; j< num ; j++) {
                if ((i==0 || j==0) || (i==num-1 || j==num-1)){
                System.out.print("* ");
                }else{
                        
                System.out.print("  ");}
            }
            System.out.println(" ");
            
        }
    }
}

