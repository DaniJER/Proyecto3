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

public class Read extends Create {

    public void leerColeccion(int id) {
        ArrayList<ArrayList<String>> datos = getDatosUsuarios();

        // Imprimir la colección para depuración
        System.out.println("Contenido de la colección:");
        System.out.println(datos);

        boolean usuarioEncontrado = false;

        // Iterar sobre la colección de usuarios
        for (ArrayList<String> usuario : datos) {
            // Obtener el ID del usuario actual (cédula en este caso)
            String idUsuario = usuario.get(6);

            // Convertir el ID proporcionado a cadena
            String idProporcionado = String.valueOf(id);

            // Verificar si el ID coincide con el proporcionado
            if (idUsuario.equals(idProporcionado)) {
                // Mostrar la información del usuario
                System.out.println("Nombre: " + usuario.get(0));
                System.out.println("Apellido: " + usuario.get(1));
                // Imprimir otros campos según sea necesario
                System.out.println("------------------------");

                // Puedes agregar más lógica aquí si necesitas hacer algo específico con el usuario encontrado
                usuarioEncontrado = true;
            }
        }

        // Imprimir mensaje si no se encontró el usuario
        if (!usuarioEncontrado) {
            System.out.println("No existe el usuario");
        }
    }
}




