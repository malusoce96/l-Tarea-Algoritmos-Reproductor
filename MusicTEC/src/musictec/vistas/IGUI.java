/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musictec.vistas;

/**
 *
 * @author RUBEN
 */
public interface IGUI {

    public void mostrarMensajeError(String mensaje, String titulo);
    
    public void mostrarMensajeInformacion(String mensaje, String titulo);

    public void vincularEventos();

    public void mostrarVentana();

    public void ocultarVentana();

}
