/*
   UNIVERSIDAD DEL VALLE - TECNOLOGIA EN DESARROLLO DE SOFTWARE
   DEVELOPED BY:DANIEL JOSE ENRIQUEZ, COD: 2240920 & JUAN SEBASTIAN VIEDMAN, COD: 2242562

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;
import controller. *;
import model. *;
import view. *;
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
        DeleteView vistaEliminar = new DeleteView();
        ReadView vistaListar = new ReadView();
        Read leer = new Read();
        Delete deleteModel = new Delete();
        
        
        //Instanciando el objeto de la clase Create Controller y pasandole como parametro lo mismo que estaba en su constructor
        //pero en esta clase se le pasa los objetos instanciados.
        
        CreateController controladorCrear = new CreateController(ventanaPrincipal, modeloCrear, ventanaCrear);
        ventanaPrincipal.setVisible(true);
        controladorCrear.iniciarPrograma();
        
        EditController controladorEditar = new EditController(ventanaPrincipal,modeloEditar,vistaEditar, vistaBuscarYActualizarUsuario);
        controladorEditar.iniciarVistaEditar();
        
        DeleteController controladorEliminar = new DeleteController(ventanaPrincipal,vistaEliminar, deleteModel);
        
        ReadController controladorListar = new ReadController(ventanaPrincipal, vistaListar, leer);
        controladorListar.iniciarVistaListar();
    }
}
