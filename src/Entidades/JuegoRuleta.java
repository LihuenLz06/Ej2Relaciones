/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;


import java.util.List;

/**
 *
 * @author usuario
 */
public class JuegoRuleta {
    
    private List <Jugador> jugadores;
    private RevolverAgua Rev;

    public JuegoRuleta() {
    }

    public JuegoRuleta(List<Jugador> jugadores, RevolverAgua Rev) {
        this.jugadores = jugadores;
        this.Rev = Rev;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public RevolverAgua getRev() {
        return Rev;
    }

    public void setRev(RevolverAgua Rev) {
        this.Rev = Rev;
    }

    @Override
    public String toString() {
        return "JuegoRuleta{" + "jugadores=" + jugadores + ", Rev=" + Rev + '}';
    }

   
   
  
    
    
}
