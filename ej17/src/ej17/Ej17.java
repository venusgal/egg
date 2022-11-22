
package ej17;

import java.util.Scanner;
public class Ej17 {

    
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("que tamaño desea de vector");
        int num= leer.nextInt();
        int [] vec=new int[num];
        for (int i=0; i<num; i++){
            vec[i]=(int) (Math.random()*(10*i));
        }
        for (int i = 0; i < num; i++) {
            System.out.print("["+ vec[i]+ "]");
        }
        int cont=0, con2=0, con3=0, con4=0, con5=0;
        for (int i = 0; i < num; i++) {
            if ((vec[i]>1) && (vec[i]<9)) {
                cont++;
            }else if ((vec[i]>10) && (vec[i]<99)){
            con2++;
            }else if ((vec[i]>100) && (vec[i]<999)){
                con3++;
            }else if ((vec[i]>1000) && (vec[i]<9999)){
                con4++;
            }else{
                con5++;
            }
            }
        System.out.println("Hay "+ cont+ " numeros de 1 digito, "+" hay "+ con2+ " numeros de 2 digito"+" hay "+ con3+ " numeros de 3 digito"+" hay "+ con4+ " numeros de 4 digito"+" hay "+ con5+ " numeros de 5 digito");
    }
            
    }
    

