/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica84;

import java.util.Scanner;

/**
 *
 * @author edu
 */
public class Practica84 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Declarar objetos
    Menu menu= new Menu();
    Cuenta c1 = new Cuenta("Adrian","Molina","Garrido","73401497X","1","10%"); 
    Cuenta c2 = new Cuenta("Eduardo","Vila","Soriano","20906316Y","2","15%");
    
    //Inicializar teclado
    Scanner teclado=new Scanner (System.in);
    
    //Boolean
    boolean salir=false;
    
    
    //Condicion para la cuenta
    while(salir==false){
        //Mostrar menu para entrar a la cuenta
        menu.mostrarmenu();
        menu.leerOpcion();
        
        //Para finalizar el programa
        if(menu.getOpcion()==0){
        salir=true;}
        
        else if(menu.getOpcion() !=1 && menu.getOpcion() !=2){
            System.out.println("Lo siento el numero de cuenta es incorrecto");
            System.out.println();}
        else{
            //Mostrar menu para realizar transaccion
            while(menu.getOpcion2()!='F'){
                menu.mostrarmenu2();
                menu.leerOpcion2();
   

                //Switch
                switch(menu.getOpcion2()){
                        case 'I':
                            //Ingreso
                            System.out.println("Cuando dinero deseas ingresar:");
                            if(menu.getOpcion()==1){
                                c1.saldoingreso(teclado.nextDouble());}
                            else{
                                c2.saldoingreso(teclado.nextDouble());}
                                
                            System.out.println("=============================");
                        break;
        
                        case 'R':
                            //Retirada
                            System.out.println("Cuando dinero deseas retirar:");
                            if(menu.getOpcion()==1){
                                c1.saldoreintegro(teclado.nextDouble());}
                            
                            else{
                                c2.saldoreintegro(teclado.nextDouble());}
                            
                            System.out.println("=============================");
                        break;
            
                        case 'T':
                            //Transferencia
                            System.out.println("Cuando dinero deseas transferir:");
                            if(menu.getOpcion()==1){
                                c1.saldotransferencia(teclado.nextDouble());}
                            
                            else{
                                c2.saldotransferencia(teclado.nextDouble());}
                            
                            System.out.println("=============================");
                        break;
        
                        case 'M':
                            //Mostrar saldo
                            if(menu.getOpcion()==1){
                                
                                System.out.println("Tu saldo es de "+c1.getSaldo()+"€");
                                if(c1.getSaldo()<0){
                                    System.out.println("Tu saldo esta en numeros rojos");}}
                            
                            else{
                                System.out.println("Tu saldo es de "+c2.getSaldo()+"€");
                                if(c2.getSaldo()<0){
                                    System.out.println("Tu saldo esta en numeros rojos");}}
                            //Avisar si esta en numeros negativos

            
                            System.out.println("=============================");
                        break;
                        
                        case 'D':
                            //Mostrar datos personales de la cuenta bancaria
                            if(menu.getOpcion()==1){
                                System.out.println("Nombre: "+c1.getNombre());
                                System.out.println("Apellido 1: "+c1.getApellido1());
                                System.out.println("Apellido 2: "+c1.getApellido2());
                                System.out.println("DNI: "+c1.getDNI());
                                System.out.println("Numero de cuenta: "+c1.getNumeroCuenta());
                                System.out.println("Tipo de interes: "+c1.getTipoInteres());}
                            
                            else{
                                System.out.println("Nombre: "+c2.getNombre());
                                System.out.println("Apellido 1: "+c2.getApellido1());
                                System.out.println("Apellido 2: "+c2.getApellido2());
                                System.out.println("DNI: "+c2.getDNI());
                                System.out.println("Numero de cuenta: "+c2.getNumeroCuenta());
                                System.out.println("Tipo de interes: "+c2.getTipoInteres());}
                            
                            System.out.println("=============================");
                        break;
                        
      }//Cierre del Switch
     }//Cierre del segundo bucle
    //Reiniciar opcion2 para poder volver al segundo menu
    menu.reiniciaropcion2();
   }//Cierre del else
  }//Cierre del primer bucle
 }
}