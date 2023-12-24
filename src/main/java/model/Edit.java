/*
   UNIVERSIDAD DEL VALLE - TECNOLOGIA EN DESARROLLO DE SOFTWARE
   DEVELOPED BY:DANIEL JOSE ENRIQUEZ, COD: 2240920 & JUAN SEBASTIAN VIEDMAN, COD: 2242562

*/
package model;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Edit {
    
    private Create create;
    private String nombre;
    private String apellido;
    private String nacimiento;
    private String tipoTel;
    private String celular;
    private String tipoUsuario;
    private String direccion;
    
    public Edit(Create create) {
        this.create = create;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombreUsuario) {
        this.nombre = nombreUsuario;
    }

    public Create getCreate() {
        return create;
    }

    public void setCreate(Create create) {
        this.create = create;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getTipoTel() {
        return tipoTel;
    }

    public void setTipoTel(String tipoTel) {
        this.tipoTel = tipoTel;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean validarUsuario(String id) {
     
        ArrayList<ArrayList<String>> datos = create.getDatosUsuarios();

        boolean usuarioEncontrado = false;

        // Iterar sobre la colección de usuarios
        for (ArrayList<String> usuario : datos) {
            // Obtener el ID del usuario actual (cédula en este caso)
            String idUsuario = usuario.get(6);
            String idUsuarioSubstring = idUsuario.substring(16);
            
            // Verificar si el ID coincide con el proporcionado
            if (idUsuarioSubstring.equals(id)) {
                usuarioEncontrado = true;
                return true;
            }
        }

        // Imprimir mensaje si no se encontró el usuario
        if (!usuarioEncontrado) {
            JOptionPane.showMessageDialog(null, "No se encontró un usuario con la cédula proporcionada.");
        }
    return false;
    }
    
    public void updateUser(){
        ArrayList<ArrayList<String>> arrayDeActualizar = create.getDatosUsuarios();
        
        for (ArrayList<String> usuario : arrayDeActualizar) {
            usuario.set(0, this.nombre);
            usuario.set(1, this.apellido);
            usuario.set(2, this.tipoTel);
            usuario.set(3, this.celular);
            usuario.set(4, this.direccion);
            usuario.set(5, this.nacimiento);
            usuario.set(7, this.tipoUsuario);
            JOptionPane.showMessageDialog(null,"El usuario ha sido actualizado");
        }
    }
}