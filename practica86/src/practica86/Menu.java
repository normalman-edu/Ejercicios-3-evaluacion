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
public class Menu {
/**
 * declarar variables
 * inicializar teclado
 */
private char opciones;   
static Scanner teclado= new Scanner(System.in);

public Menu(){
    opciones='.';}

/**
 * Opciones del menu
 */
public void mostrarmenu(){
    //Opciones Menu
    System.out.println("Que operacion desea realizar: ");
    System.out.println("I - Incrementar");
    System.out.println("D - Decrementar");
    System.out.println("F - Finalizar programa");}

/**
 * leemos la opcion dada por el usuario
 */
public void leerOpcion(){
    this.opciones=teclado.next().charAt(0);
    System.out.println();}

/**
 * Devolvemos la opcion elegida por el usuario
 * @return opciones 
 */
public char getOpcion(){
    return opciones;}
}
