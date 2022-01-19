/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2.servicios;

import ejercicio2.entidades.Revolver;

public class ServicioRevolver {
    
    
    public void llenarRevolver(Revolver revolver){
        System.out.println("### Cargando revolver... ###");
        revolver.setLugarBala((int) (Math.random() * 6 + 1));
        
        System.out.println("### Girando tambor... ###");
        
        revolver.setPosicionTambor((int) (Math.random() * 6 + 1));
        System.out.println("### Revolver preparado ###");
    }
    
    public boolean mojar(Revolver revolver){
        if(revolver.getLugarBala() == revolver.getPosicionTambor()){
            System.out.println("### DISPARO EFECTUADO ###");
            return true;
        }else{
            System.out.println("### NO SALE NADA, SE HA SALVADO ###");
            return false;
        }
    }
    
    public void siguienteDisparo(Revolver revolver){
        if(revolver.getPosicionTambor() == revolver.getTamanioTambor()){
            revolver.setPosicionTambor(1);
        }else{
            revolver.setPosicionTambor(revolver.getPosicionTambor() + 1);
        }
    }
    
}
