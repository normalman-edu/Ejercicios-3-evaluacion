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
public class Menu {
/**
 * Declarar variables
 * Iniciar teclado
 */
private char opciones;
static Scanner read= new Scanner(System.in);

public Menu(){
opciones='.';}

/**
 * Opciones del menu
 */
public void mostrarmenu(){
/*Pedir al usuario*/
 System.out.println("A que unidades desea pasar: ");
 System.out.println("Y - Yardas");
 System.out.println("P - Pulgadas");
 System.out.println("C - Centimetros");
}

/**
 * leemos la opcion dada por el usuario
 */
public void leerOpcion(){
this.opciones=read.next().charAt(0);
System.out.println();}

/**
 * Devolvemos la opcion elegida por el usuario
 * @return opciones 
 */
public char getOpcion(){
return opciones;}
}