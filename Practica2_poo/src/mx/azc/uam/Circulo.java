/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.azc.uam;

/**
 *
 * @author Alumno21
 */
public class Circulo {
    private double radio;

    public Circulo() {
        /**
         * Contructor parametrizado de la clase circulo
         * @param radio
         */
    }

    
    
    /**
     * Constructor
     * @param radio 
     */
    public Circulo(double radio) {
        this.radio = radio;
    }

    
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }
    

    public double calcularArea(){
    return Math.PI*radio*radio;
    }
    
    public double calcularCircunferencia(){
    return Math.PI*2*radio;
    }
    
}
