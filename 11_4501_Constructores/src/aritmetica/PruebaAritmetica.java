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
        int resultado = aritmetica.sumar(5, 4);
        
        //Imprimimos el resultado
        System.out.println("El valor Total(Metodo1):  "+ resultado);
    
        //Si llamamos el metodo  suma sin argumentos el valor es cero,
        // ya que los atributo del objeto nunca se inicializaron; no se utilizo
        //el constructor con argumentos, sino el constructor vacio.
        
        System.out.println("Resultado del Atributo Objeto 1: "+ aritmetica.sumar());
        
        //Ahora creamos dos objetos con el constructor con 2 argumentos
        Aritmetica aritmetica2 = new Aritmetica(5,6);
        
        
        //Imprimimos directamente el resultado
        //Al llamar directamente al metodo suma, nos regresa el valor de la suma
        System.out.println("\nResultado de suma de atributos: " + aritmetica2.sumar());
        
    
    }
    
}
