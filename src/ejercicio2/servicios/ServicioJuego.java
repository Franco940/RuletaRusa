/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2.servicios;

import ejercicio2.entidades.Juego;
import ejercicio2.entidades.Jugador;
import ejercicio2.entidades.Revolver;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServicioJuego {
    
    private Scanner input = new Scanner(System.in);
    private ServicioJugador servicioJugador = new ServicioJugador();
    
    public Juego crearJuego(){
        Juego juego = new Juego();
        Revolver r = new Revolver();
        int cantJugadores;
        
        System.out.println("Digite el numero de jugadores que van a participar (1-6)");
        cantJugadores = input.nextInt();
        
        if(cantJugadores < 1){
            cantJugadores = 1;
        }else if(cantJugadores > 6){
            cantJugadores = 6;
        }
        
        List<Jugador> listAux = new ArrayList();
        for(int i = 1; i <= cantJugadores; i++){
            listAux.add(servicioJugador.crearJugador(i)); // paso como parametro i porque es el ID 
        }
        
        r.llenarRevolver();
        
        juego.llenarJuego(listAux, r);
        
        return juego;
    }
}
