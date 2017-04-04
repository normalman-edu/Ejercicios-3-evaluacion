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
    float lado, apotema;
    double result;
    
    //setters
    public void setLado(float lado){
    this.lado=lado;}
    
    public void setApotema(float apotema){
    this.apotema=apotema*5;}
    
    public void setResult(double result){
    this.result=result;}
    
    //getters
    public float getLado(){
    return lado;}
    
    public float getApotema(){
    return apotema;}
    
    public double getResult(){
    return result;}
    
    //Operacion
    public void Area(float lado, float apotema){
    this.result=(lado*apotema)/2;}
}    

