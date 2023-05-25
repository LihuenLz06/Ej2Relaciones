/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Jugador;
import Entidades.RevolverAgua;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class ServicioJugador {
    Jugador newJugador = new Jugador();
    //ServicioRevolver sRev = new ServicioRevolver();
    Scanner sc = new Scanner(System.in);
  
    public boolean disparo(ServicioRevolver Rev){
        
        boolean jugadorMojado = false;
        
        jugadorMojado = Rev.mojar();
        
        if (jugadorMojado) {
            return jugadorMojado;
        }else{
            Rev.siguienteChorro();
        }
        
        return jugadorMojado;
    }
    
    public void crearJugadores(){
        int numJ;
        ArrayList<Jugador> listaJugadores = new ArrayList();
        System.out.println("Ingrese la cantidad de jugadores a participar");
        numJ = sc.nextInt();
        if (numJ < 1 || numJ > 6){
            numJ = 6;
        }
        for (int i = 0; i < numJ; i++) {
            newJugador = new Jugador();
            newJugador.setId(i+1);
            newJugador.setNombre("jugador " + newJugador.getId());
            newJugador.setMojado(false);
            
            listaJugadores.add(newJugador);
        }
        ServicioJuego sJuego = new ServicioJuego();
        RevolverAgua newRev = new RevolverAgua();
       
        sJuego.llenarJuego(listaJugadores, newRev);
        
    }
}
