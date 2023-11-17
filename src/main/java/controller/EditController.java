package controller;
import view.*;
import model.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class EditController implements ActionListener {

     //Crear variables de tipo clase
    private PrincipalView vistaPrincipal;
    private Edit editModel;
    private EditView vistaEditar;
    
    //Metodo contructor
    public EditController(PrincipalView vistaPrincipal, Edit editModel, EditView vistaEditar) {

        this.vistaPrincipal = vistaPrincipal;
        this.editModel = editModel;
        this.vistaEditar = vistaEditar;
        //llamar el boton de la vista y añadirle el metodo ActionListener
        vistaPrincipal.botonActualizar.addActionListener(this);
        vistaEditar.botonActualizar.addActionListener(this); 
        vistaEditar.botonVolver.addActionListener(this);
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
            vistaEditar.setVisible(true);
            vistaEditar.setSize(vistaPrincipal.getWidth(), vistaPrincipal.getHeight());
            vistaEditar.setLocationRelativeTo(null);
        }
        if(e.getSource() == vistaEditar.botonActualizar){
            //Establecerle los valores a los campos de la vista crear.
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
