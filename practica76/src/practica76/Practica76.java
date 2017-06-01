/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica76;

import java.util.Scanner;

/**
 *
 * @author edu
 */
public class Practica76 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declarar objetos
        Menu calc= new Menu();
        Operaciones op = new Operaciones();
        
        
        //Entrada por teclado
        Scanner teclado= new Scanner (System.in); 
        
        
        //Mostrar menu
        calc.mostrarmenu();
        calc.leerOpcion();
        
        
         //if para opcion de la operacion
        if(calc.getOpcion() != '+' && calc.getOpcion() !=  '-' && calc.getOpcion() !=  '*' && calc.getOpcion() !=  '/')
            System.out.println("Opcion erronea");
        
        else{
        
        
        //Declarar operadores 
        System.out.println("Operador 1:");
        op.setOperador1(teclado.nextInt());
        
        System.out.println("Operador 2:");
        op.setOperador2(teclado.nextInt());}
        
        //Switch
        switch(calc.getOpcion()){
            case '+':
            //Operacion suma
            op.suma(op.getOperador1(),op.getOperador2());
            System.out.println(op.getOperador1()+" + "+op.getOperador2()+" = "+op.getResult());
            break;
            
            case '-':
            //Operacion resta
            op.resta(op.getOperador1(), op.getOperador2());
            System.out.println(op.getOperador1()+" - "+op.getOperador2()+" = "+op.getResult());
            break;
            
            case '*':
            //Operacion multiplicacion
            op.multi(op.getOperador1(), op.getOperador2());
            System.out.println(op.getOperador1()+" * "+op.getOperador2()+" = "+op.getResult());
            break;
            
            case '/':
            //Operacion division
            op.divi(op.getOperador1(), op.getOperador2());
            System.out.println(op.getOperador1()+" / "+op.getOperador2()+" = "+op.getResult());
            break;
        
            default:
            break;}
    }
    
}
