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
public class Menu {
/**
 * declarar variables
 * inicializar teclado
 */
    private int opciones;    
    
    static Scanner teclado= new Scanner(System.in);

/**
 * Opciones del menu
 */
public void mostrarmenu(){
    //Opciones Menu
    System.out.println("Que operacion desea realizar: ");
    System.out.println("1 - Fecha actual");
    System.out.println("2 - Comprobar Fecha");
    System.out.println("3 - Finalizar programa");}

/**
 * leemos la opcion dada por el usuario
 */
public void leerOpcion(){
    this.opciones=teclado.nextInt();
    System.out.println();}

/**
 * Devolvemos la opcion elegida por el usuario
 * @return opciones 
 */
public int getOpcion(){
    return opciones;}
}
