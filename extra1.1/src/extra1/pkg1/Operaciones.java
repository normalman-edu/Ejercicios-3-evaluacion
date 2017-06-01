/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra1.pkg1;

/**
 *
 * @author edu
 */
public class Operaciones {
/**
 * Declarar variables
 */
private double operador1;
private double operador2;
private double result;
    
/**
 * 
 * @param operador1 es la hipotenusa del teorema de pitagoras o el cateto dependiendo de la opcion del menu
 */
public void setOperador1(double operador1){
this.operador1=operador1;}

/**
 * 
 * @param operador2 es el cateto del teorema de pitagoras
 */
public void setOperador2(double operador2){
this.operador2=operador2;}
   
/**
 * 
 * @param result es el resultado de las operaciones
 */
public void setResult(double result){
this.result=result;}
    
/**
 * devolvemos el valor del cateto o la hipotenusa
 * @return operador1
 */
public double getOperador1(){
return operador1;}
    
/**
 * devolvemos el valor del cateto
 * @return operador2
 */
public double getOperador2(){
return operador2;}
    
/**
 * devolvemos el valor del resultado de las operaciones
 * @return result
 */
public double getResult(){
return result;}
    
/**
 * Operacion de pitagoras para la hipotenusa
 * @param operador1 es la hipotenusa del teorema de pitagoras
 * @param operador2 es la cateto del teorema de pitagoras
 */
public void hipotenusa(double operador1, double operador2){
this.result=Math.sqrt(Math.pow(operador1, 2)+Math.pow(operador2, 2));}

/**
 * Operacion de pitagoras para el cateto
 * @param operador1 es la cateto del teorema de pitagoras
 * @param operador2 es la cateto del teorema de pitagoras
 */
public void cateto(double operador1, double operador2){
this.result=Math.sqrt(Math.pow(operador1, 2)-Math.pow(operador2, 2));}
}
