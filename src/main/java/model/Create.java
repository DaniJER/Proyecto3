/*
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
    private String celular;
    private String direccion;
    private int cedula;
    private int contador;
    
    final Set<String> datosUsuarios = new HashSet<String>();
    Map<Integer, String> id = new HashMap <Integer, String>(); 
    
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
        return cedula;
    }

    public void setId(int cedula) {
        this.cedula = cedula;
    }
    
    //Metodo para almacenar datos en dos colecciones.
    
    public void almacenarUsuarios(){
     
        datosUsuarios.add(this.nombre);
        datosUsuarios.add(this.apellido);
        datosUsuarios.add(this.nacimiento);
        datosUsuarios.add(valueOf(this.celular));
        datosUsuarios.add(this.direccion);
        datosUsuarios.add(valueOf(this.cedula));
        
        
        for (int i = 0; i < id.size(); i++) {
            contador += 1;
        }
     
        id.put(contador, valueOf(datosUsuarios));
        
        System.out.println("DATOS " + id );
    }
    
    public void comprobarUsuarios(){
        
        for (int i = 0; i < id.size(); i++) {
            
            if(id.get(i) == id.get(id)){
                System.out.println("El usuario ya se encuentra registrado, ¿desea sobrescribirlo o desea volver?");
            }
        };
        
    
    }
}
