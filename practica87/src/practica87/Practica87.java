/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica87;
import java.util.Scanner;
/**
 *
 * @author edu
 */
public class Practica87 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Menu menu = new Menu();
        Libro l1 = new Libro("Herido diario", "David Martinez", 1);
        Libro l2 = new Libro("Eraide", "Javier Bolado", 1);
        
        //Entrada por teclado
        Scanner teclado= new Scanner (System.in);
        
        //Boolean
        boolean finalizar=false;
        
        //Condción del menu
        while(finalizar==false){
            menu.mostrarmenu();
            menu.leerOpcion();
            
            if(menu.getOpcion()==3){
                finalizar=true;}
            
            else if(menu.getOpcion()!=1 && menu.getOpcion()!=2){
                System.out.println("Disculpe pero no tenemos ningun libro con esa identificación");
                System.out.println();
            }
            else{
                while(menu.getOpcion2()!='F'){
                    menu.mostrarmenu2();
                    menu.leerOpcion2();
                    
                    //Hago el switch
                    switch (menu.getOpcion2()){
                        case 'P':
                            if(menu.getOpcion()==1){
                                
                                if(l1.getEjemplares()==1){
                                    l1.prestamo();
                                    System.out.println("El prestamo se ha realizado con éxito");}
                                
                                else{
                                    System.out.println("No quedan ejemplares disponibles de este libro");}}
                            
                            else{
                                if(l2.getEjemplares()==1){
                                    l2.prestamo();
                                    System.out.println("El prestamo se ha realizado con éxito");}
                                
                                else{
                                    System.out.println("No quedan ejemplares disponibles de este libro");}}
                            System.out.println("=============================");
                        break;
                            
                        case 'D':
                            if(menu.getOpcion()==1){
                                if(l1.getEjemplares()==0){
                                    l1.devolucion();
                                    System.out.println("La devolucion se ha realizado con éxito");}
                                
                                else{
                                    System.out.println("No quedan ejemplares por devolver");}}
                            
                            else{
                                if(l2.getEjemplares()==0){
                                    l2.devolucion();
                                    System.out.println("La devolucion se ha realizado con éxito");}
                                
                                else{
                                    System.out.println("No quedan ejemplares por devolver");}}
                            System.out.println("=============================");
                        break;

                        case 'M':
                            if(menu.getOpcion()==1){
                                System.out.println("Título: "+l1.getTitulo());
                                System.out.println("Autor: "+l1.getAutor());
                                System.out.println("Ejemplares: "+l1.getEjemplares());}
                            
                            else{
                                System.out.println("Título: "+l2.getTitulo());
                                System.out.println("Autor: "+l2.getAutor());
                                System.out.println("Ejemplares: "+l2.getEjemplares());}
                            System.out.println("=============================");
                        break;
                    }
                }
                menu.reiniciaropcion2();
            }
        }
    }
}