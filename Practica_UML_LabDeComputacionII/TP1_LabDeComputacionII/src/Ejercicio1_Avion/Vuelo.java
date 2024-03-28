/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1_Avion;

import java.util.ArrayList;

/**
 *
 * @author franc
 */
public class Vuelo {
    public Avion pertenece;
    public int id;
    public ArrayList<Reserva> reservas;

    public Vuelo(Avion pertenece, int id, ArrayList reservas) {
        this.pertenece = pertenece;
        this.id = id;
        this.reservas = reservas;
    }

    public Avion getPertenece() {
        return pertenece;
    }

    public void setPertenece(Avion pertenece) {
        this.pertenece = pertenece;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList getReservas() {
        return reservas;
    }

    public void setReservas(ArrayList reservas) {
        this.reservas = reservas;
    }
    
    
}
