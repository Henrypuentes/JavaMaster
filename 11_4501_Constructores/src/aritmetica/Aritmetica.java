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
public class Aritmetica {
    
    //Atributos de la clase
    int a;
    int b;
    
    //Constructor Vacio
    Aritmetica() {
    }
    
    
    //Constructor con 2 argumentos
    Aritmetica(int arg1, int arg2){
    a= arg1;
    b= arg2;
    
    }
    
    
    int sumar(int a, int b){
    return a+b;
    }
    
    int sumar (){
    return a+b;
    }

}

