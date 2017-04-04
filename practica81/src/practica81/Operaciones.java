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
private float radio;
private double result;
    
//setters
public void setRadio(float radio){
 this.radio=radio;}
   
public void setResult(double result){
 this.result=result;}
    
//getters
public float getRadio(){
 return radio;}
    
public double getResult(){
 return result;}
    
//operaciones
public void Area(float radio){
 this.result=4*Math.PI*Math.pow(radio,2);}
    
public void Volumen(float radio){
 this.result=(4*Math.PI*Math.pow(radio,3))/3;}
}
