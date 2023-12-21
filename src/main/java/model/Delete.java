/*
   UNIVERSIDAD DEL VALLE - TECNOLOGIA EN DESARROLLO DE SOFTWARE
   DEVELOPED BY:DANIEL JOSE ENRIQUEZ, COD: 2240920 & JUAN SEBASTIAN VIEDMAN, COD: 2242562

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author Juan
 */
public class Delete{
    
    private Create create;
    private String nombreUsuario;
    private String apellidoUsuario;
    public Delete(Create create) {
        this.create = create;
        
    }
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    
    

    public void eliminarUsuarioPorCedula(String cedulaInput) {
     
        ArrayList<ArrayList<String>> datos = create.getDatosUsuarios();
        try {
            int cedula = Integer.parseInt(cedulaInput);

            ArrayList<ArrayList<String>> usuariosAEliminar = new ArrayList<>();

            for (ArrayList<String> usuario : datos) {
                int cedulaActual = Integer.parseInt(usuario.get(6).substring(16));
                nombreUsuario = usuario.get(0).substring(8);
                apellidoUsuario = usuario.get(1).substring(10);
                
                if (cedulaActual == cedula) {
                    usuariosAEliminar.add(usuario);
                }
            }

            if (!usuariosAEliminar.isEmpty()) {
                
                
                int result = JOptionPane.showConfirmDialog(null, "Se eliminaran los datos del usuario con nombre: " + nombreUsuario +" "+ apellidoUsuario + " ¿Está de acuerdo?", "Confirmación", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if(result == JOptionPane.YES_NO_OPTION ){
                    datos.removeAll(usuariosAEliminar);
                    JOptionPane.showMessageDialog(null,"El usuario ha sido eliminado" );
                }
                
            }else {
                JOptionPane.showMessageDialog(null, "No se encontró un usuario con la cédula proporcionada.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, ingresa una cédula válida.");
        }
    }
}
