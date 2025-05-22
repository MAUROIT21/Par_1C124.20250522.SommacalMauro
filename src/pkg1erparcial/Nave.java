/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg1erparcial;

import java.util.List;

public abstract class Nave {
    protected String nombre;
    protected int capacidadTripulacion;
    protected String anioLanzamiento;

    public Nave(String nombre, int capacidadTripulacion, String anioLanzamiento) {
        this.nombre = nombre;
        this.capacidadTripulacion = capacidadTripulacion;
        this.anioLanzamiento = anioLanzamiento;
    }
    
    
    public abstract String mostrarNaves();
    
    public void agregarNave(){
        // a la lista
        
    }
    
    public abstract String iniciarExploracion();
    
}
