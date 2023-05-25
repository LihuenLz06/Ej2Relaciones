/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.RevolverAgua;
import java.util.Random;



public class ServicioRevolver {
    
    RevolverAgua nuevoR = new RevolverAgua();
    
    public void llenarRevolver(){
        Random rm = new Random();
        nuevoR.setPosicionActual(rm.nextInt(6)+1);
        nuevoR.setPosicionAgua(rm.nextInt(6)+1);
        
        System.out.println(nuevoR);
    }
    
    public boolean mojar(){
        boolean mojado = false;
        if (nuevoR.getPosicionActual()==nuevoR.getPosicionAgua()) {
            mojado = true;
        }
        return mojado;
    }
    
    public void siguienteChorro(){
        
        Integer posActual = nuevoR.getPosicionActual();
        posActual++;
        if (posActual > 6) {
        posActual=1;
        }
        nuevoR.setPosicionActual(posActual);    
       
        System.out.println(nuevoR);
    }
    
   
    
    
}
