
package Entidades;

import java.util.Locale;
import java.util.Scanner;

public class Fracciones {
    Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.ITALY);
    private int numerador1;
    private int numerador2;
    private int denominador1;
    private int denominador2;

    public Fracciones() {
    }

    public Fracciones(int numerador1, int numerador2, int denominador1, int denominador2) {
        this.numerador1 = numerador1;
        this.numerador2 = numerador2;
        this.denominador1 = denominador1;
        this.denominador2 = denominador2;
    }

    public int getNumerador1() {
        return numerador1;
    }

    public void setNumerador1(int numerador1) {
        this.numerador1 = numerador1;
    }

    public int getNumerador2() {
        return numerador2;
    }

    public void setNumerador2(int numerador2) {
        this.numerador2 = numerador2;
    }

    public int getDenominador1() {
        return denominador1;
    }

    public void setDenominador1(int denominador1) {
        this.denominador1 = denominador1;
    }

    public int getDenominador2() {
        return denominador2;
    }

    public void setDenominador2(int denominador2) {
        this.denominador2 = denominador2;
    }
    public void frac(){
        System.out.println("Ingrese la primera fracción");
        System.out.println("ingrese el numrador");
        numerador1=sc.nextInt();
        System.out.println("ingrese el denominador");
        denominador1=sc.nextInt();
          System.out.println("Ingrese la segunda fracción");
        System.out.println("ingrese el numrador");
        numerador2=sc.nextInt();
        System.out.println("ingrese el denominador");
        denominador2=sc.nextInt();
    }
    public void dividir(){
        System.out.println("la division de "+numerador1+"/"+denominador1+" y "+numerador2+"/"+denominador2+" es: "+numerador1*denominador2+"/"+numerador2*denominador1);
    }
    
     public void multiplicar(){
        System.out.println("la multiplicacion de "+numerador1+"/"+denominador1+" y "+numerador2+"/"+denominador2+" es: "+numerador1*numerador2+"/"+denominador2*denominador1);
    }
     public void sumar(){
         int resul;
         int den;
         if (denominador1==denominador2) {
             resul= Math.round((numerador1*(denominador1/denominador1))+(numerador2*(denominador1/denominador1)));
             System.out.println("la suma de "+numerador1+"/"+denominador1+" y "+numerador2+"/"+denominador2+" es: "+ resul+"/"+denominador1);          
         }else{
            den=denominador1*denominador2;
              resul=((numerador1*(den/denominador1))+(numerador2*(den/denominador2)));
             System.out.println("la suma de "+numerador1+"/"+denominador1+" y "+numerador2+"/"+denominador2+" es: "+ resul+"/"+den);  
         }
     }
      public void restar(){
         int resul;
         int den;
         if (denominador1==denominador2) {
             resul= Math.round((numerador1*(denominador1/denominador1))-(numerador2*(denominador1/denominador1)));
             System.out.println("la resta de "+numerador1+"/"+denominador1+" y "+numerador2+"/"+denominador2+" es: "+ resul+ "/"+denominador1);          
         }else{
            den=denominador1*denominador2;
              resul=((numerador1*(den/denominador1))+(numerador2*(den/denominador2)));
             System.out.println("la suma de "+numerador1+"/"+denominador1+" y "+numerador2+"/"+denominador2+" es: "+ resul+"/"+den);  
         }
     }
     public void menu(){
         frac();
         int op;
         do{
          System.out.println(" ------------------------");
         System.out.println("|          menu          |");
         System.out.println(" ------------------------");
         System.out.println("| 1-sumar                ");
         System.out.println("| 2-restar               ");
         System.out.println("| 3-multiplicar          ");
         System.out.println("| 4-dividir              ");
         System.out.println("| 5-salir                ");
          System.out.println(" ------------------------");
          System.out.println("");
          System.out.println("Eliga una opcion");
          op=sc.nextInt();
          switch(op){
              case 1:
                  sumar();
                  break;
              case 2:
                  restar();
                   break;
              case 3:
                  multiplicar();
                   break;
              case 4:
                  dividir();
                   break;   
              case 5:
                  System.out.println("saliendo . . .");
          }
                  
         }while(op!=5);
     }
}
