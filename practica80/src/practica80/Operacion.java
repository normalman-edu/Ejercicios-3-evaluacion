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
float lado;
double result;
    
//setters
public void setLado(float lado){
this.lado=lado;}

public void setResult(double result){
    this.result=result;}
    
//getters
public float getLado(){
return lado;}
    
public double getResult(){
return result;}
    
//Operacion
public void Area(float lado){
this.result=6*Math.pow(lado,2);}

}
