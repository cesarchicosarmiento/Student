/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.unidad2_2.vista;

import com.mycompany.unidad2_2.modelo.Carrera;
import com.mycompany.unidad2_2.modelo.Estudiante;

/**
 *
 * @author Usuario R
 */
public class Unidad2_2 {

    public static void main(String[] args) {
        var cesar = new Estudiante("Cesar","01065894");
        var compu = new Carrera("Computacion","Ingeniero");
        
        compu.agregarEstudiante(cesar);
        
        System.out.println("Computacion = " + compu);
        
    }
}
