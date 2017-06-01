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
public class Menu {    
/**
 * Declarar variables
 * Inicializar teclado
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
 System.out.println("Que deseas calcular: ");
 System.out.println("a. Hipotenusa");
 System.out.println("b. Cateto");
}

/**
 * leemos la opcion dada por el usuario
 */
public void leerOpcion(){
    this.opciones=read.next().charAt(0);
    System.out.println();
}
/**
 * Devolvemos la opcion elegida por el usuario
 * @return opciones 
 */
public char getOpcion(){
return opciones;}
}