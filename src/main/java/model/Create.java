/*
   UNIVERSIDAD DEL VALLE - TECNOLOGIA EN DESARROLLO DE SOFTWARE
   DEVELOPED BY:DANIEL JOSE ENRIQUEZ, COD: 2240920 & JUAN SEBASTIAN VIEDMAN, COD: 2242562

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author El Rey
 */
/*
UNIVERSIDAD DEL VALLE
HECHO POR:
DANIEL JOSE ENRIQUEZ, COD: 2240920 Y JUAN SEBASTIAN VIEDMAN, COD: 2242562

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import controller.CreateController;
import java.awt.List;
import static java.lang.String.valueOf;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import view.PrincipalView;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;
/**
 *
 * @author El Rey
 */
public class Create{
    
    private String nombre;
    private String apellido;
    private String nacimiento;
    private String tipoTel;
    private String celular;
    private String tipoUsuario;
    private String direccion;
    private String cedula;

    ArrayList<ArrayList<String>> datosUsuarios = new ArrayList<>();
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCedula() {
        return Integer.parseInt(cedula);
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    public String getTipoTel(){
        return tipoTel;
    }
    
    public void setTipoTel(String tipoTel){
        this.tipoTel = tipoTel;
    }
    
    public String getTipoUsuario(){
        return tipoUsuario;
    }
    
    public void setTipoUsuario(String tipoUsuario){
        this.tipoUsuario = tipoUsuario;
    }
    
     public ArrayList<ArrayList<String>> getDatosUsuarios() {
        return datosUsuarios;
    }

    public void setDatosUsuarios(ArrayList<ArrayList<String>> datosUsuarios) {
        this.datosUsuarios = datosUsuarios;
    }
   
    //ALMACENAR USUARIOS DIGITADOS
    public void almacenarUsuarios() {
        ArrayList<String> arrayDeAlmacenar = new ArrayList<>();

        arrayDeAlmacenar.add(this.nombre);
        arrayDeAlmacenar.add(this.apellido);
        arrayDeAlmacenar.add(this.tipoTel);
        arrayDeAlmacenar.add(this.celular);
        arrayDeAlmacenar.add(this.direccion);
        arrayDeAlmacenar.add(this.nacimiento);
        arrayDeAlmacenar.add(String.valueOf(this.cedula));
        arrayDeAlmacenar.add(this.tipoUsuario);

        datosUsuarios.add(arrayDeAlmacenar);
        JOptionPane.showMessageDialog(null,"El usuario ha sido agregado");
    }

    // Método para comprobar cédulas duplicadas
    public boolean comprobarUsuarios(int cedula) {
        
        for (ArrayList<String> usuario : datosUsuarios) {
            int cedulaActual = Integer.parseInt(usuario.get(6).substring(16));

            if (cedulaActual == cedula) {
                JOptionPane.showMessageDialog(null, "La cedula que ingresaste ya corresponde a un usuario, por favor ingresa otra");
                return true; // Cédula duplicada encontrada
            }
        }
        almacenarUsuarios();
        return false; // Cédula no duplicada
    }
}
  
      
    
 
    
            



