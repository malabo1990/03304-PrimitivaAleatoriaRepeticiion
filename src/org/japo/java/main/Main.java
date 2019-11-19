/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.main;

import java.util.Random;

/**
 *
 * @author Casimiro Ondo Obiang casimiro.ondo.alum@iescamp.es
 */
public class Main {
    public static final Random RDM= new Random();
    public static void main(String[] args) {
        //ejercicio 03304-PrimitvaAlteatoriaRepeticion
        //Constante
        final int INICIO= 1;
        final int FINAL= 6;
       
        //variable
       //bucle
       for(int i=INICIO; i<FINAL; i++){
           int numero = RDM.nextInt(FINAL-INICIO+1)+INICIO;
           System.out.printf("Numero %d....: %2d%n", i, numero);
       }
    }
}
