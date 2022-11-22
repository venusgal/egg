
package ej20;

import java.util.Scanner;
public class Ej20 {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int[][] ma = new int[3][3];
        int [] vec=new int[3];
        int [] vec2=new int[3];
        int fila=0, col=0, diag=0, diag2=0, con=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese el numero para la posicion "+ i+" "+j);
                ma[i][j]=leer.nextInt();
            }
        }for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("["+ ma[i][j]+"]");
        }
            System.out.println(" ");
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                fila=fila+ma[i][j];
                if (i==j){
                diag+=ma[i][j];
            }
                if (j==0) {
                    col+=ma[i][j];
                }
                if ((i+j)==2){
                    diag2+=ma[i][j];
                }
            }
            vec[i]=fila;
            fila=0;
        }
       
        for (int j = 0; j <3; j++) {
            col=0;
            for (int i = 0; i < 3; i++) {
              col=col+ma[j][i];  
            }
            vec2[j]=col;
        }
        if (diag==diag2){
            for (int i = 0; i < 3; i++) {
                if (vec[i]==vec2[i]){
                    con++;
                }
            }
        }
        if (con==3){
            System.out.println("La matriz es magica");
        }else{
            System.out.println("La matriz NO es magica");
        }
    }
    }
    



