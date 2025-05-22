/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg1erparcial;

public class Carguero extends Nave{

    private int capacidadCarga;

    public Carguero(int capacidadCarga, String nombre, int capacidadTripulacion, String anioLanzamiento) {
        super(nombre, capacidadTripulacion, anioLanzamiento);
        this.capacidadCarga = capacidadCarga;
    }
    
    
    @Override
    public String iniciarExploracion() {
        return "Inicia con exito el viaje de Carga. Buen trabajo! ";
    }

    @Override
    public String mostrarNaves() {
        String descripcion = 
                " NOMBRE "
                + nombre +
                " - Capacidad Tripulacion "
                + capacidadTripulacion +
                " - Anio Lanzamiento "
                + anioLanzamiento +
                " - Tipo Nave: CARGUERO" +
                " - Capacidad Carga  "
                + capacidadCarga;
        return descripcion;
    }
    
}
