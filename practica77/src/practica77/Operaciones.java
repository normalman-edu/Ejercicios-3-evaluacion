/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica77;
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
     * @param radio es el radio de la circunferencia
     */
    public void setRadio(float radio){
    this.radio=radio;}
    
    /**
     * 
     * @param result es el resultado de las operaciones
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
     * devolvemos el resultado
     * @return result
     */
    public double getResult(){
    return result;}
    
    /**
     * Operacion para sacar la longitud de la circunferencia
     * @param radio es el radio de la circunferencia
     */
    public void longitud(float radio){
    this.result=2*Math.PI*radio;}
    
    /**
     * Operacion para sacar el area de la circunferencia
     * @param radio es el radio de la circunferencia
     */
    public void area(float radio){
    this.result=Math.PI*Math.pow(radio, 2);}
}
