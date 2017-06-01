/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica89;

import java.util.Scanner;
/**
 *
 * @author edu
 */
public class Practica89 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Declarar objetos
    Menu menu= new Menu();
    Fecha f1= new Fecha();
    
    //Inicializar teclado
    Scanner teclado=new Scanner (System.in);
    
                //Mostrar menu para realizar transaccion
            while(menu.getOpcion()!=3){
                menu.mostrarmenu();
                menu.leerOpcion();
                //Mostrar mensaje en caso de que la opcion sea incorrecta
                if(menu.getOpcion() !=1 && menu.getOpcion() !=2 && menu.getOpcion() !=3 ){
                    System.out.println("Esta opcion es incorrecto.");
                    System.out.println();}
                    
                else{
                    
                    //Switch
                    switch(menu.getOpcion()){
                        case 1:
                            f1.FechaActual(f1.getDia(),f1.getMes(), f1.getAño());
                            System.out.println("La fecha actual es:");
                            System.out.println(f1.getDia()+" del "+f1.getMes()+" del "+f1.getAño());
                            System.out.println("=============================");
                        break;
                        
                        case 2:
                            System.out.println("Día:");
                            f1.setDia(teclado.nextInt());
                            
                            System.out.println("Mes:");
                            f1.setMes(teclado.nextInt());
                            
                            System.out.println("Año:");
                            f1.setAño(teclado.nextInt());

                            if(f1.FechaValida(f1.getDia(), f1.getMes(), f1.getAño())==true){
                                System.out.println("Tu fecha introducida es CORRECTA");}
                            else{
                                System.out.println("Tu fecha introducida es INCORRECTA");}
                            System.out.println("=============================");
                        break;
                }//Cierre del switch
    
}
            }//Cierre del bucle
    }
}