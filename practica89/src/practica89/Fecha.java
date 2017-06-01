/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica89;

import java.time.LocalDate;

/**
 *
 * @author edu
 */
public class Fecha {
    /**
     * Declarar variables
     */
    private int dia, mes, año;
    private LocalDate date = LocalDate.now();
    
    /**
     * 
     * @param dia dia
     */
    public void setDia(int dia){
        this.dia=dia;}
    
    /**
     * 
     * @param mes mes
     */
    public void setMes(int mes){
        this.mes=mes;}
    
    /**
     * 
     * @param año año
     */
    public void setAño(int año){
        this.año=año;}
    
    /**
     * devolvemos el dia
     * @return dia
     */
    public int getDia(){
        return dia;}
    
    /**
     * devolvemos el mes
     * @return mes
     */
    public int getMes(){
        return mes;}
    
    /**
     * devolvemos año
     * @return año
     */
    public int getAño(){
        return año;}
    
    /**
     * Operacion para mostra fecha actual
     * @param dia dia
     * @param mes mes
     * @param año año
     */
    public void FechaActual(int dia, int mes, int año){
        this.dia = date.getDayOfMonth();//valor del día del mes [1-31]
        this.mes = date.getMonthValue(); //valor del mes [1-12]
        this.año = date.getYear();}//valor del año
    
    /**
     * Comprobacion fecha valida
     * @param dia dia
     * @param mes dia
     * @param año dia
     * @return valida
     */
    public boolean FechaValida(int dia, int mes , int año){
        /**
         * Comprobacion año bisiesto
         */
        boolean bisiesto=false;
        if(año%4==0){
           if(año%100==0 && año%400!=0){
            }else{
                bisiesto=true;}}
        
        boolean valida;
        if(dia<1||dia>31||mes<1||mes>12){//Meses con 31 días
            valida=false;}
        else if(mes==2 && dia>29){//Febrero no puede ser mayor de 29
            valida=false;}
        else if(bisiesto==false && mes==2 && dia>28){//Año bisiesto dia 29 febrero
            valida=false;}
        else if((mes==4||mes==6||mes==9||mes==11)&& mes>30){//Meses con 30 días
            valida=false;}
        else{
            valida=true;}
        return valida;}
    
        }