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

public class Read{
    
    private Create create;
    private String nombre;
    private String apellido;
    private String nacimiento;
    private String tipoTel;
    private String celular;
    private String tipoUsuario;
    private String direccion;
    public Read(Create create) {
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

    public boolean leerColeccion(String id) {
     
        ArrayList<ArrayList<String>> datos = create.getDatosUsuarios();

        boolean usuarioEncontrado = false;

        // Iterar sobre la colección de usuarios
        for (ArrayList<String> usuario : datos) {
            // Obtener el ID del usuario actual (cédula en este caso)
            String idUsuario = usuario.get(6);
            String idUsuarioSubstring = idUsuario.substring(16);
            
            // Verificar si el ID coincide con el proporcionado
            if (idUsuarioSubstring.equals(id)) {
                // Mostrar la información del usuario
                String nombreUsuario = usuario.get(0);
                String apellidoUsuario = usuario.get(1);
                String tipoTelUsuario = usuario.get(2);
                String celularUsuario = usuario.get(3);
                String direccionUsuario = usuario.get(4);
                String nacimientoUsuario = usuario.get(5);
                String tipoUsuarios = usuario.get(7);
                this.nombre = nombreUsuario.substring(7);
                this.apellido = apellidoUsuario.substring(10);
                this.tipoTel = tipoTelUsuario.substring(18);
                this.celular = celularUsuario.substring(19);
                this.direccion = direccionUsuario.substring(11);
                this.nacimiento = nacimientoUsuario.substring(20);
                this.tipoUsuario = tipoUsuarios.substring(17);
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
}




