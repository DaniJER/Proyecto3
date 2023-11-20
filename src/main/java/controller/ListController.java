/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view. *;
/**
 *
 * @author Juan
 */
public class ListController implements ActionListener {
    private PrincipalView vistaPrincipal;
    private ListView vistaListar;
    
    
    public ListController(PrincipalView vistaPrincipal, ListView vistaListar){
        this.vistaPrincipal = vistaPrincipal;
        this.vistaListar = vistaListar;
        vistaPrincipal.botonListar.addActionListener(this);
        vistaListar.botonListar.addActionListener(this);
        vistaListar.botonVolver.addActionListener(this);
    }
    
    public void iniciarVistaListar (){
        vistaListar.setTitle("Univalle");
        vistaListar.setLocationRelativeTo (null);
        vistaListar.setSize(vistaPrincipal.getWidth(), vistaPrincipal.getHeight());
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource () == vistaPrincipal.botonListar){
            vistaPrincipal.dispose();
            vistaListar.setVisible(true);
        }
        
        if (e.getSource () == vistaListar.botonVolver){
            vistaListar.dispose();
            vistaPrincipal.setVisible(true);
        }
    }
    
}
