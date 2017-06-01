/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica79;

/**
 *
 * @author edu
 */
public class Operacion {
    /**
     * Declarar variables
     */
    float lado, apotema;
    double result;
    
    /**
     * 
     * @param lado es el lado del pentagono
     */
    public void setLado(float lado){
    this.lado=lado;}
    
    /**
     * 
     * @param apotema es la apotema del pentagono
     */
    public void setApotema(float apotema){
    this.apotema=apotema*5;}
    
    /**
     * 
     * @param result devolvemos el resultado de las operaciones
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
     * devolvemos el valor de la apotema
     * @return apotema
     */
    public float getApotema(){
    return apotema;}
    
    /**
     * devolvemos el resultado de las operaciones
     * @return result
     */
    public double getResult(){
    return result;}
    
    /**
     * 
     * @param lado es el lado del pentagono
     * @param apotema es la apotema del pentagono
     */
    public void Area(float lado, float apotema){
    this.result=(lado*apotema)/2;}
}    

