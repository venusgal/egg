
package Service;

import Entidades.AlumnosEnt;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class AlumnosSer {
Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.ITALY);
ArrayList <AlumnosEnt> lista=new ArrayList();

public void crearAlumnos(){
     int op;
    do {
    
        System.out.println("Ingrese el nombre del alumno");
         String Nombre=sc.next();
         System.out.println("Ingrese la nota "+ 1);
         int nota1=sc.nextInt();
          System.out.println("Ingrese la nota "+2);
          int nota2=sc.nextInt();
           System.out.println("Ingrese la nota "+3);
           int nota3=sc.nextInt();
           ArrayList <Integer> no= new ArrayList();
           no.add(nota1);
           no.add(nota2);
           no.add(nota3);
        System.out.println("Desea ingresar otro alumno? 1-Si 2-No");
        op=sc.nextInt();
        AlumnosEnt alumnos=new AlumnosEnt(Nombre, no);
        lista.add(alumnos);   
    }while(op==1);


}
public void mostrarAlumnos(){
    crearAlumnos();
      System.out.println("Ingrese el nombre del alumno para calcular su nota final");
        String nombre=sc.next();
        double not=0;
        int con=0;
        for (int i = 0; i < lista.size(); i++) {
            String n=(lista.get(i).getNombre());
            if (n.equals(nombre)) {
                for (int j = 0; j < 3; j++) {
                    not+=lista.get(i).getNotas().get(j);
                }
            }else{
                con++;
            }
           
        }
        System.out.println(not);
        if (con>=3) {
            System.out.println("El alumno no se encuentra en la lista");
        }else{
             System.out.println("la nota final del alumno "+ nombre+" es: "+ (not/3));
        }
}

}


