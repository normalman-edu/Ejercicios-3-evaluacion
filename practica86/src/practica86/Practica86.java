/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica86;

import java.util.Scanner;

/**
 *
 * @author edu
 */
public class Practica86 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Declarar objetos
    Menu menu= new Menu();
    Contador c1= new Contador();
    
    //Inicializar teclado
    Scanner teclado=new Scanner (System.in);
    
                //Mostrar menu para realizar transaccion
            while(menu.getOpcion()!='F'){
                menu.mostrarmenu();
                menu.leerOpcion();
                //Mostrar mensaje en caso de que la opcion sea incorrecta
                if(menu.getOpcion() !='I' && menu.getOpcion() !='D' && menu.getOpcion() !='F' ){
                    System.out.println("Esta opcion es incorrecto.");
                    System.out.println();}
                    
                else{
                    
                    //Switch
                    switch(menu.getOpcion()){
                        case 'I':
                            //Numero maximo hasta el que se deseas incrementar
                            System.out.println("Hasta que numero deseas llegar? ");
                            c1.Incrementar(teclado.nextInt());
                            //Incrementar
                            System.out.println(c1.getContador());
                            System.out.println();
                            System.out.println("=============================");
                        break;
        
                        case 'D':
                            //Retirada
                            System.out.println("Desde que numero quieres empezar? ");
                            c1.Decrementar(teclado.nextInt());
                            //Decrementar
                            System.out.println(c1.getContador());
                            System.out.println();
                            System.out.println("=============================");
                        break;
                
                }//Cierre switch
            
            
            }//Cierre else
    }//Cierre bucle
    }
}
