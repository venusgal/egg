
package Service;

import Entidades.PaisesEnt;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;
import java.util.TreeSet;


public class PaisesSer implements Comparable<PaisesEnt>{
    Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.ITALY);
    TreeSet <String> lista= new TreeSet();
    PaisesEnt pa= new PaisesEnt();
    public void ingresarPaises(){
        int op;
        do {
            System.out.println("Ingrese un pais"); 
            pa.setPais(sc.next());
            System.out.println("Desea ingresar otro pais? 1-si 2-no");
            op=sc.nextInt();
            lista.add(pa.getPais());
        } while (op==1);
        
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.sc);
        hash = 59 * hash + Objects.hashCode(this.lista);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PaisesSer other = (PaisesSer) obj;
        if (!Objects.equals(this.sc, other.sc)) {
            return false;
        }
        if (!Objects.equals(this.lista, other.lista)) {
            return false;
        }
        return true;
    }
    public void mostrar(){
        for (String aux : lista) {
            System.out.println(aux);
        }
    }
    public void eliminarPais(){
        System.out.println("Ingrese el nombre del pais que desea eliminar");
        String eliminar=sc.next();
        int con=0;
        for (String aux : lista) {
            if (eliminar.equals(aux)) {
                lista.remove(aux);
            }else{
                con++;
            }
        }
      
        if (con>lista.size()) {
            System.out.println("El pais no se encuentra en la lista");
        }
    }  

    @Override
    public int compareTo(PaisesEnt t) {
       return this.lista.first().compareTo(t.getPais());
    }
    
}
