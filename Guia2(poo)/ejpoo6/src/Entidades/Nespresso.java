
package Entidades;

import java.util.Locale;
import java.util.Scanner;

public class Nespresso {
    private int capacidadMaxima;
    private int capacidadActual;

    public Nespresso() {
    }
    Scanner sc=new Scanner(System.in).useDelimiter("\n").useLocale(Locale.ITALY);

    public Nespresso(int capacidadMaxima, int capacidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadActual = capacidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }
    public void llenarCafetera(){
        capacidadMaxima=3000;
        capacidadActual=capacidadMaxima;
        System.out.println("la cafetera esta llena");
    }
    public void servirTaza(){
        System.out.println("Ingrese el tamaño de la taza vacia");
        int taza=sc.nextInt();
        if (taza>capacidadActual) {
            System.out.println("la taza tiene "+ capacidadActual+ "ml");
        }else{
            System.out.println("se lleno la taza");
        }
    }
    public void vaciarCafetera(){
        capacidadActual=0;
    }
    public void agregarCafe(){
        System.out.println("cuanto cafe va a ingresar");
        int cafe=sc.nextInt();
        capacidadActual+=cafe;
        System.out.println("la cafetera tiene "+ capacidadActual+"ml");
    }
}
