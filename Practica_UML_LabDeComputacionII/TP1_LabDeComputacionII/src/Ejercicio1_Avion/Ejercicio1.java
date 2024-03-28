/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio1_Avion;

import java.util.ArrayList;

/**
 *
 * @author franc
 */
public class Ejercicio1{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Reserva> reservas = new ArrayList();
        reservas.add(new Reserva(1, null));
        reservas.add(new Reserva(2, null));
        
        Flota flota1 = new Flota();
        
        Piloto[] pilotos = new Piloto[2];
        pilotos[0] = new Piloto(1010, null, "Homero", "12345678");
        pilotos[1] = new Piloto(2020, null, "Matias", "37654321");
        
        
        Vuelo vuelo1 = new Vuelo(null, 2314, reservas);
        ArrayList<Vuelo> vuelos = new ArrayList();
        vuelos.add(vuelo1);
    
        // Setear reservas en vuelos
        reservas.get(0).v = vuelo1;
        reservas.get(0).v = vuelo1;
        
        Avion avion1 = new Avion(12000, vuelos, flota1, pilotos);
        vuelo1.setPertenece(avion1);
        
        pilotos[0].vuela();
        pilotos[1].vuela();

    }
    
}
