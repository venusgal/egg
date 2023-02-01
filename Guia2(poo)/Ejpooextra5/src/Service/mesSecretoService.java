
package Service;

import Entidades.mesSecreto;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class mesSecretoService {
     Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.ITALY);
    mesSecreto m= new mesSecreto();
    public void cmes(){
    m.getMes()[0]="enero";
    m.getMes()[1]="febrero";
    m.getMes()[2]="marzo";
    m.getMes()[3]="abril";
    m.getMes()[4]="mayo";
    m.getMes()[5]="junio";
    m.getMes()[6]="julio";
    m.getMes()[7]="agosto";
    m.getMes()[8]="septiembre";
    m.getMes()[9]="octubre";
    m.getMes()[10]="noviembre";
    m.getMes()[11]="diciembre";
    }
   public void as(){
       cmes();
       Random r= new Random();
       int num=r.nextInt(11);
       System.out.println(num);
       m.setMesSe(m.getMes()[num]);
       
   } 
   public void adivinar(){
       as();
       System.out.println("Adivine el mes!, ingrese un mes");
       String s=sc.next().toLowerCase();
       while(!(s.equals(m.getMesSe()))){
           System.out.println("No ha acertado, intente otra vez");
           s=sc.next();
       }
       System.out.println("Has acertado!!");

   }

    
}
