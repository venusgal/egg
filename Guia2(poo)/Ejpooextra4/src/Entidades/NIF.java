
package Entidades;


public class NIF {
  private long DNI;  
  private char nif;

    public NIF() {
    }

    public NIF(long DNI, char nif) {
        this.DNI = DNI;
        this.nif = nif;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public char getNif() {
        return nif;
    }

    public void setNif(char nif) {
        this.nif = nif;
    }
   
}
