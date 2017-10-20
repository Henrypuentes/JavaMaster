/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas;

/**
 *
 * @author HenryPuentesG
 */
public class PersonaPrueba {
    
    public static void main(String[] args) {
        //Creacion de un objeto
        Persona p1 = new Persona();
        
        //Lamado a un metodo del Objeto Creado
        System.out.println("Valores Por efault del objeto persona");
        p1.desplegarNombre();
        
        
        //Modificar Valores
        p1.nombre = "Juan";
        p1.apellidoPaterno= "Puentes";
        p1.apellidoMaterno = "Bejarano";
        
        //Volvemos a a llamar el metodo
        System.out.println("\n Nuevos Datos de Persona ");
        p1.desplegarNombre();
        
        
        
        
    }
    
    
}
