
package Servicio;

import Entidades.Cancion;
import java.util.Locale;
import java.util.Scanner;

public class CancionServicio {
    Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.ITALY);
   Cancion can=new Cancion();
   public void crearCancion(){
       System.out.println("Ingrese el titulo de la cancion");
       can.setTitulo(sc.next());
       System.out.println("Ingrese el autor de la cancion");
       can.setAutor(sc.next());
       
   }
   public void mostrar(){
       System.out.println("El autor es: "+can.getAutor());
       System.out.println("El titulo es: "+can.getTitulo());
   }
}
