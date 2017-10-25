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
public class CicloForV2 {
    
    
    public static void main(String[] args) {
        
        System.out.println("ingrese el numero de iteraciones");
        Scanner sc = new Scanner(System.in);
        int limite;
        limite = sc.nextInt();
        
        for (int i = 0;i<limite;i++){
            System.out.println("Ciclos: " + i);
        }
        
        
    }
    
}
