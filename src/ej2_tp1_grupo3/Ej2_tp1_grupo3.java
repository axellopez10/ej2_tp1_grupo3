/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2_tp1_grupo3;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Adrian
 */
public class Ej2_tp1_grupo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here HashMap<String, Estudiante> estudiantes = new HashMap<>();
        
        HashMap<String, Estudiante> estudiantes = new HashMap<>();

        //  Agregar estudiantes
        estudiantes.put("12345678", new Estudiante("Juan", "Pérez", 8.5));
        estudiantes.put("87654321", new Estudiante("María", "Gómez", 9.2));
        estudiantes.put("11223344", new Estudiante("Lucas", "Martínez", 7.0));

        //  Modificar promediode un estudiante
        String dniModificar = "12345678";
        if (estudiantes.containsKey(dniModificar)) {
            estudiantes.get(dniModificar).setPromedio(9.0);
            System.out.println("Promedio de " + dniModificar + " actualizado.");
        }

        //  Eliminaestudiante
        String dniEliminar = "11223344";
        if (estudiantes.remove(dniEliminar) != null) {
            System.out.println("Estudiante con DNI " + dniEliminar + " eliminado.");
        }

        // Muestra todos los estudiantes
        System.out.println("\nLista de estudiantes:");
        for (Map.Entry<String, Estudiante> entry : estudiantes.entrySet()) {
            System.out.println("DNI: " + entry.getKey() + " -> " + entry.getValue());
        }
    }
}
        
        
        
        
    
    

