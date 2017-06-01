/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica86;

/**
 *
 * @author edu
 */
public class Contador {
/**
 * Declarar variables
 */
private int contador;
    
/**
 * Constructor por defecto
 */
public Contador(){
    contador=1;}

/**
 * Constructor con parametros
 * @param contador es la variable que nos da el usuario
 */
public Contador(int contador){
    this.contador=contador;}

/**
 * Constructor copia
 * @param c copia de los parametros
 */
public Contador(final Contador c){
    contador=c.contador;}

/**
 * 
 * @param contador es la variable que nos da el usuario
 */
public void setContador(int contador){
    this.contador=contador;}

/**
 * devolvemos el valor del contador
 * @return contador
 */
public int getContador(){
    return contador;}

/**
 * Operacion para incrementar
 * @param limite es el limitador
 */
public void Incrementar(int limite){
    for(contador=1;contador<limite;contador++){
        System.out.println(contador);}}
        
/**
 * Operacion para decrementar
 * @param limite es el limitador
 */
public void Decrementar(int limite){
    for(contador=limite;contador>0;contador--){
        System.out.println(contador);}}
}

