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
public class Alumno {
    private String nombre;
    private String matricula;

    /**
     * Constructor vacio
     */
    public Alumno() {
    }

    
    /**
     * Construtor parametrizado con todos los atributos de la clase
     * @param nombre
     * @param matricula 
     */
    public Alumno(String nombre, String matricula) {
        this.nombre = nombre;
        this.matricula = matricula;
    }

    
    /**
     * Metodo para obtener Nombre del alumno
     * @return 
     */
    public String getNombre() {
        return nombre;
    }

    
    /**
     * Metodo para establecer Nombre
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    /**
     * Metodo para obtener Matricula
     * @return 
     */
    public String getMatricula() {
        return matricula;
    }
    
    
    /**
     * Metodo para establecer Matricula
     * @param matricula 
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    
    
}
