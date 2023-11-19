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
import static java.lang.String.valueOf;
import view.PrincipalView;
import java.util.HashSet;
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
    private int id;
    Set<String> usuarios = new HashSet<>(10); 
    
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void almacenarUsuarios(){
        
        for (int i = 0; i < usuarios.size(); i++) {
            
            usuarios.add(this.nombre);
            //usuarios.add(this.apellido);
            //usuarios.add(this.direccion);
            //usuarios.add(this.nacimiento);
            //usuarios.add(valueOf(this.celular));
            //usuarios.add(valueOf(this.id));
           
        }
        System.out.println(usuarios);
        //JOptionPane.showMessageDialog(null, usuarios);
    }
    
    public void mostrarUsarios(){
        
        System.out.println("el nombre del usuario es: "+usuarios);
        
    }
}
