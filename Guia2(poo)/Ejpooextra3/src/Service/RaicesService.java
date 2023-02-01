
package Service;

import Entidades.Raices;
import java.util.Locale;
import java.util.Scanner;


public class RaicesService {
  Raices Ra=new Raices();  
  Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.ITALY);
  public void crear(){
      System.out.println("Ingrese el valor de 'a'");
      Ra.setA(sc.nextInt());
       System.out.println("Ingrese el valor de 'b'");
      Ra.setB(sc.nextInt());
       System.out.println("Ingrese el valor de 'c'");
      Ra.setC(sc.nextInt());
}
  public double discriminante(){
      double dis=(Math.pow(Ra.getB(),2)-(4*Ra.getA()*Ra.getC()));
      return dis;
  }
  public boolean tieneRaices(){
      return discriminante()>0;    
  }
  public boolean tieneRaiz(){
      return discriminante()==0;    
  }
  public int obtenerRaices(){
      if (tieneRaices()==true){
          System.out.println("La primer raiz es: "+(-Ra.getB())+"-("+(discriminante())+")");
          System.out.println("                 ____________  ="+((-Ra.getB()+Math.sqrt(discriminante()))/2));
          System.out.println("                       2");
          System.out.println("La segunda raiz es: "+(-Ra.getB())+"+("+(discriminante())+")");
          System.out.println("                  ______________ ="+((-Ra.getB()-Math.sqrt(discriminante()))/2));
          System.out.println("                        2");
         return 1;
      }else{
          return 0;
      }
  }
  public int obtenerRaiz(){
      if (tieneRaiz()==true){
          System.out.println("La raiz es: "+(-Ra.getB())+"-("+(discriminante())+")");
          System.out.println("          ____________  ="+((-Ra.getB()+Math.sqrt(discriminante()))/2));
          System.out.println("                2");
         
         return 1;
      }else{
          return 0;
      }
  }
  public void Calcular(){
      crear();
      discriminante();
      if (obtenerRaices()==1) {
          obtenerRaices();
      }else if(obtenerRaiz()==1){
          obtenerRaiz();
      }else{
          System.out.println("la ecuacion no se puede resolver");
      }
          
  }
}
