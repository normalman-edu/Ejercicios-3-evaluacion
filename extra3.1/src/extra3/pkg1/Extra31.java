/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra3.pkg1;

import java.util.Scanner;

/**
 *
 * @author edu
 */
public class Extra31 {

/**
* @param args the command line arguments
*/
public static void main(String[] args) {
//Declarar objetos
Menu medi= new Menu();
Operaciones op = new Operaciones();
        
//Entrada por teclado
Scanner teclado= new Scanner (System.in);
        
//Declarar radio
System.out.println("Pies:");
op.setPies(teclado.nextInt());
        
//Mostrar menu
medi.mostrarmenu();
medi.leerOpcion();
        
//if para opcion de la operacion
if(medi.getOpcion() != 'Y' && medi.getOpcion() !=  'P' && medi.getOpcion() != 'C')
System.out.println("Opcion erronea");
    
else{
  
//Switch
switch(medi.getOpcion()){
    case 'Y':
    op.yardas(op.getPies());
    System.out.println("Yardas= "+op.getResult());
    break;
    
    case 'P':
    op.pulgadas(op.getPies());
    System.out.println("Pulgadas= "+op.getResult());
    break;
    
    case 'C':
    op.centimetros(op.getPies());
    System.out.println("Centimetros= "+op.getResult());
    break;}
        }
    }
}