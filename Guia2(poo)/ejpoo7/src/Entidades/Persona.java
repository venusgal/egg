
package Entidades;

import java.util.Locale;
import java.util.Scanner;


public class Persona {
    Scanner sc=new Scanner(System.in).useDelimiter("\n").useLocale(Locale.ITALY);
    private String nombre;
    private int edad;
    private char sexo;
    private int peso;
    private double altura;

    public Persona() {
    }

    public Persona(String nombre, int edad, char sexo, int peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo=sexo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void crearPersona(){
        System.out.println("Ingrese su nombre ");
        this.nombre=sc.next();
        System.out.println("Ingrese su edad ");
        this.edad=sc.nextInt();
        System.out.println("Ingrese su peso ");
        this.peso=sc.nextInt();
        System.out.println("Ingrese su altura ");
        this.altura=sc.nextDouble();
        
        do {
            System.out.println("Ingrese su sexo, solo puede ingresar F(femenino), M(masculino) o O(otro)");
           sexo=sc.next().toUpperCase().charAt(0); 
        } while (sexo!='F'&&sexo!='M'&&sexo!='O');
//        
    }
    public int calcularIMC(){
        double imc=peso/(altura*altura);
        int r;
        if (imc>25) {
           r=1; 
        }else if(imc<=25 || imc>=20){
            r= 0; 
        }else{
            r= -1;
        }
        return r;
    }
    public boolean MayorDeEdad(){
        return edad>17;
    }
    
}
