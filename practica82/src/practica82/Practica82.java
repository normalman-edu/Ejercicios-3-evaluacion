/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica82;

import java.util.Scanner;

/**
 *
 * @author edu
 */
public class Practica82 {

/**
* @param args the command line arguments
*/
public static void main(String[] args) {
//Declarar objetos
Operaciones op = new Operaciones();
        
//Entrada por teclado
Scanner teclado= new Scanner (System.in);
        
//Declarar monedas
System.out.println("Dame la cantidad de dinero:");
op.setDinero(teclado.nextInt());
    
op.bucledesglose(op.getDinero(), op.getMonedas(), op.getDevolver());
    
//bucle para mostrar el resultado
for(int i=0;i<op.getMonedas().length;i++)
    {
        if (op.getDevolver()[i]>0)
        {
            if (op.getMonedas()[i]>2)
            {
                // Indicamos que es un billete
                System.out.println("Hay "+op.getDevolver()[i]+" billete/s de: "+op.getMonedas()[i]+" Euros");
            }else{
                // Indicamos que es una moneda
                System.out.println("Hay "+op.getDevolver()[i]+" moneda/s de: "+op.getMonedas()[i]+" Euros");
            }
       }
      }  
     }
}
