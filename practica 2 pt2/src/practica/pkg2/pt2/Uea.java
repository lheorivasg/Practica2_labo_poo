/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg2.pt2;

/**
 *
 * @author Equipo 5: Max Alvarez Alvarez, Hugo Rubio Romero y Leonardo Rivas Gutierrez
 */
public class Uea {
    private String nombre;
    private String calificacion;

    /**
     * Constructor vacio
     */
    public Uea() {
    }

    
    /**
     * Constructor parametrizado con todos los atributos de la clase
     * @param nombre
     * @param calificacion 
     */
    public Uea(String nombre, String calificacion) {
        this.nombre = nombre;
        this.calificacion = calificacion;
    }

    
    /**
     * Metodo para obtener Nombre de la uea
     * @return 
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo para establecer Nombre de la uea
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    /**
     * Metodo para obtener Calificacion
     * @return 
     */
    public String getCalificacion() {
        return calificacion;
    }

    
    /**
     * Metodo para establecer Calificacion
     * @param calificacion 
     */
    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    
    /**
     * Metodo que representa el estado de los atributos de un objeto
     * @return 
     */
    @Override
    public String toString() {
        return "Nombre:" + nombre + "\t calificacion: " + calificacion;
    }
    
    
    
}
