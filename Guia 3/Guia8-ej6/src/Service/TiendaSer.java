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
import java.util.Map;
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
        System.out.println("Ingrese el nombre del producto para cambiarle el precio");
        String name=sc.next();
       if (alm.containsKey(name)) {
        System.out.println("Ingrese su precio");
        Tienda.setPrecio(sc.nextDouble());
        alm.put(Tienda.getProducto(), Tienda.getPrecio());
    }else{
           System.out.println("El producto no se encuentra en la lista");
    }
       
    }
    public void EliminarProducto(){
          System.out.println("Ingrese el nombre del producto a eliminar");
        String name=sc.next();
       if (alm.containsKey(name)) {
        alm.remove(name);
    }else{
           System.out.println("El producto no se encuentra en la lista");
    }  
    }
    public void mostrarProducto(){
       
        System.out.println("Los productos en la lista son:");
        for (Map.Entry<String, Double> entry : alm.entrySet()) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

    }
    public void menu(){
        int salir;
        do {
            System.out.println("Seleccione una opcion del menú ");
            System.out.println(" ____________________");
            System.out.println("|        Menú        |");
            System.out.println("|1-Ingresar producto |");
            System.out.println("|2-Modificar precio  |");
            System.out.println("|3-Eliminar Producto |");
            System.out.println("|4-Mostrar lista     |");
            System.out.println("|5-Salir             |");
            System.out.println(" ____________________ ");
            int op=sc.nextInt();
            salir=2;
            switch (op) {
                case 1:
                    IntroducirProduto();
                    break;
                case 2:
                    ModificarPrecio();
                    break;
                case 3:
                    EliminarProducto();
                    break;
                case 4:
                    mostrarProducto();
                    break;
                case 5:
                    System.out.println("Esta seguro de que quiere salir? 1-si 2-no");
                   salir=sc.nextInt();
                    break;
                default:
                    System.out.println("Numero no valido, ingrese un número del menú");
                   
            }
        } while (salir==2);
        
    }
}
