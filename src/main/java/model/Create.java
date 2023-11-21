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
import java.util.ArrayList;
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
    
    //Set<String> datosUsuarios = new HashSet<String>();
    //Map<Integer, String> id = new HashMap <Integer, String>(); 
    private ArrayList<ArrayList<String>> datosUsuarios = new ArrayList();
    
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

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    /*public Map<Integer, String> getId() {
        return id;
    }*/
    
    //ALMACENAR DATO
    
    public boolean comprobarUsuarios(int cedula){
        
        ArrayList<String> segundoArrayList = new ArrayList<>();
        
        if(segundoArrayList.isEmpty() == true){
            
                segundoArrayList.add(String.valueOf(this.apellido));
                segundoArrayList.add(this.celular);
                segundoArrayList.add(this.direccion);
                segundoArrayList.add(this.nacimiento);
                segundoArrayList.add( String.valueOf(this.cedula));
                datosUsuarios.add(segundoArrayList);
                System.out.println("Usuario agregado");
                System.out.println(datosUsuarios);
                
                for (int i = 0; i < segundoArrayList.size(); i++) {
                    String elemento = segundoArrayList.get(i);
                    
                    if(String.valueOf(cedula).equals(segundoArrayList.get(String.valueOf(elemento)))){
                        
                        System.out.println("Usuario ya registrado :( ");
                    
                    }
                }
                
        }  
        /*if(segundoArrayList.isEmpty() == false){
                    
            if(String.valueOf(cedula).equals(segundoArrayList.contains(4))){
        
                System.out.println("Cedula ya registrada");
                    return false;
                }else{
                      return true;
                    }
                  
        }
        }*/
        return false;
    }
            
} 


