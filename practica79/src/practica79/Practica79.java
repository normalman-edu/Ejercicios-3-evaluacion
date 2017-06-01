/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica79;

import java.util.Scanner;

/**
 *
 * @author edu
 */
public class Practica79 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Declarar objetos
    Operacion op = new Operacion();
        
    //Entrada por teclado
    Scanner teclado= new Scanner (System.in);
        
    //Declarar radio
    System.out.println("Lado:");
    op.setLado(teclado.nextFloat());
       
    System.out.println("Apotema:");
    op.setApotema(teclado.nextFloat());
        
    //Operacion Area
    op.Area(op.getLado(), op.getApotema());
        
    //Mostrar resultado Area
    System.out.println("Area pentagono = "+op.getResult());
    }
    
}
