/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view. *;
import model. *;

/**
 *
 * @author Juan
 */
public class DeleteController implements ActionListener{
    private PrincipalView vistaPrincipal;
    private DeleteView vistaEliminar;

    public DeleteController(PrincipalView vistaPrincipal, DeleteView vistaEliminar) {
        this.vistaPrincipal = vistaPrincipal;
        this.vistaEliminar = vistaEliminar;
        vistaPrincipal.botonEliminar.addActionListener(this);
        vistaEliminar.botonEliminar.addActionListener(this);
        vistaEliminar.botonVolver.addActionListener(this);
    }
    
    public void iniciarVistaEliminar (){
        vistaEliminar.setTitle("Univalle");
        vistaEliminar.setLocationRelativeTo (null);
        vistaEliminar.setSize(vistaPrincipal.getWidth(), vistaPrincipal.getHeight());
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource () == vistaPrincipal.botonEliminar){
            vistaPrincipal.dispose();
            vistaEliminar.setVisible(true);
            
        }
    }
    
}
