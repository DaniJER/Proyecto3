/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

import controller.CreateController;
import controller.EditController;
import model.Create;
import model.Edit;
import view.CreateView;
import view.EditView;
import view.PrincipalView;
import view.SearchUserToUpdateView;
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
        Edit modeloEditar = new Edit();
        EditView vistaEditar = new EditView();
        SearchUserToUpdateView vistaBuscarYActualizarUsuario = new SearchUserToUpdateView();
        
        //Instanciando el objeto de la clase Create Controller y pasandole como parametro lo mismo que estaba en su constructor
        //pero en esta clase se le pasa los objetos instanciados.
        
        CreateController controladorCrear = new CreateController(ventanaPrincipal, modeloCrear, ventanaCrear);
        ventanaPrincipal.setVisible(true);
        controladorCrear.iniciarPrograma();
        
        EditController controladorEditar = new EditController(ventanaPrincipal,modeloEditar,vistaEditar, vistaBuscarYActualizarUsuario);
        controladorEditar.iniciarVistaEditar();
    
    }
}
