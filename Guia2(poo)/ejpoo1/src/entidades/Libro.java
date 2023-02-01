package entidades;
import java.util.Locale;
import java.util.Scanner;
public class Libro {
Scanner Sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.ITALY);
    public int ISBN;
    public String Titulo;
    public String Autor;
    public int np;

    public Libro() {
    }

    public Libro(int ISBN, String Titulo, String Autor, int np) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.np = np;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getNp() {
        return np;
    }

    public void setNp(int np) {
        this.np = np;
    }
    
    public void Ingrsar(){
        System.out.println("Ingrese el ISBN del libro");
        ISBN=Sc.nextInt();
        System.out.println("Ingrese el titulo del libro");
        Titulo=Sc.next();
        System.out.println("Ingrese el autor del libro");
        Autor=Sc.next();
        System.out.println("Ingrese el np del libro");
        np=Sc.nextInt();
}
    public void mostrar (){
        System.out.println("El ISBN del libro es: "+ISBN+", el tiulo es: "+Titulo+", el autor es: "+ Autor+" y el numero de paginas es:"+np);
    }

    @Override
    public String toString() {
        return "Libro{" + "Sc=" + Sc + ", ISBN=" + ISBN + ", Titulo=" + Titulo + ", Autor=" + Autor + ", np=" + np + '}';
    }
   
}
