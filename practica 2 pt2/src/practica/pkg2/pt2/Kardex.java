/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg2.pt2;

import java.util.ArrayList;

/**
 *
 * @author Alvarez Alvarez Maximiliano
 */


public class Kardex {
    private String trimestre;
    private Alumno alumno1;
    private ArrayList<Uea> ueas;

    public Kardex() {
    }


    public Kardex(String trimestre, String nombre, String matricula, ArrayList<Uea> ueas) {
        alumno1 = new Alumno(nombre, matricula);
        this.trimestre = trimestre;
        this.ueas = ueas;
    }
    
    public void agregarUea(Uea uea1){
        ueas.add(uea1);
    }

    public String getTrimestre() {
        return trimestre;
    }

    public void setTrimestre(String trimestre) {
        this.trimestre = trimestre;
    }

    public Alumno getAlumno1() {
        return alumno1;
    }

    public void setAlumno1(Alumno alumno1) {
        this.alumno1 = alumno1;
    }

    public ArrayList<Uea> getUeas() {
        return ueas;
    }

    public void setUeas(ArrayList<Uea> ueas) {
        this.ueas = ueas;
    }


    
    
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
    
    int ueasAprobadas(){
        int aprobadas=0;
        for (Uea uea1 : ueas){
            if(uea1.getCalificacion()!="Na"){
                aprobadas++;
            }
        }
        return aprobadas;
    }
    
    int ueasReprobadas(){
        int reprobadas=0;
        for (Uea uea1 : ueas){
            if(uea1.getCalificacion()=="Na"){
                reprobadas++;
            }
        }
        return reprobadas;
    }

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
