
package Entidades;


public class Matematica {
  private double n1;
private double n2;

    public Matematica() {
    }

    public Matematica(double n1, double  n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public double  getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public double  getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public void devolverMayor(double n1, double  n2){
        Double maxi;
        if (n1==n2) {
            System.out.println("Los numeros tienen el mismo valor");
        }else{
        maxi=Double.max(n1, n2);
     System.out.println("El numero mayor es: " +maxi);
        }
    }
    public void calcularPotencia(double n1, double n2){
         Double maxi;
          maxi=Double.max(n1, n2);
     Math.round(n1);
     Math.round(n2);
        System.out.println("La potencia de "+maxi+" a la "+(maxi-(n1+n2)+" es; "+ Math.pow(maxi,(maxi-(n1+n2)))));
    }
   public void calcularRaiz(double n1, double n2){
         Double mini;
         mini=Double.min(n1, n2);
     Math.abs(mini);
     
        System.out.println("La raiz de "+mini+" es; "+ Math.sqrt(mini));
    }
  
}
