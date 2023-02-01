
package Entidades;


public class TiendaEnt {
    private String Producto;
    private double Precio;

    public TiendaEnt() {
    }

    public TiendaEnt(String Producto, double Precio) {
        this.Producto = Producto;
        this.Precio = Precio;
    }

    public String getProducto() {
        return Producto;
    }

    public void setProducto(String Producto) {
        this.Producto = Producto;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }
    
}
