/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchcalculames;

/**
 *
 * @author HenryPuentesG
 */
public class CalculaMesSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int mes = 1;
        String estacion;
        
        
        switch(mes){
            case 1: case 2: case 12:
                estacion = "Invierno";
                break;
            case 3: case 4: case 5:
                estacion = "Primavera";
                break;
            case 6: case 7: case 8:
                estacion = "Verano";
                break;
            case 9: case 10: case 11:
                estacion = "otoño";
                break;
            default:
                estacion = "Mes invalido"; 
        }
        
        System.out.println("el mes: " + mes + " corresponde a la Estacion: " + estacion );
    }
    
}
