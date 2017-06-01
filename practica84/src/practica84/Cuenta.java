/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica84;

/**
 *
 * @author edu
 */
public class Cuenta {
/**
 * Declarar variables
 */
private String nombre, apellido1, apellido2, dni, numero_cuenta, tipo_interes;
private double saldo;

/**
 * Constructor por defecto
 */
public Cuenta(){
    nombre="";
    apellido1="";
    apellido2="";
    dni="";
    numero_cuenta="";
    tipo_interes="";}


/**
 * Constructor con parametros
 * @param nombre nombre
 * @param apellido1 apellido1
 * @param apellido2 apellido2
 * @param dni dni
 * @param numero_cuenta numero cuenta
 * @param tipo_interes tipo de interes
 */
public Cuenta(String nombre, String apellido1, String apellido2, String dni, String numero_cuenta, String tipo_interes){
    this.nombre=nombre;
    this.apellido1=apellido1;
    this.apellido2=apellido2;
    this.dni=dni;
    this.numero_cuenta=numero_cuenta;
    this.tipo_interes=tipo_interes;}

/**
 * Constructor copia
 * @param c copia de los parametros 
 */
public Cuenta(final Cuenta c){
    nombre=c.nombre;
    apellido1=c.apellido1;
    apellido2=c.apellido2;
    dni=c.dni;
    numero_cuenta=c.numero_cuenta;
    tipo_interes=c.tipo_interes;}

/**
 * 
 * @param saldo es el dinero que tendremos en la cuenta 
 */
public void setSaldo(double saldo){
    this.saldo=saldo;}

/**
 * 
 * @param nombre nombre
 */
public void setNombre(String nombre){
    this.nombre=nombre;}

/**
 * 
 * @param apellido1 apellido1
 */
public void setApellido1(String apellido1){
    this.apellido1=apellido1;}

/**
 * 
 * @param apellido2 apellido2
 */
public void setApellido2(String apellido2){
    this.apellido2=apellido2;}

/**
 * 
 * @param dni dni
 */
public void setDNI(String dni){
    this.dni=dni;}

/**
 * 
 * @param numero_cuenta numero de cuenta 
 */
public void setNumeroCuenta(String numero_cuenta){
    this.numero_cuenta=numero_cuenta;}

/**
 * 
 * @param tipo_interes tipo de interes 
 */
public void setTipoInteres(String tipo_interes){
    this.tipo_interes=tipo_interes;}

/**
 * devolvemos el valor del saldo
 * @return saldo
 */
public double getSaldo(){
    return saldo;}

/**
 * devolvemos el nombre
 * @return nombre
 */
public String getNombre(){
    return nombre;}

/**
 * devolvemos el primer apellido
 * @return apellido1
 */
public String getApellido1(){
    return apellido1;}

/**
 * devolvemos el segundo apellido
 * @return apellido2
 */
public String getApellido2(){
    return apellido2;}

/**
 * devolvemos el dni
 * @return dni
 */
public String getDNI(){
    return dni;}

/**
 * devolvemos el numero de cuenta
 * @return numero_cuenta
 */
public String getNumeroCuenta(){
    return numero_cuenta;}

/**
 * devolvemos el tipo de interes
 * @return tipo_interes
 */
public String getTipoInteres(){
    return tipo_interes;}

/**
 * Operacion ingreso
 * @param ingreso es el dinero que ingresaremos en la cuenta
 */
public void saldoingreso(double ingreso){
    this.saldo=saldo+ingreso;}

/**
 * Operacion reintegro
 * @param reintegro es el dinero que quitaremos de la cuenta
 */
public void saldoreintegro(double reintegro){
    this.saldo=saldo-reintegro;}

/**
 * Operacion transferencia
 * @param transferencia es el dinero que tranferiremos a otra cuenta
 */
public void saldotransferencia(double transferencia){
    this.saldo=saldo-transferencia;}
}