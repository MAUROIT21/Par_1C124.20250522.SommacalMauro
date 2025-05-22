/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg1erparcial;

/**
 *
 * @author Anto
 */
public class CruceroEstelar extends Nave {
    private int cantidadPasajeros;

    public CruceroEstelar(int cantidadPasajeros, String nombre, int capacidadTripulacion, String anioLanzamiento) {
        super(nombre, capacidadTripulacion, anioLanzamiento);
        this.cantidadPasajeros = cantidadPasajeros;
    }

    @Override
    public String iniciarExploracion() {
        return "Los crucerosEstelares no pueden hacer viajes de exploracion...  ";

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
                " - Tipo Nave: CRUCERO ESTELAR " +
                " - Cantidad Pasajeros "
                + cantidadPasajeros;
        return descripcion;
    }
    
    
}
