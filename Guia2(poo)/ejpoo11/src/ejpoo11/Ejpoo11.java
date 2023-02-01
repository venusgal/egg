
package ejpoo11;
import java.util.Scanner;
import java.util.Date;
import java.util.Locale;
public class Ejpoo11 {

    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.ITALY);
         System.out.println("Ingrese una fecha para restarla a la actual");
         System.out.println("Ingrese el dia");
         int dia=sc.nextInt();
          System.out.println("Ingrese el mes");
         int mes=sc.nextInt();
          System.out.println("Ingrese el año");
         int anio=sc.nextInt();
         Date fecha= new Date(anio, mes, dia);
        fecha.setYear(fecha.getYear() - 1900);
        fecha.setMonth(fecha.getMonth() - 1);
         Date fechaAct=new Date();
         Diferencia(fecha, fechaAct);
         
    }
   public static void Diferencia(Date fecha, Date fechaAct){
       int dif=fechaAct.getYear()-fecha.getYear();
       System.out.println("la diferencia de años es: "+dif);
       
   }
}
