/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.JuegoRuleta;
import Entidades.Jugador;
import Entidades.RevolverAgua;
import java.util.ArrayList;


/**
 *
 * @author usuario
 */
public class ServicioJuego {
    
    
    JuegoRuleta servJR = new JuegoRuleta();
    ServicioRevolver servRev = new ServicioRevolver();
    ServicioJugador servJu = new ServicioJugador();
    public void llenarJuego(ArrayList<Jugador> jugadores, RevolverAgua nuevoR){
        
        servJR.setJugadores(jugadores);
        servJR.setRev(nuevoR);
        
        ronda();
    }
    
    public void ronda(){
        
        boolean verificarMojado = false;
        servRev.llenarRevolver();
        
        do{
            for (Jugador jugador : servJR.getJugadores()) {
               verificarMojado = servJu.disparo(servRev); 
                if (verificarMojado) {
                    System.out.println("El " + jugador.getNombre() + " ha sido mojado!" );
                    break;
                }
            }
        }while (!verificarMojado);
        
    }
}
