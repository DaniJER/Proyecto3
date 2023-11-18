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
    private int celular;
    private String direccion;
    private int id;
    Set<Create> usuarios = new HashSet<>();

   /* public Create(String nombre, String apellido, String nacimiento, int celular, String direccion, int id, PrincipalView vistaPrincipal) {
        super(vistaPrincipal);
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento = nacimiento;
        this.celular = celular;
        this.direccion = direccion;
        this.id = id;
    }*/
    
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

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
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
        usuarios.add(this);
        JOptionPane.showMessageDialog(null, usuarios);
    }
    
    public void mostraUsarios(){
        
        System.out.println("el nombre del usuario es: "+nombre);
        
    }
    
}

