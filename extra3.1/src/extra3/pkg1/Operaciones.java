/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra3.pkg1;

/**
 *
 * @author edu
 */
public class Operaciones {
/**
 * Declarar variables
 */
private double pies;
private double result;

/**
 * 
 * @param pies es una unidad de medida
 */
public void setPies(double pies){
this.pies=pies;}
    
/**
 * 
 * @param result es el resultado de las operaciones
 */
public void setResult(double result){
this.result=result;}
    
/**
 * Devolvemos el valor de los pies
 * @return pies
 */
public double getPies(){
return pies;}

/**
 * Devolvemos el resultado de las operaciones
 * @return result 
 */
public double getResult(){
return result;}

/**
 * Operacion yardas
 * @param pies es una unidad de medida
 */
public void yardas(double pies){
this.result=pies/0.33;}

/**
 * Operacion pulgadas
 * @param pies es una unidad de medida
 */
public void pulgadas(double pies){
this.result=pies/12;}

/**
 * Operacion centimetros
 * @param pies es una unidad de medida
 */
public void centimetros(double pies){
this.result=pies*30.48;}
}
