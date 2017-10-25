/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aritmetica;

/**
 *
 * @author HenryPuentesG
 */
public class PruebaAritmetica {
    
    public static void main(String[] args) {
        
        //Crear un objeto de la clase aritmetica
        Aritmetica aritmetica = new Aritmetica();
        
        //Llamamos el metodo sumar y recibimos el valor devuelto
        int resultado = aritmetica.sumar(5, 3);
        
        //Imprimimos el resultado
        System.out.println("El valor Total: "+ resultado);
    }
    
}
