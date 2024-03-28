/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1_Avion;

/**
 *
 * @author franc
 */
public class Piloto extends Persona implements Volador {
    int matricula;
    Avion vuela;

    public Piloto(int matricula, Avion vuela, String nombre, String dni) {
        super(nombre, dni);
        this.matricula = matricula;
        this.vuela = vuela;
    }
    
    @Override
    public void vuela(){
        System.out.println("Volando...");
    };
    
    
    
}
