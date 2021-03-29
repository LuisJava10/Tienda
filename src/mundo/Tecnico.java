/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundo;

/**
 *
 * @author jorge
 */
public class Tecnico implements Producto{
    
    private String nombreServicio;
    private String valor;

    public Tecnico(){
        
    }
    
    public Tecnico(String nombreServicio, String valor) {
        this.nombreServicio = nombreServicio;
        this.valor = valor;
    }

    public String getNombreServicio() {
        return nombreServicio;
    }

    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public String dameNombre() {
        
        return nombreServicio;
    }
    
    
}
