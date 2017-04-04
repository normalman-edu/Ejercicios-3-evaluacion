/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica77;

import java.util.Scanner;

/**
 *
 * @author edu
 */
public class Practica77 {

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
        op.setRadio(teclado.nextInt());
        
        //Operacion Longitud
        op.longitud(op.getRadio());
        //Mostrar resultado Longitud
        System.out.println("Longitud circunferencia = "+op.getResult());
        //Operacion Area
        op.area(op.getRadio());
        //Mostrar resultado Area
        System.out.println("Area circunferencia = "+op.getResult());
    }
    
}
