/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import ejercicio2.entidades.Juego;
import ejercicio2.servicios.ServicioJuego;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("¡Bienvenido a la Ruleta Rusa que se juega con una pistola de agua!");
        ServicioJuego servicioJuego = new ServicioJuego();
        Juego juego = servicioJuego.crearJuego();
        
        try {
            servicioJuego.inicio(juego);
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
