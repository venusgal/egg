
package Service;

import Entidades.AlumEnt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class AlumSer {
     Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.ITALY);
    ArrayList <AlumEnt>alumnos=new ArrayList();
        ArrayList <AlumEnt>Argentina=new ArrayList();
        ArrayList <AlumEnt>Chile=new ArrayList();
        ArrayList <AlumEnt>Venezuela=new ArrayList();
    public AlumEnt alta(){
        AlumEnt per=new AlumEnt();
        int op;
         String nacim="";
        System.out.println("Ingrese el nombre del alumno");
        per.setNombre(sc.next());
        System.out.println("Ingrese el apellido del alumno");
        per.setApellido(sc.next());
            do {
                System.out.println("ingrese su nacionalidad");
                nacim=sc.next().toUpperCase();
            } while (!nacim.equals("ARGENTINA")&& !nacim.equals("CHILE")&&!nacim.equals("VENEZUELA"));
        per.setNacio(nacim);
        System.out.println("Ingrese su fecha de nacimiento");
        System.out.println("Dia");
        per.setDia(sc.nextInt());
        System.out.println("mes");
        per.setMes(sc.nextInt());
        System.out.println("anio");
        per.setAnio(sc.nextInt());
        return per;
    }
    public void baja(){
        int con=0;
        System.out.println("Ingrese el nombre y apellido para dar de baja al alumno");
        System.out.println("Nombre");
        String nom=sc.next();
        System.out.println("Apellido");
        String ape=sc.next();
        for (int i = 0; i < alumnos.size(); i++) {
            if (nom.equals(alumnos.get(i).getNombre()) && nom.equals(alumnos.get(i).getApellido())) {
                alumnos.remove(alumnos.get(i));
            }else{
                con++;
            }
        }
        if (con>alumnos.size()) {
            System.out.println("El alumno no se encuentra en la lista");  
        }
    }
    public void modificar(){
         int con=0;
        System.out.println("Ingrese el nombre y apellido del alumno que desea modificar");
        System.out.println("Nombre");
        String nom=sc.next();
        System.out.println("Apellido");
        String ape=sc.next();
        for (int i = 0; i < alumnos.size(); i++) {
            if (nom.equals(alumnos.get(i).getNombre()) && ape.equals(alumnos.get(i).getApellido())) {
                System.out.println("Ingrese el nuevo nombre");
                alumnos.get(i).setNombre(sc.next());
                 System.out.println("Ingrese el nuevo apellido");
                alumnos.get(i).setApellido(sc.next());
                 do {
                System.out.println("ingrese su nacionalidad");
                alumnos.get(i).setNacio(sc.next().toUpperCase());
            } while (!(alumnos.get(i).getNacio()).equals("ARGENTINA")&& !(alumnos.get(i).getNacio()).equals("CHILE")&&!(alumnos.get(i).getNacio()).equals("VENEZUELA"));
        
        System.out.println("Ingrese su fecha de nacimiento");
        System.out.println("Dia");
        alumnos.get(i).setDia(sc.nextInt());
        System.out.println("mes");
        alumnos.get(i).setMes(sc.nextInt());
        System.out.println("anio");
        alumnos.get(i).setAnio(sc.nextInt());
            }else{
                con++;
            }
        }
        if (con>alumnos.size()) {
            System.out.println("El alumno no se encuentra en la lista");  
        }
    }
    public void cargaralm(){
        System.out.println("Cuantos alumnos desea ingresar?");
        int alm=sc.nextInt();
        for (int i = 0; i < alm; i++) {
          alumnos.add(alta());
          
        }
    }
    public void mostrar(){
        for (AlumEnt alumno : alumnos) {
            System.out.println(alumno.getNombre()+"   "+alumno.getApellido());
        }
    }
    public void mostrarAlum(){
        System.out.println("Ingrese el nombre y apellido del alumno que desea que se muestre");
        System.out.println("Nombre");
        String nom=sc.next();
        System.out.println("Apellido");
        String ape=sc.next();
        for (AlumEnt alumno : alumnos) {
            if (alumno.getNombre().equals(nom) && alumno.getApellido().equals(ape)) {
                System.out.println("Nombre: "+alumno.getNombre());
                System.out.println("Apellido: "+alumno.getApellido());
                System.out.println("Fecha de nacimiento: "+alumno.getNacimiento());
                System.out.println("Nacionalidad: "+ alumno.getNacio());
            }
        }
    }
    public void listasParalelas(){
        for (int i = 0; i < alumnos.size(); i++) {
            if (alumnos.get(i).getNacio().equals("ARGENTIINA")) {
                Argentina.add(alumnos.get(i));
            }else if(alumnos.get(i).equals("CHILE")){
                Chile.add(alumnos.get(i));
            }else{
                Venezuela.add(alumnos.get(i));
            }
            
        }
    }
    public void reporte(){
        int con1=0;
        int con2=0;
        Date fActual= new Date();
        for (int i = 0; i < alumnos.size(); i++) {
            if ((alumnos.get(i).getNacimiento().getYear()-fActual.getYear())>=25) {
                con1++;
            }
            if ((alumnos.get(i).getApellido()).substring(0, 1).equalsIgnoreCase("l")||(alumnos.get(i).getApellido()).substring(0, 1).equalsIgnoreCase("p")) {
                con2++;
            }
        }
        System.out.println("La cantidad de alumnos mayores a 25 es: "+ con1);
        System.out.println("La cantidad de alumnos cuyo apellido comienza con la letra ´l´ o ´p´ son: "+con2);
        System.out.println("La cantidad de alumnos con nacionalidad argentina son: "+ Argentina.size());
        System.out.println("La cantidad de alumnos con nacionalidad chilena son: "+ Chile.size());
        System.out.println("La cantidad de alumnos con nacionalidad venezolana son: "+ Venezuela.size());
    }
    public void crearClase(){
        int op;
        do {
            System.out.println("Seleccione una opcion");
            System.out.println(" ________________________________");
            System.out.println("|1-cargar clase                  |");
            System.out.println("|2-Dar de baja a un alumno       |");
            System.out.println("|3-Modificar un alumno           |");
            System.out.println("|4-Mostrar a los alumnos         |");
            System.out.println("|5-Mostrar a un alumno           |");
            System.out.println("|6-Mostar el reporte de la clase |");
            System.out.println("|7-Salir                         |");
            System.out.println(" ________________________________ ");
            op=sc.nextInt();
            switch (op){
                case 1:
                    cargaralm();
                    Collections.sort(alumnos, Comparadores);
                    Collections.sort(lista, Comparadores.ordenarDuracionAsc);
                    
            }
        } while (op==6);
        
    }
}
