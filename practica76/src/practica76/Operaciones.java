/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica76;

/**
 *
 * @author edu
 */
public class Operaciones {
    private int operador1;
    private int operador2;
    private int result;
    
    //Declarar setters
    public void setOperador1(int operador1){
    this.operador1=operador1;}
    
    public void setOperador2(int operador2){
    this.operador2=operador2;}
    
    public void setResult(int result){
    this.result=result;}
    
    //Declarar getters
    public int getOperador1(){
    return operador1;}
    
    public int getOperador2(){
    return operador2;}
    
    public int getResult(){
    return result;}
    
    //Posibles operaciones
    public void suma(int operador1, int operador2){
        this.result=operador1+operador2;}
    
    public void resta(int operador1, int operador2){
        this.result=operador1-operador2;}
    
    public void multi(int operador1, int operador2){
        this.result=operador1*operador2;}
    
    public void divi(int operador1, int operador2){
        this.result=operador1/operador2;}
}
