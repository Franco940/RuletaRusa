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

    @Override
    public String toString() {
        return "Revolver{" + "posicionTambor=" + posicionTambor + ", lugarBala=" + lugarBala + '}';
    }
    
    public void llenarRevolver(){
        System.out.println("### Cargando revolver... ###");
        this.lugarBala = (int) (Math.random() * 6 + 1);
        
        System.out.println("### Girando tambor... ###");
        
        this.posicionTambor = (int) (Math.random() * 6 + 1);
        System.out.println("### Revolver preparado ###");
    }
    
    public boolean mojar(){
        if(this.lugarBala == this.posicionTambor){
            System.out.println("### DISPARO EFECTUADO ###");
            return true;
        }else{
            System.out.println("### NO SALE NADA, SE HA SALVADO ###");
            return false;
        }
    }
    
    public void siguienteDisparo(){
        if(this.posicionTambor == this.tamanioTambor){
            this.posicionTambor = 1;
        }else{
            this.posicionTambor++;
        }
    }
    
}
