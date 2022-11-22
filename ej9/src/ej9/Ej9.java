
package ej9;
import java.util.Scanner;

public class Ej9 {

    
    public static void main(String[] args) {
       Scanner leer= new Scanner(System.in);
//        System.out.println("ingrese una frase");
//        String frase=leer.next();
//        if (frase.substring(0, 1).equals("a")){
//            System.out.println("Correcto");
//        }else{
//            System.out.println("Incorrecto");
//        }
//        //-----------------------------------
//        System.out.println("ingrese el numero limite");
//        int numlim=leer.nextInt();
//        int num;
//        int suma=0;
//        do {
//            System.out.println("ingrese un numero menor al limite");
//            num=leer.nextInt();
//                  suma=suma+num;
//        } while ( suma<numlim);
//       //-----------------------------------
       System.out.println("ingrese 2 numeros enteros y positivos");
            int num1=leer.nextInt();
             int num2=leer.nextInt();
        do {
            System.out.println("Elija una opcion:");
            System.out.println(" _________________");
            System.out.println("|       Menú      |");
            System.out.println("------------------");
            System.out.println("| 1-Sumar         |");
            System.out.println("| 2-Restar        |");
            System.out.println("| 3-Multiplicar   |");
            System.out.println("| 4-Dividir       |");
            System.out.println("| 5-Salir         |");
            System.out.println(" _________________");
            int opcion=leer.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("la suma de "+num1+ " y "+num2+ " es: "+(num1+num2));
                    break;
                case 2:
                    System.out.println("la resta de "+num1+ " y "+num2+ " es: "+ (num1-num2));
                    break;
                case 3:
                    System.out.println("la multiplicacion de "+ num1+ "y  "+num2+" es: "+(num1*num2) );
                    break;
                case 4 :
                    System.out.println("la devision de "+num1+ " y "+num2+ " es: "+ (num1/num2));
                    break;
                case 5:
                    System.out.println("Esta seguro de que quiere salir? 1=Si 2=No");
                    int c=leer.nextInt();
                    break;
            }
           
        } while (c=1);
        
      
            
                
    }
    
}
