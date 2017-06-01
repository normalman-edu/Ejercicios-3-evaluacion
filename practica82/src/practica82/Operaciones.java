/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica82;

/**
 *
 * @author edu
 */
public class Operaciones {
/**
 * Declarar variables
 */
private int dinero;
private int[] monedas ={500,200,100,50,20,10,5,2,1};
private int[] devolver= new int[9];

/**
 * 
 * @param dinero es el dinero que utilizaremos para desglosarlo
 */
public void setDinero(int dinero){
this.dinero=dinero;}

/**
 * 
 * @param monedas son las distintas monedas que tenemos 
 */
public void setMonedas(int[] monedas){
this.monedas=monedas;}

/**
 * 
 * @param devolver es donde tendremos la cantidad de dinero de cada valor
 */
public void setDevolver(int[] devolver){
this.devolver=devolver;}

/**
 * devolvemos el dinero
 * @return dinero 
 */
public int getDinero(){
return dinero;}

/**
 * devolvemos las monedas
 * @return monedas
 */
public int [] getMonedas(){
return monedas;}

/**
 * devolvemos la devolucion
 * @return devolver
 */
public int [] getDevolver(){
return devolver;}

/**
 * Operacion para el desglose del dinero
 * @param dinero es el dinero que utilizaremos para desglosarlo
 * @param monedas son las distintas monedas que tenemos
 * @param devolver es donde tendremos la cantidad de dinero de cada valor
 */
public void bucledesglose(int dinero, int[] monedas, int[] devolver){
    for(int i=0;i<monedas.length;i++){
        if(dinero>=monedas[i]){
            devolver[i]=dinero/monedas[i];
            dinero=dinero-(devolver[i]*monedas[i]);}
    }
  }
}