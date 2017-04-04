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
    public void longitud(float radio){
    this.result=2*Math.PI*radio;}
    
    public void area(float radio){
    this.result=Math.PI*Math.pow(radio, 2);}
}
