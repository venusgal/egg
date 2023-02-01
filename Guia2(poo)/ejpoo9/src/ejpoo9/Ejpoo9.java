package ejpoo9;

import Entidades.Matematica;

public class Ejpoo9 {

    public static void main(String[] args) {
        Matematica mat= new Matematica();
        double num=Math.random()*10.1;
        double num2=Math.random()*10.1;
        mat.devolverMayor(num, num2);
        mat.calcularPotencia(num, num2);
        mat.calcularRaiz(num, num2);
                
    }
    
}
