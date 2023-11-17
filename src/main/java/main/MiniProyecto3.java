/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

import controller.CreateController;
import controller.PrincipalController;
import model.Create;
import view.CreateView;
import view.PrincipalView;
/**
 *
 * @author El Rey
 */
public class MiniProyecto3 {

    public static void main(String[] args) {
        
        //Instanciar todos los objetos de clases
        PrincipalView ventanaPrincipal = new PrincipalView();
        CreateView ventanaCrear = new CreateView();
        Create modeloCrear = new Create();

        //Instanciando el objeto de la clase Create Controller y pasandole como parametro lo mismo que estaba en su constructor
        //pero en esta clase se le pasa los objetos instanciados.
        CreateController controladorCrear = new CreateController(ventanaPrincipal, modeloCrear, ventanaCrear);
        ventanaPrincipal.setVisible(true);
        controladorCrear.iniciarPrograma();
    
    }
}
