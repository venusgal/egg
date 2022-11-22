/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej16;
import java.util.Scanner;

public class Ej16 {

    
    public static void main(String[] args) {
      Scanner leer= new Scanner(System.in);
        System.out.println("que tamaño desea de vector");
        int num= leer.nextInt();
        int [] vec=new int[num];
        for (int i=0; i<num; i++){
            vec[i]=(int) (Math.random()*10);
           
        }
        for (int i = 0; i < num; i++) {
            System.out.print("["+ vec[i]+ "]");
        }
        System.out.println("que numero desea buscar");
        int numb=leer.nextInt();
        int suma=0;
        for (int i = 0; i < num; i++) {
            if (vec[i]==numb) {
                System.out.println("el numero esta en la posicion "+(i+1));
            }else{
                suma=suma+1;
            }
        }
        if (suma==num){ 
            System.out.println("el numero no se encuentra en el vector");
        }
    }
    
}
