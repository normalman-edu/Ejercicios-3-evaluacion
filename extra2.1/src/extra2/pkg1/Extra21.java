/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra2.pkg1;

import java.util.Scanner;

/**
 *
 * @author edu
 */
public class Extra21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Declarar objetos
    Operaciones op = new Operaciones();
        
    //Entrada por teclado
    Scanner teclado= new Scanner (System.in);
        
    //Declarar segundos
    System.out.println("Cuanto segundos deseas calcular:");
    op.setMinutos(teclado.nextInt());
    
    op.bucledesglose(op.getMinutos(), op.getTiempo(), op.getDesglose());
    
    //bucle para mostrar el resultado
    for(int i=0;i<op.getNombre().length;i++){
        if (op.getDesglose()[i]>0){
        // Indicamos la medida de tiempo que es
        System.out.println("Son "+op.getDesglose()[i]+" "+op.getNombre()[i]);
     
       
      }  
     }
}
}