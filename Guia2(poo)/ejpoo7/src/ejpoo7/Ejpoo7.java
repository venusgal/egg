
package ejpoo7;

import Entidades.Persona;


public class Ejpoo7 {

    
    public static void main(String[] args) {
        int[] vec =new int[4];
        boolean[] vec2 =new boolean[4];
      Persona p1=new Persona();
      p1.crearPersona();
      vec[0]=p1.calcularIMC();
      vec2[0]=p1.MayorDeEdad();
      
      
      Persona p2=new Persona();
      p2.crearPersona();
      vec[1]=p2.calcularIMC();
      vec2[1]=p2.MayorDeEdad();
      
      
      Persona p3=new Persona();
      p3.crearPersona();
      vec[2]=p3.calcularIMC();
      vec2[2]=p3.MayorDeEdad();
      
      
      Persona p4=new Persona();
      p4.crearPersona();
      vec[3]=p4.calcularIMC();
      vec2[3]=p4.MayorDeEdad();
        int con=0;
        int con2=0;
        int con3=0;
        for (int i = 0; i < 4; i++) {
            if (vec[i]==1) {
                con++;
            }
            if (vec[i]==0) {
                con2++;
            }
            if (vec[i]==-1) {
                con3++;
            }
            
        }
        
        int c=(con*100)/4;
        int c2=(con2*100)/4;
        int c3=(con3*100)/4;
                
        System.out.println("el porcentaje de personas con sobrepeso es: " + c + "%, el porcentaje de personas con peso normal es: "+c2 +"%, el porcentaje de personas con bajo peso es: " + c3 + "%");
        con=0;
        con2=0;
        for (int i = 0; i < 4; i++) {
            if (true==vec2[i]){
                con++;
            }else{
                con2++;
            }
        }
     
        System.out.println("el porcentaje de personas mayores es: "+(con*100)/4+"%, y el de personas jovenes es: "+(con2*100)/4+"%");
    }
    
    
}
