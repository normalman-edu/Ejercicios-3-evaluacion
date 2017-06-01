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
    /**
     * Declarar variables
     */
    private int operador1;
    private int operador2;
    private int result;
    
    /**
     * 
     * @param operador1 primer parametro de la operacion
     */
    public void setOperador1(int operador1){
    this.operador1=operador1;}
    
    /**
     * 
     * @param operador2 segundo parametro de la operacion
     */
    public void setOperador2(int operador2){
    this.operador2=operador2;}
    
    /**
     * 
     * @param result resultado de la operacion entre los parametros anteriores
     */
    public void setResult(int result){
    this.result=result;}
    
    /**
     * 
     * @return operador1
     */
    public int getOperador1(){
    return operador1;}
    
    /**
     * 
     * @return operador2 
     */
    public int getOperador2(){
    return operador2;}
    
    /**
     * 
     * @return result
     */
    public int getResult(){
    return result;}
    
    /**
     * Operacion suma
     * @param operador1 primer parametro de la operacion
     * @param operador2 segundo parametro de la operacion
     */
    public void suma(int operador1, int operador2){
        this.result=operador1+operador2;}
    
    /**
     * Operacion resta
     * @param operador1 primer parametro de la operacion
     * @param operador2 segundo parametro de la operacion
     */
    public void resta(int operador1, int operador2){
        this.result=operador1-operador2;}
    
    /**
     * Operacion multiplicacion
     * @param operador1 primer parametro de la operacion
     * @param operador2 segundo parametro de la operacion
     */
    public void multi(int operador1, int operador2){
        this.result=operador1*operador2;}
    
    /**
     * Operacion division
     * @param operador1 primer parametro de la operacion
     * @param operador2 segundo parametro de la operacion
     */
    public void divi(int operador1, int operador2){
        this.result=operador1/operador2;}
}
