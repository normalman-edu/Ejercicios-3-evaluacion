/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica78;

/**
 *
 * @author edu
 */
public class Operacion {
    /**
     * Declarar variables
     */
    float altura, base;
    double result;
    
    /**
     * 
     * @param altura es la altura del triangulo
     */
    public void setAltura(float altura){
    this.altura=altura;}
    
    /**
     * 
     * @param base es la base del triangulo
     */
    public void setBase(float base){
    this.base=base;}
    
    /**
     * 
     * @param result es el resultado de la operacion
     */
    public void setResult(double result){
    this.result=result;}
    
    /**
     * devolvemos el valor de la base
     * @return base 
     */
    public float getBase(){
    return base;}
    
    /**
     * devolvemos el valor de la altura
     * @return altura
     */
    public float getAltura(){
    return altura;}
    
    /**
     * devolvemos el resultado de las operaciones
     * @return result
     */
    public double getResult(){
    return result;}
    
    /**
     * 
     * @param base es la base del triangulo
     * @param altura es la altura del triangulo
     */
    public void Area(float base, float altura){
    this.result=(base*altura)/2;}
}
