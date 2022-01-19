/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2.servicios;

import ejercicio2.entidades.Juego;
import ejercicio2.entidades.Jugador;
import ejercicio2.entidades.Revolver;
import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServicioJuego {
    
    private Scanner input = new Scanner(System.in);
    private ServicioJugador servicioJugador = new ServicioJugador();
    private ServicioRevolver servicioRevolver = new ServicioRevolver();
    
    public Juego crearJuego(){
        Juego juego;
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
        
        servicioRevolver.llenarRevolver(r);
        
        juego = new Juego(listAux, r);
        
        return juego;
    }
    
    public void inicio(Juego juego) throws InterruptedException{
        System.out.println("\n¡Comienza el juego!");
        
        a: while(true){
            for (Jugador jugador : juego.getJugadores()) {
                sleep(1500);
                System.out.println("\nRONDA " + juego.getRonda());
                System.out.println("¡" + jugador.getNombre() + " va a disparar!");
                sleep(2000);
                servicioJugador.disparo(jugador, juego.getRevolver());
                if(jugador.isMojado()){
                    System.out.println("¡" + jugador.getNombre().toUpperCase() + " SE HA MOJADO!");
                    System.out.println("\n\nEL JUEGO FINALIZÓ, " + jugador.getNombre().toUpperCase() + " HA PERDIDO");
                    break a; // Hace que se termine el bucle while
                }else{
                    servicioRevolver.siguienteDisparo(juego.getRevolver());
                    juego.setRonda(juego.getRonda() + 1);
                } 
            }
        }
    }
}