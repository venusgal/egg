
package Entidades;

import java.util.Locale;
import java.util.Scanner;


public class Operaciones {
     Scanner sc=new Scanner(System.in).useDelimiter("\n").useLocale(Locale.ITALY);
    private int numero1;
    private int numero2;

    public Operaciones(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    

    public Operaciones() {
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    public void CrearOperacion(){
        System.out.println("Ingrese el primer numero");
        this.numero1=sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        this.numero2=sc.nextInt();
    }
    public void sumar(){
        System.out.println("la suma de los numeros es: "+(numero1+numero2));
    }
    public void restar(){
        System.out.println("la resta de los numeros es: "+(numero1-numero2));
    }
    public void dividir(){
        if (numero1==0||numero2==0) {
            System.out.println(0+"uno de los numeros ingresados es cero, NO se puede dividir");
        }else{
             System.out.println("la division de los numeros es: "+(numero1/numero2));
        }
    }
    public void multiplicar(){
        if (numero1==0||numero2==0) {
            System.out.println(0+"uno de los numeros ingresados es cero, NO se puede multiplicar");
        }else{
             System.out.println("la multiplicacion de los numeros es: "+(numero1*numero2));
        }
    }
    
}
