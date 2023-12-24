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
    
    @Override
    public void actionPerformed(ActionEvent e ) {
         
        if(e.getSource() == vistaPrincipal.botonActualizar){
            //Cerrar la ventana principal el programa y abrir la ventana para crear un usuario
            vistaPrincipal.dispose();
            vistaBuscarYEditarUsuario.setVisible(true);
            vistaBuscarYEditarUsuario.setLocationRelativeTo(null);
            vistaBuscarYEditarUsuario.setSize(950,600);
        }
        
        if(e.getSource() == vistaBuscarYEditarUsuario.botonVolver){
            vistaBuscarYEditarUsuario.dispose();
            vistaPrincipal.setVisible(true);
        }
        
        if (e.getSource() == vistaBuscarYEditarUsuario.botonBuscar){
            boolean validacion = editModel.validarUsuario(vistaBuscarYEditarUsuario.id.getText());
            if(validacion){
                vistaBuscarYEditarUsuario.id.setText("");
                vistaBuscarYEditarUsuario.dispose();
                vistaEditar.setVisible(true);
                vistaEditar.setLocationRelativeTo(null);
                vistaEditar.setSize(950,600);
            }
        }
        
        if(e.getSource() == vistaEditar.botonActualizar){
            editModel.setNombre("nombre: "+vistaEditar.updateName.getText());
            editModel.setApellido("Apellido: "+vistaEditar.updateLastName.getText());
            editModel.setCelular("Numero de telefono: " +vistaEditar.updatePhone.getText());
            editModel.setTipoTel("Tipo de telefono: "+String.valueOf(vistaEditar.updatePhoneType.getSelectedItem()));
            editModel.setNacimiento("Fecha de nacimiento: "+vistaEditar.updateBirthday.getText());
            editModel.setTipoUsuario("Tipo de usuario: " +String.valueOf(vistaEditar.updateUser.getSelectedItem()));
            editModel.setDireccion("Direccion: "+vistaEditar.updateAdress.getText());
            
            editModel.updateUser();
        }
        
        if(e.getSource() == vistaEditar.botonVolver){
            vistaEditar.updateName.setText("");
            vistaEditar.updateLastName.setText("");
            vistaEditar.updateAdress.setText("");
            vistaEditar.updateBirthday.setText("");
            vistaEditar.updatePhone.setText("");
            vistaEditar.dispose();
            vistaPrincipal.setVisible(true);
            }
    }
}
