/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author jorge
 */
public class ObjetoGenerico <T>{
   
    private ObjetoGenerico anterior;
    private ObjetoGenerico siguiente;
    private T t;
    
    
    public ObjetoGenerico(T t){
        this.t = t;
    }
    

    public ObjetoGenerico getAnterior() {
        return anterior;
    }

    public void setAnterior(ObjetoGenerico anterior) {
        this.anterior = anterior;
    }

    public ObjetoGenerico getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(ObjetoGenerico siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
