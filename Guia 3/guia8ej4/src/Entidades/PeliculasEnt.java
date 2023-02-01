
package Entidades;

public class PeliculasEnt {
    private String Titulo;
    private String Director;
    private Integer Horas;

    public PeliculasEnt() {
    }

    public PeliculasEnt(String Titulo, String Director, Integer Horas) {
        this.Titulo = Titulo;
        this.Director = Director;
        this.Horas = Horas;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }

    public Integer getHoras() {
        return Horas;
    }

    public void setHoras(Integer Horas) {
        this.Horas = Horas;
    }

 
    
}
