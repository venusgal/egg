
package Entidades;


public class Ahorcado {
    private String pal;
    private String vector[]=new String[pal.length()];
    private int canencontradas;
     private int canmax;

    public Ahorcado() {
    }

    public Ahorcado(String pal, int canencontradas, int canmax) {
        this.pal = pal;
        this.canencontradas = canencontradas;
        this.canmax = canmax;
    }

    public String getPal() {
        return pal;
    }

    public void setPal(String pal) {
        this.pal = pal;
    }

    public String[] getVector() {
        return vector;
    }

    public void setVector(String[] vector) {
        this.vector = vector;
    }

    public int getCanencontradas() {
        return canencontradas;
    }

    public void setCanencontradas(int canencontradas) {
        this.canencontradas = canencontradas;
    }

    public int getCanmax() {
        return canmax;
    }

    public void setCanmax(int canmax) {
        this.canmax = canmax;
    }
     
}
