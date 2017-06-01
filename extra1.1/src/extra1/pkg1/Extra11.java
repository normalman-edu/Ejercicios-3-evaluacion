/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra1.pkg1;

import java.util.Scanner;

/**
 *
 * @author edu
 */
public class Extra11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Declarar objetos
    Menu pita= new Menu();
    Operaciones op = new Operaciones();
        
    //Entrada por teclado
    Scanner teclado= new Scanner (System.in); 
        
    //Mostrar menu
    pita.mostrarmenu();
    pita.leerOpcion();
        
    //if para opcion de la operacion
    if(pita.getOpcion() != 'a' && pita.getOpcion() !=  'b')
    System.out.println("Opcion erronea");
    
    else{
  
  //Switch
    switch(pita.getOpcion()){
        case 'a':
        //Declarar operadores
        System.out.println("Cateto b:");
        op.setOperador1(teclado.nextInt());
        
        System.out.println("Cateto c:");
        op.setOperador2(teclado.nextInt());
        System.out.println();
        //Operacion        
        op.hipotenusa(op.getOperador1(),op.getOperador2());
        System.out.println("Hipotenusa = "+op.getResult());
        break;
            
        case 'b':
         //Declarar operadores
        System.out.println("Hipotenusa:");
        op.setOperador1(teclado.nextInt());
        
        System.out.println("Cateto:");
        op.setOperador2(teclado.nextInt()); 
        System.out.println();
        
        if(op.getOperador1()<op.getOperador2()){
            System.out.println("Deberias saber que la hipotenusa debe ser mayor que los lados del triagulo rectangulo");
        }
        else{
        //Operaciones
        op.cateto(op.getOperador1(), op.getOperador2());
        System.out.println("El otro cateto mide = "+op.getResult());
        }
        break;}
    }
    
    }

}
