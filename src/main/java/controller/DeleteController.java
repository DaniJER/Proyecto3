/*
   UNIVERSIDAD DEL VALLE - TECNOLOGIA EN DESARROLLO DE SOFTWARE
   DEVELOPED BY:DANIEL JOSE ENRIQUEZ, COD: 2240920 & JUAN SEBASTIAN VIEDMAN, COD: 2242562

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
    private Delete deleteModel;

    public DeleteController(PrincipalView vistaPrincipal, DeleteView vistaEliminar, Delete deleteModel) {
        this.vistaPrincipal = vistaPrincipal;
        this.vistaEliminar = vistaEliminar;
        this.deleteModel = deleteModel;
        
        
        vistaPrincipal.botonEliminar.addActionListener(this);
        vistaEliminar.botonEliminarUsuario.addActionListener(this);
        vistaEliminar.botonVolver.addActionListener(this);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource () == vistaPrincipal.botonEliminar){
            vistaPrincipal.dispose();
            vistaEliminar.setVisible(true);
            vistaEliminar.setLocationRelativeTo(null);
            vistaEliminar.setSize(vistaPrincipal.getWidth(), vistaPrincipal.getHeight());
        }
        
        if(e.getSource() == vistaEliminar.botonEliminarUsuario){
            deleteModel.eliminarUsuarioPorCedula(vistaEliminar.buscarIdField.getText());
        }
        
        if(e.getSource() == vistaEliminar.botonVolver){
            vistaEliminar.dispose();
            vistaPrincipal.setVisible(true);
        }
    } 
    
}
