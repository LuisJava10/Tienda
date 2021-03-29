/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import mundo.Articulo;
import mundo.Tecnico;
import vista.GUITable;

/**
 *
 * @author jorge
 */
public class Controlador implements ActionListener{
    
    private GUITable vista;
    private Articulo producto;
    private Tecnico tecnico;

    public Controlador(GUITable vista, Articulo producto, Tecnico tecnico) {
        this.vista = vista;
        this.producto = producto;
        this.tecnico = tecnico;
    }
    
    public void iniciar(){
        
        vista.setTitle("Phone Store");
        vista.setLocationRelativeTo(null);
        vista.btnAniadir.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e){
                
                producto.mensajePrueba(); //Seria la clase modelo.
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
