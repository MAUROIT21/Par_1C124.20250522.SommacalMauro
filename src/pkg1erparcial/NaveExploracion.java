/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg1erparcial;


public class NaveExploracion extends Nave {
    private String tipoMision;

    public NaveExploracion(String tipoMision, String nombre, int capacidadTripulacion, String anioLanzamiento) {
        super(nombre, capacidadTripulacion, anioLanzamiento);
        this.tipoMision = tipoMision;
    }

    
    @Override
    public String iniciarExploracion() {
        
        return "Inicia con exito la Exploracion. Buen viaje! ";
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
                " - Tipo Nave: EXPLORACION" + 
                " - Tipo Mision "
                + tipoMision;
        return descripcion;
    }
    
}
