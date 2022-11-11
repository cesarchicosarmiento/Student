/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unidad2_2.modelo;

import java.time.LocalDate;

/**
 *
 * @author Usuario R
 */
public class Estudiante {

    private String nombre;
    private String cedula;
    private LocalDate fechaNacimiento;

    public Estudiante(String nombre, String cedula, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    

    private int calcularEdad() {
        var yearActual = LocalDate.now().getYear();
        var diaActual = LocalDate.now().getDayOfMonth();
        var mesActual = LocalDate.now().getMonthValue();
        var edad = 0;
        var diaNacimiento = fechaNacimiento.getDayOfMonth();
        var mesNacimiento = fechaNacimiento.getMonthValue();
        var yearNacimiento = fechaNacimiento.getYear();

        if (diaNacimiento < diaActual) {
            mesActual -= 1;
            
            if(mesNacimiento < mesActual){
                yearNacimiento -= yearActual -1;                
            }else{
                yearNacimiento -= yearActual;
            }
        }else{
            if(mesNacimiento < mesActual){
                yearNacimiento -= yearActual -1;
                
            }else{
                yearNacimiento -= yearActual;
            }
        }
        edad = yearNacimiento;
        return edad;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", cedula=" + cedula + 
                ", fechaNacimiento=" + fechaNacimiento + "edad= "+ calcularEdad()+ '}';
    }

    
  

}
