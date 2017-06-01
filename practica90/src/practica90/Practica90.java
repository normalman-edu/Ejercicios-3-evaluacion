/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica90;

import java.util.Scanner;

/**
 *
 * @author edu
 */
public class Practica90 {

/**
* @param args the command line arguments
*/
public static void main(String[] args) {
//Declarar objetos
nif p1 = new nif();
        
//Entrada por teclado
Scanner teclado= new Scanner (System.in);
        
//Declarar monedas
System.out.println("Dame tu dni(Solo los 8 digitos):");
p1.setdni(teclado.nextInt());
    
p1.operacionletradni(p1.getdni(), p1.getresult());

if(p1.getdni()>=100000000){
    System.out.println("Tu DNI no es correcto");}   

else{
    
//bucle para mostrar el resultado
for(int i=0;i<p1.getletra().length;i++){
    if(p1.getresult()==i){
    System.out.println("La letra de tu dni es "+p1.getletra()[i]);}

        }
    }
}   
}
