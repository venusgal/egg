//Un profesor particular está dando cursos para grupos de cinco alumnos y necesita un
//programa para organizar la información de cada curso. Para ello, crearemos una clase
//entidad llamada Curso, cuyos atributos serán: nombreCurso, cantidadHorasPorDia,
//cantidadDiasPorSemana, turno (mañana o tarde), precioPorHora y alumnos. Donde
//alumnos es un arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los
//nombres de cada alumno. A continuación, se implementarán los siguientes métodos:
// Un constructor por defecto.
// Un constructor con todos los atributos como parámetro.
// Métodos getters y setters de cada atributo.

// método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
//que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
//en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
//nombre de cada alumno.

// Método crearCurso(): el método crear curso, le pide los valores de los atributos al
//usuario y después se le asignan a sus respectivos atributos para llenar el objeto
//Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor
//al atributo alumnos

// Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
//en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
//día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
//se repite el encuentro.
package Entidades;

import java.util.Locale;
import java.util.Scanner;


public class Cursos {
    Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.ITALY);
    private String nombreCurso;
    private int cantidadHorasPordia;
    private int cantidadHorasPorSemana;
    private String turno;
    private double precioPorHora;
    private String alumnos[]=new String [5];

    public Cursos() {
    }

    public Cursos(String nombreCurso, int cantidadHorasPordia, int cantidadHorasPorSemana, String turno, double precioPorHora) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasPordia = cantidadHorasPordia;
        this.cantidadHorasPorSemana = cantidadHorasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantidadHorasPordia() {
        return cantidadHorasPordia;
    }

    public void setCantidadHorasPordia(int cantidadHorasPordia) {
        this.cantidadHorasPordia = cantidadHorasPordia;
    }

    public int getCantidadHorasPorSemana() {
        return cantidadHorasPorSemana;
    }

    public void setCantidadHorasPorSemana(int cantidadHorasPorSemana) {
        this.cantidadHorasPorSemana = cantidadHorasPorSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public String[] getAlunmos() {
        return alumnos;
    }

    public void setAlunmos(String[] alumnos) {
        this.alumnos = alumnos;
    }
    
   public void cargarAlumnos(){
       for (int i = 0; i < 5; i++) {
           System.out.println("Ingrese el nombre del alumno "+(i+1));
           alumnos[i]=sc.next();
       } 
   }        
    public void crearCursos(){
        System.out.println("Ingrese el nombre del curso");
        nombreCurso=sc.next();
        cargarAlumnos();
        System.out.println("Ingrese el turno");
        turno=sc.next();
        System.out.println("Ingrese el precio por hora");
        precioPorHora=sc.nextDouble();
        System.out.println("Ingrese la cantidad de dias por semana");
        cantidadHorasPorSemana=sc.nextInt();
          System.out.println("Ingrese la cantidad de horas por dia");
        cantidadHorasPordia=sc.nextInt();
        
   }    
    public void calcularGanancias(){
        System.out.println("ganancia: "+ precioPorHora*cantidadHorasPorSemana*cantidadHorasPordia*alumnos.length);
    }
}
