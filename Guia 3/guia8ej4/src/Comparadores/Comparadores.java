
package Comparadores;

import Entidades.PeliculasEnt;
import java.util.Comparator;


public class Comparadores {
      public static Comparator<PeliculasEnt> ordenarDuracionAsc= new Comparator<PeliculasEnt>(){
        @Override
        public int compare(PeliculasEnt o1, PeliculasEnt o2) {
            return o2.getHoras().compareTo(o1.getHoras());
        }
        
    };
    public static Comparator<PeliculasEnt> ordenarDuracionDesc= new Comparator<PeliculasEnt>(){
        @Override
        public int compare(PeliculasEnt o1, PeliculasEnt o2) {
            return o1.getHoras().compareTo(o2.getHoras());
        }
        
    };
      public static Comparator<PeliculasEnt> ordenartirulo= new Comparator<PeliculasEnt>(){
        @Override
        public int compare(PeliculasEnt o1, PeliculasEnt o2) {
            return o1.getTitulo().compareTo(o2.getTitulo());
        } 
    };
        public static Comparator<PeliculasEnt> ordenarDirector= new Comparator<PeliculasEnt>(){
        @Override
        public int compare(PeliculasEnt o1, PeliculasEnt o2) {
            return o1.getDirector().compareTo(o2.getDirector());
        }
        
    };
}
