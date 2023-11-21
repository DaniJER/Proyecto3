/*
   UNIVERSIDAD DEL VALLE - TECNOLOGIA EN DESARROLLO DE SOFTWARE
   DEVELOPED BY:DANIEL JOSE ENRIQUEZ, COD: 2240920 & JUAN SEBASTIAN VIEDMAN, COD: 2242562

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;  

import java.util.ArrayList;

/**
 *
 * @author Juan
 */
public class Read extends Create{
    
    ArrayList<String> listaDeUsuarios = new ArrayList<>();
    
    
    public void leerColeccion(){
        
        listaDeUsuarios.add(String.valueOf(datosUsuarios));
        System.out.println(listaDeUsuarios);
        Create coleccion = new Create();
        //System.out.println(coleccion.getId());
        
        }
}
