/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg83;

import java.util.Scanner;

/**
 *
 * @author edu
 */
public class Practica83 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Declarar objetos
Operacion op = new Operacion();
       
//Entrada por teclado
Scanner teclado= new Scanner (System.in);
        
//Declarar numeros equacion segundo grado
System.out.println("Dame las variables de la equacion de segundo grado:");

System.out.println("x^2: ");
op.setNumero1(teclado.nextFloat());

System.out.println("x: ");
op.setNumero2(teclado.nextFloat());
    
System.out.println("numero: ");
op.setNumero3(teclado.nextFloat());
    
//Operacion equacion segundo grado positiva
op.equa1posi(op.getNumero1(),op.getNumero2(),op.getNumero3());
  
//Mostrar resultado equacion segundo grado positiva
System.out.println("x1 = "+op.getResult());
   
//Operacion Area
op.equa1nega(op.getNumero1(),op.getNumero2(),op.getNumero3());
//Mostrar resultado Area
System.out.println("x2 = "+op.getResult());
    }
    
}
