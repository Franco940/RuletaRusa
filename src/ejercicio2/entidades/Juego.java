/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2.entidades;

import static java.lang.Thread.sleep;
import java.util.List;

public class Juego {
    private List<Jugador> jugadores;
    private Revolver revolver;
    private int ronda = 1;
    
    public Juego(){
        
    }
    
    public void llenarJuego(List<Jugador> jugadores, Revolver revolver){
        this.jugadores = jugadores;
        this.revolver = revolver;
    }
    
    public void inicio() throws InterruptedException{
        boolean fin = true; // Si fin esta en falso, el juego termina
        System.out.println("\n¡Comienza el juego!");
        
        while(fin){
            for (Jugador j : jugadores) {
                sleep(1500);
                System.out.println("\nRONDA " + ronda);
                System.out.println(j.getNombre() + " va a disparar!");
                sleep(2000);
                j.disparo(revolver);
                if(j.isMojado()){
                    System.out.println("¡" + j.getNombre().toUpperCase() + " HA PERDIDO!");
                    System.out.println("\n\nEL JUEGO FINALIZÓ");
                    fin = false;
                    break; // Para salir del for
                }else{
                    revolver.siguienteDisparo();
                    ronda++;
                } 
            }
        }
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver getRevolver() {
        return revolver;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }

    public int getRonda() {
        return ronda;
    }

    public void setRonda(int ronda) {
        this.ronda = ronda;
    }

    @Override
    public String toString() {
        return "Juego{" + "jugadores=" + jugadores + ", revolver=" + revolver + ", ronda=" + ronda + '}';
    }
    
}
