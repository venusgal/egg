
package Entidades;

import java.util.Locale;
import java.util.Scanner;

public class Movil {
    Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.ITALY);
    private String marca;
    private double precio;
    private String modelo;
    private int memoriaRam;
    private int almacenamiento;
    private int codigo[]=new int[7];

    public Movil() {
    }

    public Movil(String marca, double precio, String modelo, int memoriaRam, int almacenamiento) {
        this.marca = marca;
        this.precio = precio;
        this.modelo = modelo;
        this.memoriaRam = memoriaRam;
        this.almacenamiento = almacenamiento;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int[] getCodigo() {
        return codigo;
    }

    public void setCodigo(int[] codigo) {
        this.codigo = codigo;
    }
    public void cargarCelular(){
        System.out.println("Ingrese la marca");
        marca=sc.next();
         System.out.println("Ingrese el modelo");
        modelo=sc.next();
        System.out.println("Ingrese el precio");
        precio=sc.nextDouble();
        System.out.println("Ingrese la memoria RAM ");
        memoriaRam=sc.nextInt();
        System.out.println("Ingrese el almacenamiento");
        almacenamiento=sc.nextInt();
        
    }
    public void ingresarCodigo(){
        System.out.println("Ingrese el codigo");
        for (int i = 0; i < 7; i++) {
            System.out.println("ingrese el numero "+(i+1));
            codigo[i]=sc.nextInt();
        }
    }
    public void mostrar(){
        System.out.println("la marca es: "+ marca);
        System.out.println("el modelo es: "+ modelo);
        System.out.println("el precio es: "+ precio);
        System.out.println("la memoria RAM es: "+ memoriaRam);
        System.out.println("el almacenamiento es: "+almacenamiento);
        
        System.out.print("el codigo es: ");
        for (int i = 0; i < 7; i++) {
        System.out.print(codigo[i]);
        }
          
    }
}
