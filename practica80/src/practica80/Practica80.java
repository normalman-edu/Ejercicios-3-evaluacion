/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica80;

import java.util.Scanner;

/**
 *
 * @author edu
 */
public class Practica80 {

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
    
    //Operacion Area
    op.Area(op.getLado());
        
    //Mostrar resultado Area
    System.out.println("Area cubo = "+op.getResult());
    }
    
}
