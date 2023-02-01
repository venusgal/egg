
package Entidades;

import java.util.Locale;
import java.util.Scanner;


public class Cuenta {
    Scanner sc=new Scanner(System.in).useDelimiter("\n").useLocale(Locale.ITALY);
    private int numCuenta;
    private long DNI;
    private int saldo;

    public Cuenta() {
    }

    public Cuenta(int numCuenta, long DNI, int saldo) {
        this.numCuenta = numCuenta;
        this.DNI = DNI;
        this.saldo = saldo;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    public void CrearCuenta(){
        System.out.println("Ingrese su numero de cuenta");
        this.numCuenta=sc.nextInt();
        System.out.println("Ingrese su DNI");
        this.DNI=sc.nextLong();
        System.out.println("Ingrese su saldo");
        this.saldo=sc.nextInt();
    }
    public void menu(){
           System.out.println(" ___________________ ");
        System.out.println("|        Menu       |");
        System.out.println("|1-ingresar dinero  |");
        System.out.println("|2-retirar dinero   |");
        System.out.println("|3-extraccion rapida|");
        System.out.println("|4-consultar saldo  |");
        System.out.println("|5-consultar datos  |");
        System.out.println("|6-salir            |");
        System.out.println("|___________________|");
        int opcion=sc.nextInt();
        do {
            System.out.println(" ___________________ ");
        System.out.println("|        Menu       |");
        System.out.println("|1-ingresar dinero  |");
        System.out.println("|2-retirar dinero   |");
        System.out.println("|3-extraccion rapida|");
        System.out.println("|4-consultar saldo  |");
        System.out.println("|5-consultar datos  |");
        System.out.println("|6-salir            |");
        System.out.println("|___________________|");
        opcion=sc.nextInt();
        switch (opcion){
            case 1:
                System.out.println("cuanto desea ingresar?");
                int dinero=sc.nextInt();
                this.saldo+=dinero;
                break;
            case 2:
                System.out.println("cuanto desea retirar?");
                dinero=sc.nextInt();
                if (dinero>saldo){
                    saldo=0;
                }else{
                   saldo-=dinero;
                }
                break;
            case 3:
                System.out.println("cuanto desea retirar?");
                dinero=sc.nextInt();
                if (dinero>(saldo*0.20)){
                    System.out.println("solo se puede retirar hasta el 20%");
                }else{
                    saldo-=dinero;
                }
                break;
            case 4:
                System.out.println("el saldo actual es: "+saldo);
                break;
            case 5: 
                System.out.println("el numero de cuenta es: "+ numCuenta+ ", su DNI es: "+ DNI+ ", su saldo actual es: "+saldo);
                break;
        }
        } while (opcion!=6);
        
        
        
           
        
    }
}
