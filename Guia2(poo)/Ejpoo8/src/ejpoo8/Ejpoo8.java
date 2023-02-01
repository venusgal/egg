
package ejpoo8;

import Entidades.Cadena;
import java.util.Locale;
import java.util.Scanner;


public class Ejpoo8 {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in).useDelimiter("\n").useLocale(Locale.ITALY);
        Cadena c1= new Cadena();
        System.out.println("Ingrese una frase");
        String f=sc.next().toLowerCase(Locale.ITALY);
        int lf=f.length();
        c1.MostrarVocales(f, lf);
        c1.Invertirfrase(f, lf);
        c1.vecesRepetido(f, lf);
        c1.CompararLongitudes(f, lf);
        c1.UnirFrases(f);
        c1.reemplazar(f, lf);
        c1.contiene(f, lf);
        
    }
    
}
