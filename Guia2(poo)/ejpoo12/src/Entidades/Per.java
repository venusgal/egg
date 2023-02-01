/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Windows 10 Pro
 */
public class Per {
       Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.ITALY);
  public Date fecha;
  public String nombre;
  public Date fechaAct;
  public int edad;
    public Per() {
    }

    public Per(Date fecha, String nombre, Date fechaAct, int edad) {
        this.fecha = fecha;
        this.nombre = nombre;
        this.fechaAct = fechaAct;
        this.edad = edad;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaAct() {
        return fechaAct;
    }

    public void setFechaAct(Date fechaAct) {
        this.fechaAct = fechaAct;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

  public void CrearPersona(){
      System.out.println("Ingese su nombre");
      nombre=sc.next();
      System.out.println("Ingrese su fecha de nacimiento");
      int dia=sc.nextInt();
       System.out.println("Ingrese su fecha de nacimiento");
      int mes=sc.nextInt();
       System.out.println("Ingrese su fecha de nacimiento");
      int anio=sc.nextInt();
      fecha=new Date(anio, mes, dia);
      fecha.setYear(fecha.getYear() - 1900);
      fecha.setMonth(fecha.getMonth() - 1);
      
  }
  public void calcularEdad(){
      fechaAct=new Date();
      edad=fechaAct.getYear()-fecha.getYear();
       System.out.println("su edad es: "+edad);
  }
  public void menorQue(){
      boolean d=false;
      System.out.println("Ingrese otra edad para comparar");
      int edad2=sc.nextInt();
      System.out.println("usted es el mayor?");
      if (edad>edad2) {
          d=true;
          System.out.println(d);
      }else{
          System.out.println(d); 
      }
  }
  public void MostrarPersona(){
      System.out.println("su nombre es: "+ nombre);
      System.out.println("su fecha de nacimiento es: "+ fecha);
      System.out.println("su edad es: "+edad);
  }
}
