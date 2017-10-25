/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclos;

import java.util.Scanner;

/**
 *
 * @author HenryPuentesG
 */
public class CicloWhileV2 {
    
    public static void main(String[] args) {
        
         System.out.println("Introduce un valor para iterar") ;
         int maxElements;
         Scanner sc = new Scanner(System.in); //Creaciond e Objeto Scanner para leer datos
         maxElements = sc.nextInt();
         int contador =0;
         while(contador<maxElements){
             System.out.println("Contador = "+contador);
             contador++;
         }
         
    }
   
}
