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
public class Principal {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Generar array list
         * Crear Objetos = ieas
         * Agregar objetos al ArrayList
         */
        ArrayList<Uea> ueas = new ArrayList<>();
        Uea uea1 = new Uea("POO","B");
        Uea uea2 = new Uea("LPOO","Na");
        Uea uea3 = new Uea("Programacion estructurada","MB");
        Uea uea4 = new Uea("Complementos de matematicas","S");
        Uea uea5 = new Uea("Metodos numericos","MB");
        ueas.add(uea1);
        ueas.add(uea2);
        ueas.add(uea3);
        ueas.add(uea4);
        ueas.add(uea5);
        
        
        /**
         * Crear Kardex = datos del alumno y sus ueas
         * imprimir promedio, ueas aprobadas y ueas reprobadas
         */
        Kardex kardex1= new Kardex("23-P","Uriel Ramirez","221204798",ueas);
        
        System.out.println(kardex1.toString());
        System.out.println("Promedio: " + kardex1.cacularPromedio());
        System.out.println("Aprobadas: " + kardex1.ueasAprobadas());
        System.out.println("Reprobadas: "+ kardex1.ueasReprobadas());
    }
    
}
