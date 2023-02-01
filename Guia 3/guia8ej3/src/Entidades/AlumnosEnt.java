
package Entidades;

import java.util.ArrayList;
import java.util.List;


public class AlumnosEnt {
    private String nombre;
    private List<Integer> notas;
    
    public AlumnosEnt(){
        this.notas = new ArrayList<Integer>();
    }

    public AlumnosEnt(String nombre, List<Integer> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Integer> getNotas() {
        return notas;
    }

    public void setNotas(List<Integer> notas) {
        this.notas = notas;
    }

   

   
}
