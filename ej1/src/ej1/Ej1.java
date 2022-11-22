
package ej1;

   import java.util.Scanner;

public class Ej1 {

    
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("ingrese 2 numeros");
        int n1=leer.nextInt();
        int n2=leer.nextInt();
        int suma=n1+n2;
        System.out.println("La suma de "+ n1 +" + "+ n2+" es: "+ suma);
//        //--------------------------------------
        System.out.println("ingrese su nombre");
        String nom=leer.next();
        System.out.println("su nombre es "+ nom);
//        //--------------------------------------
        System.out.println("ingrese una frase");
        String frase=leer.next();
        System.out.println(frase);
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
//        //--------------------------------------
        System.out.println("Cuantos grados (celsius) hacen");
        Double gradoC=leer.nextDouble();
        Double gradoF=32+(9*gradoC/5);
        System.out.println("hacen "+ gradoF+"grados fahrenheit");
        //--------------------------------------
        System.out.println("ingrese un numero");
        int num=leer.nextInt();
        System.out.println("El doble es: "+ num*2+ "el triple es: "+ num*3+ " la raiz cuadrada es: "+Math.sqrt(num));
//       //--------------------------------------
        if (num%2==0){
              System.out.println("el numero es par");
        }else{
              System.out.println("el numero es impar");
          }
        //--------------------------------------
        boolean c;
           do {
               System.out.println("ingrese la clave");
               String clave= leer.next();
               
               if (clave.equals("eureka")) {
                   System.out.println("Correcto");
                   c=true;
               }else{
                   System.out.println("Incorrecto");
                   c=false;
               }
        } while (c=true);
        //--------------------------------------
        System.out.println("ingrese una palabra/frase de 8 caracteres");
        String fras=leer.next();
        do {
            if (fras.length()==8){
                System.out.println("Correcto");
                c=true;
            }else{
                System.out.println("Incorrecto");
                c=false;
            }
        } while (c=true);
        
                 
    }
    
}
