/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejocadenasbasico;

/**
 *
 * @author HenryPuentesG
 */
public class ManejoCadenasBasico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        String nombre="Karla";
        String apellido="Esparza";
        
        System.out.println("Concatenacion:" + nombre + apellido);
        
        System.out.println("Nueva linea: \n" + nombre + " " + apellido);
        
        System.out.println("Tabulador: \t" + nombre + " " + apellido);
        
        System.out.println("Retroceso:\b" + nombre + " " + apellido);
        
        System.out.println("Retorno de carro: \r" + nombre + " " + apellido);
        
        System.out.println("Comilla simple: \'" + nombre + " " + apellido + "\'");
        
        System.out.println("Comilla doble: \"" + nombre + " " + apellido + "\"");
        
    
        // String.charAt(2); //referencia dentro del string (2).
	//Nos devuelve un carácter. Ejemplo:
	//donde índice le indica la posición a la cual estamos haciendo
	String str = "Typing Code";
	char letra = str.charAt(2);
	System.out.println("Caracter en la posicion indicada "+letra);

        //concat:        
       	String str1 = "Typing ";
	String str2 = " Code";
	System.out.println(str1.concat(str2));
        
        
        //IndexOf: Uso 1

        String str21 = "Typing Code";
	int posicion = str21.indexOf('C');
        System.out.println("La letra C se encuentra en la posición "+posicion);

        //indexOf: Uso 2
        	//string.indexOf(caracter, posicionInicio); Ejemplo:
	String nombre2 = "Tyeping Code2"; //note que la ‘e’ aparece 2 veces
	System.out.println("Posición en la que aparece la e "+nombre2.indexOf("e",3));
	//En este caso nos devolveria la posición 11 porque ahí se encuentra la siguiente e.

        //indexOf: Uso 3
        String nombre3 = "Typing Code";
	String buscar = "ping";
	System.out.println("Se encontro la coincidencia ping a partir de la posición "+ nombre3.indexOf(buscar));
	//En este caso nos devolvería 2 ya que desde esa posición coincide ucu en la cadena.

        //IndexOf: Uso 4
        String nombre31 = "Typing Code pi";
	String buscar1 = "pi";
	System.out.println("Se encontro la coincidencia ping a partir de la posición "+ nombre31.indexOf(buscar1,4));
	//En este caso nos devolvería 12 ya que desde esa posición coincide pi en la cadena desde el index 4 .

        //length:
        String nombre4 = "Typing Code";
	int longitud = nombre4.length();
	String espacios = " ";
	System.out.println("El nombre contiene "+longitud+" letras");

        //Nos devolvería 11 que es la cantidad de caracteres que tiene. (la propiedad toma en cuenta todos los espacios).


        //replace:

        String nombre5 = "Typing Cyde";
	String nombreCambiado = nombre5.replace('y', 'a');
	System.out.println(nombreCambiado);
	//En este caso la salida seria “Taping Code”. Ya que reemplazaría todas las "y" que encuentre con "a".

        
        
    
    }
    
}
