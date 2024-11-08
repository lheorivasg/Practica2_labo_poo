/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg2.pt2;

/**
 *
 * @author Alumno14
 */
public class Uea {
    private String nombre;
    private String calificacion;

    public Uea() {
    }

    public Uea(String nombre, String calificacion) {
        this.nombre = nombre;
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return "Nombre:" + nombre + "\t calificacion: " + calificacion;
    }
    
    
    
}
