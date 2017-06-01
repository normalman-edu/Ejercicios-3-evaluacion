/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg83;

/**
 *
 * @author edu
 */
public class Operacion {
/**
 * Declarar variables
 */
float n1;
float n2;
float n3;
double result;
    
/**
 * 
 * @param n1 es la x al cuadrado de la equacion de segundo grado
 */
public void setNumero1(float n1){
this.n1=n1;}

/**
 * 
 * @param n2 es la x de la equacion de segundo grado
 */
public void setNumero2(float n2){
this.n2=n2;}

/**
 * 
 * @param n3 es el numero de la equacion de segundo grado
 */
public void setNumero3(float n3){
this.n3=n3;}

/**
 * 
 * @param result es el resultado de las operaciones
 */
public void setResult(double result){
this.result=result;}
    
/**
 * devolvemos valor de x al cuadrado
 * @return n1 
 */
public float getNumero1(){
return n1;}

/**
 * devolvemos el valor de la x
 * @return n2
 */
public float getNumero2(){
return n2;}

/**
 *devolvemos el valor del numero 
 * @return n3
 */
public float getNumero3(){
return n3;}

/**
 * devolvemos el resultado de las operaciones
 * @return result
 */
public double getResult(){
return result;}
    
/**
 *Operacion equacion segundo grado con + 
 * @param n1 es la x al cuadrado de la equacion de segundo grado
 * @param n2 es la x de la equacion de segundo grado
 * @param n3 es el numero de la equacion de segundo grado
 */
public void equa1posi(float n1, float n2, float n3){
this.result=(-n2+(Math.sqrt(Math.pow(n2,2)-4*n1*n3)))/(2*n1);
}
/**
 * Operacion equacion segundo grado con -
 * @param n1 es la x al cuadrado de la equacion de segundo grado
 * @param n2 es la x de la equacion de segundo grado
 * @param n3 es el numero de la equacion de segundo grado
 */
public void equa1nega(float n1, float n2, float n3){
this.result=(-n2-(Math.sqrt(Math.pow(n2,2)-4*n1*n3)))/(2*n1);

    }
}