/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.app;

/**
 *
 * @author Alejandro Alberca Gallardo <alejandro.alberca.alum@iescamp.es>
 */
public class App {

    public final static int NUM = 3;
    public final static int MIN = 0;
    public final static int MAX = 10;

    public final void launchApp() {
        
       
        System.out.println("ANÁLISIS DE RANGO");
        System.out.println("=================");
        System.out.println("Número ......: "+NUM);
        System.out.println("---");
        System.out.println("Mínimo ......: "+MIN);
        System.out.println("Máximo ......: "+MAX);
        System.out.println("---");        
        double n = analizarRango(NUM, MIN, MAX);

    }

    public static final int analizarRango(double num, double min, double max) {
        if (num <= min) {
            System.out.println("Análisis ....: FUERA ( Abajo )");
        } else if (num >= max) {
            System.out.println("Análisis ....: FUERA ( Arriba )");
        } else {
            System.out.println("Análisis ....: DENTRO");
        }
        return (int) num;
    }
}
