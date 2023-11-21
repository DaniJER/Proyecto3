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
    private String cedula;
    private int contador;
    
    //Set<String> datosUsuarios = new HashSet<String>();
    //Map<Integer, String> id = new HashMap <Integer, String>(); 
    ArrayList<ArrayList<String>> datosUsuarios = new ArrayList();
    ArrayList<String> segundoArrayList = new ArrayList<>();
    ArrayList<String> arrayDeAlmacenar = new ArrayList<>();
    
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
    
    
    /*public Map<Integer, String> getId() {
        return id;
    }*/
    
    //ALMACENAR USUARIOS POR DEFECTO
    public void almacenarUsuariosPorDefault(){
        
        segundoArrayList.add("Pepito");
        segundoArrayList.add("Perez");
        segundoArrayList.add("2334");
        segundoArrayList.add("Av siempre viva 712");
        segundoArrayList.add("junio 1999");
        segundoArrayList.add("1008");
        
        datosUsuarios.add(segundoArrayList);
       
    }
    //ALMACENAR USUARIOS DIGITADOS
    public void almacenarUsuarios(){
       
        arrayDeAlmacenar.add(this.nombre);
        arrayDeAlmacenar.add(String.valueOf(this.apellido));
        arrayDeAlmacenar.add(this.celular);
        arrayDeAlmacenar.add(this.direccion);
        arrayDeAlmacenar.add(this.nacimiento);
        arrayDeAlmacenar.add( String.valueOf(this.cedula));
        datosUsuarios.add(arrayDeAlmacenar);
        
        System.out.println("Usuario agregado");
        System.out.println(datosUsuarios);   
        
    }
    //COMPROBAR CEDULAS DUPLICADAS
    public boolean comprobarUsuarios(int cedula){
      
            for (ArrayList<String> usuario : datosUsuarios) {
            // Obtener la cedula del usuario actual
            
            int cedulaActual = Integer.parseInt(usuario.get(5));

            // Comparar con la cedula proporcionada
            if (cedulaActual == cedula) {
                
                JOptionPane.showMessageDialog(null,"La cedula que ingresaste ya corresponde a un usuario, por favor ingresa otra");
                return true; // Cédula duplicada encontrada
            }
        }
            //Si no se encontro una cedula duplicada, almacenar un usuario.
            almacenarUsuarios();
            return false; // Cédula no duplicada
    }
}
  
      
    
 
    
            



