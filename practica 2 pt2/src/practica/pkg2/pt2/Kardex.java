/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg2.pt2;

import java.util.ArrayList;

/**
 *
 * @author Equipo 5: Max Alvarez Alvarez, Hugo Rubio Romero y Leonardo Rivas Gutierrez
 */


public class Kardex {
    private String trimestre;
    private Alumno alumno1;
    private ArrayList<Uea> ueas;

    
    /**
     * Constructor vacio
     */
    public Kardex() {
    }


    
    /**
     * Constructor parametrizado con todos los atributos de la clase
     * @param trimestre
     * @param nombre
     * @param matricula
     * @param ueas 
     */
    public Kardex(String trimestre, String nombre, String matricula, ArrayList<Uea> ueas) {
        alumno1 = new Alumno(nombre, matricula);
        this.trimestre = trimestre;
        this.ueas = ueas;
    }
    
    
    
    
    /**
     * Metodo para agregar uea al kardex
     * @param uea1 
     */
    public void agregarUea(Uea uea1){
        ueas.add(uea1);
    }

    
    /**
     * Metodo para obtener Trimestre
     * @return 
     */
    public String getTrimestre() {
        return trimestre;
    }

    
    /**
     * Metodo para establecer Trimestre
     * @param trimestre 
     */
    public void setTrimestre(String trimestre) {
        this.trimestre = trimestre;
    }

    
    
    /**
     * Metodo para obtener Alumno
     * @return 
     */
    public Alumno getAlumno1() {
        return alumno1;
    }

    
    /**
     * Metodo para establecer Alumno
     * @param alumno1 
     */
    public void setAlumno1(Alumno alumno1) {
        this.alumno1 = alumno1;
    }

    
    /**
     * Metodo para obtener ueas del ArrayList
     * @return 
     */
    public ArrayList<Uea> getUeas() {
        return ueas;
    }

    
    /**
     * Metodo para establecer ueas del ArrayList
     * @param ueas 
     */
    public void setUeas(ArrayList<Uea> ueas) {
        this.ueas = ueas;
    }


    
    /**
     * calcular promedio de la uea
     * @return Promedio de la uea: S, B, MB
     */
    String cacularPromedio(){
        int contador=0;
        int divisor=ueas.size();
        for (Uea uea1 : ueas) {
            if(uea1.getCalificacion().equals("MB")){
                contador= contador+3;
            }
            else if(uea1.getCalificacion().equals("B")){
                contador= contador+2;
            }
            else if(uea1.getCalificacion().equals("S")){
                contador=contador+1;
            }
            else
                divisor=divisor-1;
        }
        int promedio=0;
        promedio=contador/divisor;
        if(promedio==3){
            return "MB";
        }else if(promedio==2){
            return "B";
        }
        else if(promedio==1){
            return "S";
        }
        else
        return "Promedio no disponible";
    }
    
    
    
    
    /**
     * Metodo para agregar contado a ueas aprobadas si la calificacion es
     * diferente de Na
     * @return numero de ueas aprobadas
     */
    int ueasAprobadas(){
        int aprobadas=0;
        for (Uea uea1 : ueas){
            if(uea1.getCalificacion()!="Na"){
                aprobadas++;
            }
        }
        return aprobadas;
    }
    
    
    
    /**
     * Metodo para agregar contado a ueas aprobadas si la calificacion es
     * equivalente a Na
     * @return numero de ueas reprobadas
     */
    int ueasReprobadas(){
        int reprobadas=0;
        for (Uea uea1 : ueas){
            if(uea1.getCalificacion()=="Na"){
                reprobadas++;
            }
        }
        return reprobadas;
    }

    
    
    /**
     * Metodo que representa el estado de los atributos de un objeto
     * @return 
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Kardex\n")
          .append("Trimestre: ").append(trimestre).append("\n")
          .append("Alumno: ").append(alumno1.getNombre()).append("\n")
          .append("Matrícula: ").append(alumno1.getMatricula()).append("\n")
          .append("\nUEAs:\n");
        for (Uea uea : ueas) {
            sb.append(uea.toString()).append("\n");
        }
        
        return sb.toString();
    }
 
    
}
