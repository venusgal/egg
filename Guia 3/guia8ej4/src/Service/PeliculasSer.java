
package Service;
import Comparadores.Comparadores;
import Entidades.PeliculasEnt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class PeliculasSer {
    ArrayList <PeliculasEnt> lista=new ArrayList();
    Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.ITALY);
    public void ingresarPeli(){
        int op;
        do{
        System.out.println("Ingrese el titulo de la pelicula");
       String nombre=sc.next();
        System.out.println("Ingrese el director");
        String director =sc.next();
        System.out.println("Ingrese la duración de la pelicula en horas");
        int hora= sc.nextInt();
        System.out.println("Desea ingresar otra pelicula? 1-Si 2-No");
        op=sc.nextInt();
    PeliculasEnt peli=new PeliculasEnt(nombre, director, hora);
        lista.add(peli);
        }while(op==1);
    }
    public void Mostrar(){
        for (PeliculasEnt peliculasEnt : lista) {
            System.out.println("El nombre es: "+ peliculasEnt.getTitulo()+" el director es: "+peliculasEnt.getDirector()+" y su duración es: "+ peliculasEnt.getHoras());
        }
    }
    public void mayorA1(){
        System.out.println("Las peliculas que duran mas de una hora son: ");
        int con=0;
        for (PeliculasEnt peliculasEnt : lista) {
            if (peliculasEnt.getHoras()>1) {
                System.out.println(peliculasEnt.getTitulo()+" del director: "+peliculasEnt.getDirector());
            }else{
              con++;
            }
        }
        if (con>=lista.size()) {
              System.out.println("No hay peliculas que duren mas de 1 hora");
        }
    }
    public void pelis(){
        ingresarPeli();
        System.out.println();
        System.out.println("___________________________________________________");
        System.out.println();
        Mostrar();
        System.out.println();
        System.out.println("___________________________________________________");
        System.out.println();
        mayorA1();
        System.out.println();
        System.out.println("___________________________________________________");
        System.out.println();
        System.out.println("Peliculas ordenadas por su duracion de mayor a menor");
        Collections.sort(lista, Comparadores.ordenarDuracionDesc);
        Mostrar();
        System.out.println();
        System.out.println("___________________________________________________");
        System.out.println();
         System.out.println("Peliculas ordenadas por su duracion de menor a mayor");
        Collections.sort(lista, Comparadores.ordenarDuracionAsc);
        Mostrar();
        System.out.println();
        System.out.println("___________________________________________________");
        System.out.println();
         System.out.println("Peliculas ordenadas alfabeticamente");
        Collections.sort(lista, Comparadores.ordenartirulo);
        Mostrar();
        System.out.println();
        System.out.println("___________________________________________________");
        System.out.println();
         System.out.println("Peliculas ordenadas alfabeticamente por su director");
        Collections.sort(lista, Comparadores.ordenarDirector);
        Mostrar();
    }
}

