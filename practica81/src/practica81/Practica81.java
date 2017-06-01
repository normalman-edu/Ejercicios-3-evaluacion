/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica81;

import java.util.Scanner;

/**
 *
 * @author edu
 */
public class Practica81 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Declarar objetos
    Operaciones op = new Operaciones();
        
    //Entrada por teclado
    Scanner teclado= new Scanner (System.in);
        
    //Declarar radio
    System.out.println("Radio:");
    op.setRadio(teclado.nextFloat());
        
    //Operacion Longitud
    op.Area(op.getRadio());
    //Mostrar resultado Longitud
    System.out.println("Area esfera = "+op.getResult());
    
    //Operacion Area
    op.Volumen(op.getRadio());
    //Mostrar resultado Area
    System.out.println("Volumen esferaa = "+op.getResult());
    }
    
}
