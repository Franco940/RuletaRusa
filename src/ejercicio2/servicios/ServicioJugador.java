/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2.servicios;

import ejercicio2.entidades.Jugador;
import ejercicio2.entidades.Revolver;
import java.util.Scanner;

public class ServicioJugador {
    
    private Scanner input = new Scanner(System.in);
    private ServicioRevolver servicioRevolver = new ServicioRevolver();
    
    
    public Jugador crearJugador(int id){
        System.out.println("Jugador " + id);
        Jugador jugador = new Jugador();
        String nombre;
        
        System.out.print("Nombre: ");
        nombre = input.nextLine();
        System.out.println("");
        
        jugador.setNombre(nombre);
        jugador.setId(id);
        
        return jugador;
    }
    
    public void disparo(Jugador jugador, Revolver r){
        if(servicioRevolver.mojar(r)){
            jugador.setMojado(true);
        }
    }
}
