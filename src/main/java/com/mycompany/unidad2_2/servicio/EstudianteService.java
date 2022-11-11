/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unidad2_2.servicio;

import com.mycompany.unidad2_2.modelo.Estudiante;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario R
 */
public class EstudianteService {
    public List <Estudiante> estudianteList;
     
    

    public EstudianteService() {
        this.estudianteList= new ArrayList<>();
    }
   
    public void crearEstudiante(Estudiante estudiante){
        this.estudianteList.add(estudiante);
    }
    
    public  List<Estudiante> listarEstudiante(){
        return this.estudianteList;
    }
    
    public void eliminarEstudiante(int cedula){
        this.estudianteList.remove(cedula);
        
    }
           
    
    
}
