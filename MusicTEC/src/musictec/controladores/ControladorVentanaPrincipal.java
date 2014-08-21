/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package musictec.controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import musictec.modelo.AdministradorPrincipal;
import musictec.vistas.VentanaPrincipal;

/**
 *
 * @author Lucia
 */
public class ControladorVentanaPrincipal implements ActionListener{
    
    private AdministradorPrincipal administradorPrincipal;
    private VentanaPrincipal ventanaPrincipal;

    public ControladorVentanaPrincipal(AdministradorPrincipal administradorPrincipal, VentanaPrincipal ventanaPrincipal) {
        this.administradorPrincipal = administradorPrincipal;
        this.ventanaPrincipal = ventanaPrincipal;
    }
    
    

    @Override
    public void actionPerformed(ActionEvent evento) {
        
        Object fuenteDelEvento = evento.getSource();
        
        if (fuenteDelEvento == ventanaPrincipal.getjButtonAgregarMusica()){
            System.out.println("El controlador de la ventana a detectado que se desea agregar una cancion");
            agregarCancion("Escritorio/Lu/hunger.mp3");
        }
        
    }
    
    private void agregarCancion(String rutaCancion){
        
        administradorPrincipal.agregarCancion(rutaCancion);
        
    }
    
}
