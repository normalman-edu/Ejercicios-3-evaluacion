/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra2.pkg1;

/**
 *
 * @author edu
 */
public class Operaciones {
/**
 * Declarar variables
 */
private int minutos;
private int[]  tiempo={604800,86400,3600,60,1};
private String[] nombre = {"semanas","días","horas","minutos","segundos"};
private int[] desglose= new int[5];

/**
 * 
 * @param minutos es el tiempo que desglosaremos
 */
public void setMinutos(int minutos){
this.minutos=minutos;}

/**
 * 
 * @param tiempo son las distintas opciones de tiempo(ej.horas,semanas)
 */
public void setTiempo(int[] tiempo){
this.tiempo=tiempo;}

/**
 * 
 * @param desglose es donde guardaremos los resultados
 */
public void setDesglose(int[] desglose){
this.desglose=desglose;}

/**
 * 
 * @param nombre son los distintos nombres de las unidades de tiempo
 */
public void setNombre(String[] nombre){
this.nombre=nombre;}

/**
 * devolvemos el valor que le hayamos dado a minutos
 * @return minutos 
 */
public int getMinutos(){
return minutos;}

/**
 * devolvemos el tiempo
 * @return tiempo 
 */
public int [] getTiempo(){
return tiempo;}

/**
 * devolvemos el desglose donde se pondran las cantidades de dinero
 * @return desglose
 */
public int [] getDesglose(){
return desglose;}

/**
 * devolvemos el nombre de las unidades de tiempo
 * @return nombre
 */
public String[] getNombre(){
return nombre;}

/**
 * 
 * Operacion desglose tiempo
 * @param minutos es el tiempo que desglosaremos
 * @param tiempo son las distintas opciones de tiempo(ej.horas,semanas)
 * @param desglose es donde guardaremos los resultados
 */
public void bucledesglose(int minutos, int[] tiempo, int[] desglose){
    for(int i=0;i<tiempo.length;i++){
        if(minutos>=tiempo[i]){
            desglose[i]=minutos/tiempo[i];
            minutos=minutos-(desglose[i]*tiempo[i]);}
    
    }
  }
}
