
package Service;

import Entidades.Puntos;
import java.util.Locale;
import java.util.Scanner;
public class PuntosService {
    Puntos p=new Puntos();
    Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.ITALY);
    public void CrearPuntos(){
        System.out.println("Ingrese las coordenadas de los puntos ");
        System.out.println("Punto 1");
        System.out.println("Ingrese x1");
        p.setX1(sc.nextInt());
         System.out.println("Ingrese y1");
        p.setY1(sc.nextInt());
         System.out.println("Punto 2");
        System.out.println("Ingrese x2");
        p.setX1(sc.nextInt());
         System.out.println("Ingrese y2");
        p.setY1(sc.nextInt());
    }
    public void Calcular(){
        CrearPuntos();
        double dis;
        dis=Math.sqrt(Math.pow((p.getX2()-p.getX1()), 2)+Math.pow((p.getY2()-p.getY1()), 2));
        System.out.println("La distancia entre los dos puntos es; " + dis);
    }
}
