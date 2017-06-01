/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica87;

/**
 *
 * @author edu
 */
public class Libro {
/**
 * Declarar variable
 */
 private String titulo, autor;
 private int ejemplares, prestamo, devolucion;
 
/**
 * Constructor por parametros
 * @param titulo titulo
 * @param autor autor
 * @param ejemplares ejemplares
 */
 public Libro(String titulo, String autor, int ejemplares){
    this.titulo=titulo;
    this.autor=autor;
    this.ejemplares=ejemplares;}
 
/**
 * devolvemos el titulo del libro
 * @return titulo 
 */
public String getTitulo(){
    return titulo;}

/**
 * devolvemos el autor del libro
 * @return autor
 */
public String getAutor(){
    return autor;}

/**
 * devolvemos el numero de ejemplares del libro
 * @return ejemplares
 */
public int getEjemplares(){
    return ejemplares;}

/**
 * Operacion prestamo
 */
    public void prestamo(){
        this.ejemplares=ejemplares-1;}
    
/**
 * Operacion devolucion
 */
    public void devolucion(){
        this.ejemplares=ejemplares+1;}
}