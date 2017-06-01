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
public class Menu {
/**
 * declarar variables
 * inicializar teclado
 */
private int opciones;    
private char opciones2;
static Scanner read= new Scanner(System.in);

public Menu(){
    opciones2='.';}

/**
 * Opciones del menu
 */
public void mostrarmenu(){
    //Opciones Menu
    System.out.println("En que cuenta desea entrar: ");
    System.out.println("Si desea salir teclee el numero 0");}

/**
 * leemos la opcion dada por el usuario
 */
public void leerOpcion(){
    this.opciones=read.nextInt();
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
    //Opciones Menu2
    System.out.println("Que operacion desea realizar: ");
    System.out.println("I - Ingresar");
    System.out.println("R - Reintegro");
    System.out.println("T - Transferencia");
    System.out.println("M - Mostrar saldo");
    System.out.println("D - Datos personales");
    System.out.println("F - Finalizar transacciones");}

/**
 * leemos la opcion dada por el usuario
 */
public void leerOpcion2(){
    this.opciones2=read.next().charAt(0);
    System.out.println();}

/**
 * Devolvemos la opcion elegida por el usuario
 * @return opciones2 
 */
public char getOpcion2(){
    return opciones2;}

/**
 * Reiniciamos la opcion para poder volver a utlizar la variable opciones2
 */
public void reiniciaropcion2(){
    opciones2='.';}
}