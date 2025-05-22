/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg1erparcial;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

   
    public static void main(String[] args) {
        
        List<Nave> listaNaves = new ArrayList<>();

        
        // Menu generico
        int opcion;
        int opcionNave;
        String nombreNave;
        int capacidadTripulacion;
        String anioLanzamiento;
        int capacidadCarga;
        String opcionTipo;
        int cantPasajeros;
        
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.println(" Menú opciones");
            System.out.println("1. Agregar nave (Exploración, Carguero o Crucero Estelar) ");
            System.out.println("2. Mostrar todas las naves registradas ");
            System.out.println("3. Iniciar misión de exploración");
            System.out.println("4. Mostrar naves ordenadas por nombre (Comparable)");
            System.out.println("5. Mostrar naves ordenadas por año de lanzamiento descendente. ");
            System.out.println("6. Mostrar naves ordenadas por capacidad de tripulación descendente. ");
            System.out.println("7. Salir del sistema");

            opcion = sc.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println(" --- Tipo de Nave ---");
                    System.out.println(" 1. Nave de exploracion");
                    System.out.println(" 2. Carguero");
                    System.out.println(" 3. Crucero Estelar");
                    System.out.println("> Seleccione el tipo de nave: ");
                    opcionNave = sc.nextInt();
                    System.out.println("+ Nombre: ");
                    nombreNave = sc.next();
                    System.out.println("+ Capacidad de Tripulacion: ");
                    capacidadTripulacion = sc.nextInt();
                    System.out.println("+ Año de Lanzamiento: ");
                    anioLanzamiento = sc.next();
                    
                    
                    switch (opcionNave){
                        case 1:
                            System.out.println("Ingrese Tipo de Mision (Cartografia - Investigacion - Contacto )");
                            opcionTipo = sc.next();
                            Nave naveExp = new NaveExploracion(opcionTipo, nombreNave, capacidadTripulacion, anioLanzamiento);
                            listaNaves.add(naveExp);
                            break;
                        case 2:
                            System.out.println("+ Capacidad de Carga: (100 a 500): ");
                            capacidadCarga = sc.nextInt();
                            if (capacidadCarga < 100){
                                capacidadCarga = 100;
                                } else if (capacidadCarga > 500) {
                                    capacidadCarga = 500;
                                       };                            
                            
                            Nave naveCarg = new Carguero(capacidadCarga, nombreNave, capacidadTripulacion, anioLanzamiento);
                            listaNaves.add(naveCarg);
                            break;
                        case 3:
                            System.out.println("+ Cantidad de pasajeros: ");
                            cantPasajeros = sc.nextInt();
                            Nave naveCruc = new CruceroEstelar(cantPasajeros, nombreNave, capacidadTripulacion, anioLanzamiento);
                            listaNaves.add(naveCruc);
                            break;
                    }
                            
                            
                    break;
                case 2:
                    // Mostrar todas las naves registradas
                    for (int i = 0; i < listaNaves.size(); i++){
                    Nave item = listaNaves.get(i);
                    System.out.println(item.mostrarNaves());
                    }                   
                    break;
                case 3:
                    for (int i = 0; i < listaNaves.size(); i++) {
                        Nave item = listaNaves.get(i);
                        System.out.println(" >>> " + item.nombre);
                        System.out.println(item.iniciarExploracion() + "\n");
                    }
                    break;
                case 4:
                    
                    break;
                case 7:
                    System.out.println("Saliendo del sistema ");
                    break;
                default:
                    System.out.println("Opción no válida");
            }

        } while (opcion != 7);

    }
    
}
