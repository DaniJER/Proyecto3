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
public class Delete extends Create{
    
    public void eliminarUsuarioPorCedula(String cedulaInput) {
        
    try {
        int cedula = Integer.parseInt(cedulaInput);

        ArrayList<ArrayList<String>> usuariosAEliminar = new ArrayList<>();

        for (ArrayList<String> usuario : datosUsuarios) {
            int cedulaActual = Integer.parseInt(usuario.get(6).substring(16));

            System.out.println("Cedula actual: " + cedulaActual);
            System.out.println("Cedula proporcionada: " + cedula);

            if (cedulaActual == cedula) {
                usuariosAEliminar.add(usuario);
            }
        }

        if (!usuariosAEliminar.isEmpty()) {
            datosUsuarios.removeAll(usuariosAEliminar);
            System.out.println("Usuario(s) con cédula " + cedula + " eliminado(s)");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró un usuario con la cédula proporcionada.");
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Por favor, ingresa una cédula válida.");
    }
}
}
