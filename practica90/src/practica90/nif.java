/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica90;

/**
 *
 * @author edu
 */
public class nif {
    /**
     * Declarar variable
     */
    private int dni, result;
    private String[] letra = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
/**
 * 
 * @param dni dni
 */
public void setdni(int dni){
    this.dni=dni;}
/**
 * 
 * @param result resultado
 */
public void setresult(int result){
    this.result=result;}

/**
 * devolvemos el dni
 * @return dni
 */
public int getdni(){
    return dni;}

/**
 * devolvemos el resultado de la operacion
 * @return resultado
 */
public int getresult(){
    return result;}

/**
 * devolvemos la letra del dni
 * @return letra
 */
public String[] getletra(){
    return letra;}

/**
 * Operacion para encontrar la letra del dni
 * @param dni dni
 * @param result resultado
 */
public void operacionletradni(int dni, int result){
    this.result=dni%23;}
}