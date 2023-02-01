
package Service;

import Entidades.Ahorcado;
import java.util.Locale;
import java.util.Scanner;


public class ahorcadoService {
    Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.ITALY);
    Ahorcado ar=new Ahorcado();
    public void palabra(){
        System.out.println("Ingrese una palabra");
        ar.setPal(sc.next());
        for (int i = 0; i <ar.getPal().length() ; i++) {
            ar.getVector()[i]=ar.getPal().substring(i, i+1);
        }
    }
    public void longitud(){
        System.out.println("la longitud de la palabra es: "+ar.getPal().length());
    }
    public int buscar(){
        System.out.println("Ingrese una letra");
      String letra=sc.next();
      int con=0;
        for (int i = 0; i < ar.getPal().length(); i++) {
            if (ar.getPal().substring(i, i+1).equals(letra)) {
                con++;
            }
        }
        if (con>0) {
            System.out.println("la letra se encontro "+con); 
        }
        return con;
    }
    public void encontradas(){
        System.out.println("las letras encontradas son "+buscar()+" y las letras faltantes son "+ar.getPal().length());
    }
    public void intentos(){
        if () {
            
        }
                
    }
}
