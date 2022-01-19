/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2.entidades;

public class Revolver {
    private final int tamanioTambor = 6;
    private int posicionTambor;
    private int lugarBala;
    
    
    public Revolver(){
        
    }

    public int getPosicionTambor() {
        return posicionTambor;
    }

    public void setPosicionTambor(int posicionTambor) {
        this.posicionTambor = posicionTambor;
    }

    public int getLugarBala() {
        return lugarBala;
    }

    public void setLugarBala(int lugarBala) {
        this.lugarBala = lugarBala;
    }

    public int getTamanioTambor() {
        return tamanioTambor;
    }
    
    @Override
    public String toString() {
        return "Revolver{" + "posicionTambor=" + posicionTambor + ", lugarBala=" + lugarBala + '}';
    }
    
}
