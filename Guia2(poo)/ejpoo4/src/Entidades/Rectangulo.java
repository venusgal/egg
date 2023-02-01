/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Windows 10 Pro
 */
public class Rectangulo {
     Scanner sc=new Scanner(System.in).useDelimiter("\n").useLocale(Locale.ITALY);
private int base;
private int altura;
    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    public void datos(){
        System.out.println("ingrese la base del rectangulo");
        this.base=sc.nextInt();
        System.out.println("ingrese la altura del rectangulo");
        this.altura=sc.nextInt();
    }
    public void superficie(){
        System.out.println("La superficie del rectangulo es: "+(base*altura));
    }
    public void perimetro(){
        System.out.println("El perimetro del rectangulo es: "+(2*base+2*altura));
    }
    public void rec(){
        int c=base;
         for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (i==0 || i==altura-1 || j==0||j==base-1) {
                    System.out.print(" *");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
}
    
}
