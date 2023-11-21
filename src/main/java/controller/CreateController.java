/*
   UNIVERSIDAD DEL VALLE - TECNOLOGIA EN DESARROLLO DE SOFTWARE
   DEVELOPED BY:DANIEL JOSE ENRIQUEZ, COD: 2240920 & JUAN SEBASTIAN VIEDMAN, COD: 2242562


 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import view.*;
import model.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.String.valueOf;
import javax.swing.JOptionPane;

/**
 *
 * @author El Rey
 */
public class CreateController implements ActionListener {
    
     //Crear variables de tipo clase
    private PrincipalView vistaPrincipal;
    private Create createModel;
    private CreateView vistaCrear;
    
    //Metodo contructor
    public CreateController(PrincipalView vistaPrincipal, Create createModel, CreateView vistaCrear) {
        this.vistaPrincipal = vistaPrincipal;
        this.createModel = createModel;
        this.vistaCrear = vistaCrear;
        
        //llamar el boton de la vista y añadirle el metodo ActionListener
        vistaPrincipal.botonAgregar.addActionListener(this); 
        vistaCrear.botonEnviar.addActionListener(this);
        vistaCrear.botonVolver.addActionListener(this);
        }
    //Metodo que inicia la vista y establece los titulos y las dimensiones de las ventanas
    public void iniciarPrograma(){
        vistaPrincipal.setTitle("Gestion de usuarios");
        vistaPrincipal.setLocationRelativeTo(null);
        vistaCrear.setTitle("Agregar Usuarios");
        
    }
    
    //Boton para las intrucciones del evento del boton "Crear".
    @Override
    public void actionPerformed(ActionEvent e ) {
         
        if(e.getSource() == vistaPrincipal.botonAgregar){
            
            //Cerrar la ventana principal el programa y abrir la ventana para crear un usuario
            
            vistaPrincipal.dispose();
            vistaCrear.setVisible(true);
            vistaCrear.setSize(vistaPrincipal.getWidth(), vistaPrincipal.getHeight());
            vistaCrear.setLocationRelativeTo(null);
            
            //Guardar un registro por defecto
            createModel.almacenarUsuariosPorDefault();
                 
        }
        if(e.getSource() == vistaCrear.botonEnviar){
            
            createModel.setNombre(vistaCrear.campoNombre.getText());
            createModel.setApellido(vistaCrear.campoApellido.getText());
            createModel.setDireccion(vistaCrear.campoDireccion.getText());
            createModel.setCelular(vistaCrear.campoCelular.getText());
            createModel.setCedula((vistaCrear.campoCedula.getText()));
            createModel.setNacimiento(vistaCrear.campoNacimiento.getText());

            createModel.comprobarUsuarios(Integer.parseInt(vistaCrear.campoCedula.getText()));
            
        };
    };
};
