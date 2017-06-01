/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica87;

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
private char opciones2;

static Scanner teclado= new Scanner(System.in);

public Menu(){
    opciones2='.';}

/**
 * Opciones del menu
 */
public void mostrarmenu(){
    //Opciones Menu
    System.out.println("En que libro estas interesado/a: ");
    System.out.println("1 - Herido Diario");
    System.out.println("2 - Eraide");
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

/**
 * Opciones del menu2
 */
public void mostrarmenu2(){
    //Opciones Menu
    System.out.println("Que operacion desea realizar: ");
    System.out.println("P - Prestar libro");
    System.out.println("D - Devolver libro");
    System.out.println("M - Mostrar mas información sobre el libro");
    System.out.println("F - Finalizar programa");}

/**
 * leemos la opcion dada por el usuario
 */
public void leerOpcion2(){
    this.opciones2=teclado.next().charAt(0);
    System.out.println();}

/**
 * Devolvemos la opcion elegida por el usuario
 * @return opciones 
 */
public char getOpcion2(){
    return opciones2;}

/**
 * Reiniciamos la opcion para poder volver a utlizar la variable opciones2
 */
public void reiniciaropcion2(){
    opciones2='.';}
}
