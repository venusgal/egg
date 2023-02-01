package Entidades;

import java.util.Locale;
import java.util.Scanner;


public class Circunferencia {
    Scanner sc=new Scanner(System.in).useDelimiter("\n").useLocale(Locale.ITALY);
    private double radio;
private double area;
private double per;

    public Circunferencia() {
    }

    public Circunferencia(double radio) {
       this.radio=0;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public double getRadio() {
        return radio;
    }

    public void CrearCircunferencia() {
       System.out.println("ingrese el radio");
        this.radio=sc.nextDouble();
    }
     public void area() {
    area=Math.PI*(Math.pow(radio, 2));
     }
     public void perimetro() {
         per=2*Math.PI*radio;
     }
     public void mostrar(){
         System.out.println("el area es: "+area+" y el perimetro es: "+per);
     }
}
