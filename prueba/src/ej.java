/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Windows 10 Pro
 */
public class ej {
    public void setAltura(int altura) {
        
        this.altura = altura;
    }
    
    public void datos(){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Ingresar base");
        this.base=Sc.nextInt();
        System.out.println("Ingresar Altura");
        this.altura=Sc.nextInt();
    }
    public void superficie(){
        System.out.println("La superfice es tanto: "+(base*altura) );
        
        
    }
     public void perimetro(){
         System.out.println("El perimetro es: "+(base * altura)*2);
         
     }
     
     public void dibujo(){
              for (int i = 0; i < altura ; i++) {
                  for (int j = 0; j < base; j++) {
                      System.out.print("*");
                      
                      
                  }
                  System.out.println(" ");
             
         }
     }
}
public class Banco {
    Scanner Sc = new Scanner(System.in);
    
    private int numeroCuenta;
    private long dni;
    private int saldoActual;
    

    public Banco() {
    }

    public Banco(int numeroCuenta, long dni, int saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDni() {
        return dni;
    }
public void setDni(long dni) {
        this.dni = dni;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }
     
    public void cuenta(){
        
        System.out.println("Ingrese numero de cuenta");
        this.numeroCuenta=Sc.nextInt();
          System.out.println("Ingrese numero de DNI");
        this.dni=Sc.nextLong();
    }
    public void ingresar(){
        double ingresar;
        System.out.println("Ingresar Dinero");
        ingresar=Sc.nextDouble();
        this.saldoActual+=ingresar;
        
        
        
    }
    public void retirar(){
      double retirar;
        System.out.println("Cuanto desea retirar");
        retirar=Sc.nextDouble();
        if (retirar>saldoActual) {
            
            saldoActual=0;
            
        }else{
            saldoActual-=retirar;
        }
De Hernan.M.M para todos 09:57 PM
    }
public void extRapida(){
        double retirar;
        System.out.println("retirar 20%");
        retirar=Sc.nextDouble();
        if(retirar>(saldoActual*0.2)){
            System.out.println("No se puede retirar su saldo es: "+saldoActual);
            
        }else{
            saldoActual-=retirar;
        }
            
    }
public class Banco {
    Scanner Sc = new Scanner(System.in);
    
    private int numeroCuenta;
    private long dni;
    private int saldoActual;
    

    public Banco() {
    }

    public Banco(int numeroCuenta, long dni, int saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDni() {
        return dni;
    }

}
public class Banco {
    Scanner Sc = new Scanner(System.in);
    
    private int numeroCuenta;
    private long dni;
    private int saldoActual;
    

    public Banco() {
    }

    public Banco(int numeroCuenta, long dni, int saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDni() {
        return dni;
    }
        this.numeroCuenta=Sc.nextInt();
          System.out.println("Ingrese numero de DNI");
        this.dni=Sc.nextLong();
    }
    public void ingresar(){
        double ingresar;
        System.out.println("Ingresar Dinero");
        ingresar=Sc.nextDouble();
        this.saldoActual+=ingresar;
        
        
        
    }
    public void retirar(){
      double retirar;
        System.out.println("Cuanto desea retirar");
        retirar=Sc.nextDouble();
        if (retirar>saldoActual) {
            
            saldoActual=0;
            
        }else{
            saldoActual-=retirar;
        }
De Hernan.M.M para todos 09:57 PM
    }

package ejpoo4;

import java.util.Locale;
import java.util.Scanner;
public class Reactangulo {
     Scanner sc=new Scanner(System.in).useDelimiter("\n").useLocale(Locale.ITALY);
private int base;
private int altura;
    public Reactangulo() {
    }

    public Reactangulo(int base, int altura) {
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
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (i==0 || i==altura||j==0||j==base) {
                    System.out.print("* ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
}
    
}