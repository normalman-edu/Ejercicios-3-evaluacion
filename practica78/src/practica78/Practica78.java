/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica78;

import java.util.Scanner;

/**
 *
 * @author edu
 */
public class Practica78 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Declarar objetos
        Operacion op = new Operacion();
        
        //Entrada por teclado
        Scanner teclado= new Scanner (System.in);
        
        //Declarar radio
        System.out.println("Base:");
        op.setBase(teclado.nextFloat());
        
        System.out.println("Altura:");
        op.setAltura(teclado.nextFloat());
        
        //Operacion Area
        op.Area(op.getBase(), op.getAltura());
        
        //Mostrar resultado Area
        System.out.println("Area triangulo = "+op.getResult());
    }
    
}
