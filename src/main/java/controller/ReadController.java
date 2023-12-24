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
public class ReadController implements ActionListener {
    
    private PrincipalView vistaPrincipal;
    private ReadView vistaListar;
    private Read leer;
    private ShowUsers show;
    
    
    public ReadController(PrincipalView vistaPrincipal, ReadView vistaListar, Read leer, ShowUsers show){
        this.vistaPrincipal = vistaPrincipal;
        this.vistaListar = vistaListar;
        this.leer = leer;
        this.show = show;
        vistaPrincipal.botonListar.addActionListener(this);
        vistaListar.botonListar.addActionListener(this);
        vistaListar.botonVolver.addActionListener(this);
        show.botonMenuPrincipal.addActionListener(this);
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
        if (e.getSource () == vistaListar.botonListar){
            boolean validation = leer.leerColeccion(vistaListar.buscarId.getText());
            if(validation){
                vistaListar.dispose();
                show.setVisible(true);
                show.setSize(950, 600);
                show.setLocationRelativeTo (null);
                show.showName.setText(leer.getNombre());
                show.showLastName.setText(leer.getApellido());
                show.showUser.setText(leer.getTipoUsuario());
                show.showAdress.setText(leer.getDireccion());
                show.showBirthday.setText(leer.getNacimiento());
                show.showPhone.setText(leer.getTipoTel());
                show.showNumberPhone.setText(leer.getCelular());
            }
        }
        if (e.getSource () == show.botonMenuPrincipal){
            show.dispose();
            vistaPrincipal.setVisible(true);
        }
    }
    
}
