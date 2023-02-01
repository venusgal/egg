package Entidades;

import java.util.Date;

public class AlumEnt {
    private String nombre;
    private String apellido;
    private String nacio;
    public int dia;
    public int mes;
    public int anio;
    public Date nacimiento= new Date(anio, mes, dia);

    public AlumEnt() {
    }

    public AlumEnt(String nombre, String apellido, String nacio, int dia, int mes, int anio, Date nacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacio = nacio;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.nacimiento = nacimiento;
    }

  

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacio() {
        return nacio;
    }

    public void setNacio(String nacio) {
        this.nacio = nacio;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

  


 
}
