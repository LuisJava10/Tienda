/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundo;

import javax.swing.JOptionPane;
// prueba1

/**
 *
 * @author jorge
 */
public class Articulo implements Producto {
    
    String nombre;
    String precio;
    String stock;
    int precio1;// prueba

    
    public Articulo(){
        
    }
    
    public Articulo(String nombre, String precio, String stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    
    

    public String getProducto() {
        return nombre;
    }

    public void setProducto(String producto) {
        this.nombre = producto;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }
    
    public void mensajePrueba(){
        
        JOptionPane.showMessageDialog(null, "Solo prueba");
    }

    @Override
    public String dameNombre() {
        return nombre;
    }
    
}
