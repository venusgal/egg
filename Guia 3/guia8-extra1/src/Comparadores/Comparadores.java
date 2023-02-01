
package Comparadores;

import Entidades.AlumEnt;
import java.util.Comparator;


public class Comparadores {
    public static Comparator<AlumEnt> ordenarApeAsc= new Comparator<AlumEnt>() {
        @Override
        public int compare(AlumEnt o1, AlumEnt o2) {
            return o2.getApellido().compareTo(o1.getApellido());
        }
       
    };
    public static Comparator<AlumEnt> ordenarNomDes= new Comparator<AlumEnt>() {
        @Override
        public int compare(AlumEnt o1, AlumEnt o2) {
            return o1.getNombre().compareTo(o2.getNombre());
        }
       
    };
    
}
