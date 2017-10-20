/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclo;

import java.util.Scanner;

/**
 *
 * @author HenryPuentesG
 */
public class CicloDoWhileV2 {
    
    public static void main(String[] args) {
        
        System.out.println("Ingrese el numero a iterar:");
        Scanner sc = new Scanner(System.in);
        int maxIterar;
        maxIterar = sc.nextInt();
        int contador = 0;
        
        do{
            System.out.println("Contador: " +contador );
            contador++;
        }while(contador<maxIterar);
        
    }
    
}
