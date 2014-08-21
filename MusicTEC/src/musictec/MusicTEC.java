/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musictec;

import musictec.modelo.AdministradorPrincipal;
import musictec.vistas.VentanaPrincipal;

/**
 *
 * @author Lucia
 */
public class MusicTEC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        AdministradorPrincipal administradorPrincipal = new AdministradorPrincipal();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                VentanaPrincipal ventanaPrincipal = new VentanaPrincipal(administradorPrincipal);
                
                ventanaPrincipal.setVisible(true);

            }
        }
        );

    }
}
