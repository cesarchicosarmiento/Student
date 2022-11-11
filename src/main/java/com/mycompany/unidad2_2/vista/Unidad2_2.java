/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.unidad2_2.vista;
import com.mycompany.unidad2_2.modelo.Estudiante;
import com.mycompany.unidad2_2.servicio.EstudianteService;
import java.time.LocalDate;

/**
 *
 * @author Usuario R
 */
public class Unidad2_2 {

    public static void main(String[] args) {

        var jonna = new Estudiante("Jonnathan", "0125561656", LocalDate.of(2003, 12, 01));
        var cesar = new Estudiante("Cesar", "05545411", LocalDate.of(2009, 9, 17));
        var erika = new Estudiante("Erika", "018645166", LocalDate.of(2000, 12, 15));

        var baseDatosEstudiantes = new EstudianteService();
        baseDatosEstudiantes.crearEstudiante(jonna);
        baseDatosEstudiantes.crearEstudiante(cesar);
        baseDatosEstudiantes.crearEstudiante(erika);

        System.out.println("\n");
        System.out.println(baseDatosEstudiantes.listarEstudiante());

        baseDatosEstudiantes.eliminarEstudiante(012556166);
        System.out.println("\n");
        System.out.println(baseDatosEstudiantes.listarEstudiante());

    }
}
