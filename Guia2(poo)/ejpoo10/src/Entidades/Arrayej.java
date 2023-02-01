
package Entidades;
import java.util.Arrays;

public class Arrayej {
    public double A []=new double[50];
    public double B []=new double[20];

    public Arrayej() {
    }

    public double[] getA() {
        return A;
    }

    public void setA(double[] A) {
        this.A = A;
    }

    public double[] getB() {
        return B;
    }
    public void setB(double[] B) {
        this.B = B;
    }
    public void LLenarArregloA(){
        for (int i = 0; i < 50; i++) {
       Arrays.fill(A, i, i+1, Math.random()*10.2);
        }
               
       System.out.println("");
    }
    public void OrdenarArreglo(){
       Arrays.sort(A);
        for (int i = 0; i < 50; i++) {
            System.out.println("["+A[i]+"]");
        }
        System.out.println("");
        
    }
    public void llenarArregloB(){
        for (int i = 0; i < 20; i++) {
            if (i<=10) {
                B[i]=A[i];
            }else{
                B[i]=0.5;
            }
        }
        System.out.println("");
    }
    public void Mostrar(){
        for (int i = 0; i < 50; i++) {
            System.out.print("["+A[i]+"]");
        }
        System.out.println("");
         for (int i = 0; i < 20; i++) {
            System.out.print("["+B[i]+"]");
        }
    }
}
