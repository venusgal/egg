//Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
//productos que venderemos y el precio que tendrán. Además, se necesita que la
//aplicación cuente con las funciones básicas.
//Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
//eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
//Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
//Realizar un menú para lograr todas las acciones previamente mencionadas.
package Service;

import Entidades.TiendaEnt;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;


public class TiendaSer {
    Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.ITALY);
    TiendaEnt Tienda= new TiendaEnt();
    HashMap <String, Double> alm=new HashMap();
    public void IntroducirProduto(){
        System.out.println("Ingrese el nombre del producto");
        Tienda.setProducto(sc.next());
        System.out.println("Ingrese su precio");
        Tienda.setPrecio(sc.nextDouble());
        alm.put(Tienda.getProducto(), Tienda.getPrecio());
    }
public void ModificarPrecio(){
        System.out.println("Ingrese el nombre del producto para cambiarle el nombre");
        String name=sc.next();
        
        for (String i: alm.keySet()) {
            if (name.equals(i)) {
                System.out.println("Ingrese el nuevo precio");
                Tienda.setPrecio(sc.nextDouble());
            }else{
                System.out.println("El producto no esta en la lista");
            }
    }
    }
}
