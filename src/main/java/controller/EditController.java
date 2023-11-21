/*
   UNIVERSIDAD DEL VALLE - TECNOLOGIA EN DESARROLLO DE SOFTWARE
   DEVELOPED BY:DANIEL JOSE ENRIQUEZ, COD: 2240920 & JUAN SEBASTIAN VIEDMAN, COD: 2242562
*/
package controller;
import view.*;
import view.SearchUserToUpdateView;
import model.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class EditController implements ActionListener {

     //Crear variables de tipo clase
    private PrincipalView vistaPrincipal;
    private Edit editModel;
    private EditView vistaEditar;
    private SearchUserToUpdateView vistaBuscarYEditarUsuario;
    
    //Metodo contructor
    public EditController(PrincipalView vistaPrincipal, Edit editModel, EditView vistaEditar, SearchUserToUpdateView vistaBuscarYEditarUsuario) {

        this.vistaPrincipal = vistaPrincipal;
        this.editModel = editModel;
        this.vistaEditar = vistaEditar;
        this.vistaBuscarYEditarUsuario = vistaBuscarYEditarUsuario;
        //llamar el boton de la vista y añadirle el metodo ActionListener
        vistaPrincipal.botonActualizar.addActionListener(this);
        vistaEditar.botonActualizar.addActionListener(this);
        vistaEditar.botonVolver.addActionListener(this);
        vistaBuscarYEditarUsuario.botonBuscar.addActionListener(this);
        vistaBuscarYEditarUsuario.botonVolver.addActionListener(this);
    }
    //Metodo que inicia la vista y establece los titulos y las dimensiones de las ventanas
    public void iniciarVistaEditar(){
        vistaEditar.setTitle("Editar Usuario");
        vistaEditar.setLocationRelativeTo(null);

    }
    //Boton para las intrucciones del evento del boton "Crear".
    @Override
    public void actionPerformed(ActionEvent e ) {
         
        if(e.getSource() == vistaPrincipal.botonActualizar){
            //Cerrar la ventana principal el programa y abrir la ventana para crear un usuario
            vistaPrincipal.dispose();
            vistaBuscarYEditarUsuario.setVisible(true);
            vistaBuscarYEditarUsuario.setTitle("Buscar usuario para editar");
            vistaBuscarYEditarUsuario.setLocationRelativeTo(null);
            vistaBuscarYEditarUsuario.setSize(vistaPrincipal.getWidth(), vistaPrincipal.getHeight());
            vistaEditar.setSize(vistaPrincipal.getWidth(), vistaPrincipal.getHeight());
            vistaEditar.setLocationRelativeTo(null);
        }
        if(e.getSource() == vistaBuscarYEditarUsuario.botonVolver){
            vistaBuscarYEditarUsuario.dispose();
            vistaPrincipal.setVisible(true);
        
        }
        if (e.getSource() == vistaBuscarYEditarUsuario.botonBuscar){
    
            JOptionPane.showMessageDialog(null,"Se presioso boton para buscar usuario a actualizar!!");
            //Llamar a la logica del modelo para que valide si el id que se busco corresponde a un usuario guardado en la coleccion.
    
        }
        if(e.getSource() == vistaEditar.botonActualizar){
            //Establecerle los valores a los campos de la vista crear
            JOptionPane.showMessageDialog(null,"Boton actualizar Presionado");
            //createModel.setNombre(vistaCrear.campoNombre.getText());
            //createModel.setApellido(vistaCrear.campoApellido.getText());
            //createModel.setDireccion(vistaCrear.campoApellido.getText());
            //createModel.setCelular(Integer.parseInt(vistaCrear.campoApellido.getText()));
            //createModel.setId(Integer.parseInt(vistaCrear.campoId.getText()));
            //createModel.setNacimiento(vistaCrear.campoNacimiento.getText());
            //createModel.almacenarUsuarios();
            //createModel.setNombre(vistaCrear.tipoUsuarioComboBox.getText());
            
                    
        }
        if(e.getSource() == vistaEditar.botonVolver){
            //JOptionPane.showMessageDialog(null,"Se presiono boton volver");
            vistaEditar.dispose();
            vistaPrincipal.setVisible(true);
            }
    }
}
