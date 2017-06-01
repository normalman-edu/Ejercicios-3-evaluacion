/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica81;

/**
 *
 * @author edu
 */
public class Operaciones {
/**
 * Declarar variables
 */
private float radio;
private double result;
    
/**
 * 
 * @param radio es el radio de la esfera
 */
public void setRadio(float radio){
 this.radio=radio;}

/**
 * 
 * @param result es el resultado de la operacion
 */
public void setResult(double result){
 this.result=result;}
    
/**
 * devolvemos el valor del radio
 * @return radio
 */
public float getRadio(){
 return radio;}
    
/**
 * devolvemos el resultado de la operacion
 * @return result
 */
public double getResult(){
 return result;}
    
/**
 * Operacion Area
 * @param radio es el radio de la esfera
 */
public void Area(float radio){
 this.result=4*Math.PI*Math.pow(radio,2);}
    
/**
 * Operacion Volumen
 * @param radio es el radio de la esfera
 */
public void Volumen(float radio){
 this.result=(4*Math.PI*Math.pow(radio,3))/3;}
}
