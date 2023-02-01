package ejpoo6;

import Entidades.Nespresso;

public class Ejpoo6 {

  
    public static void main(String[] args) {
       Nespresso cafe=new Nespresso();
       cafe.llenarCafetera();
       cafe.servirTaza();
       cafe.vaciarCafetera();
       cafe.agregarCafe();
    }
    
}
