/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica80;

/**
 *
 * @author edu
 */
public class Operacion {
/**
 * Declarar variables
 */
float lado;
double result;
    
/**
 * 
 * @param lado es el lado del cubo 
 */
public void setLado(float lado){
this.lado=lado;}

/**
 * 
 * @param result es el resultado de las operaciones
 */
public void setResult(double result){
    this.result=result;}
    
/**
 * devolvemos el valor del lado
 * @return lado
 */
public float getLado(){
return lado;}

/**
 * devolvemos el valor del resultado de las operaciones
 * @return result
 */
public double getResult(){
return result;}
    
/**
 * Operacion Area
 * @param lado es el lado del cubo
 */
public void Area(float lado){
this.result=6*Math.pow(lado,2);}

}
