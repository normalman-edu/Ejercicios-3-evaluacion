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
    float altura, base;
    double result;
    
    //setters
    public void setAltura(float altura){
    this.altura=altura;}
    
    public void setBase(float base){
    this.base=base;}
    
    public void setResult(double result){
    this.result=result;}
    
    //getters
    public float getBase(){
    return base;}
    
    public float getAltura(){
    return altura;}
    
    public double getResult(){
    return result;}
    
    //Operacion
    public void Area(float base, float altura){
    this.result=(base*altura)/2;}
}
