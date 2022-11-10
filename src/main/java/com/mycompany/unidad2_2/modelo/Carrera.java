/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unidad2_2.modelo;

import java.util.ArrayList;

/**
 *
 * @author Usuario R
 */
public class Carrera {
    private String nombre;
    private String titulo;
    private ArrayList<Estudiante> estudianteList;

    public Carrera(String nombre, String titulo) {
        this.nombre = nombre;
        this.titulo = titulo;
        this.estudianteList = new ArrayList<>();
    }
    
    public void agregarEstudiante(Estudiante e){
         this.estudianteList.add(e);
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<Estudiante> getEstudianteList() {
        return estudianteList;
    }

    public void setEstudianteList(ArrayList<Estudiante> estudianteList) {
        this.estudianteList = estudianteList;
    }

    @Override
    public String toString() {
       var retorno= "Carrera{" + "nombre=" + nombre + ", titulo=" + titulo + 
                ", estudianteList=" + estudianteList + '}';
         for (var carrera : this.estudianteList) {
            retorno += carrera.toString() + "\n";
        }
        
        return retorno;
    }
    
    
}
