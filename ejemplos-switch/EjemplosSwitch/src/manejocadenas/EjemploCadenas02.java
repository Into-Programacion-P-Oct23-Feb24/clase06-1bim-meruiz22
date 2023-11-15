/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejocadenas;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class EjemploCadenas02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Esta linea de codigo me permite ingresar datos por teclado
        entrada.useLocale(Locale.US);
        // Esta linea de codigo nos permite estarandizar el punto como decimal
        String cadenaFinal = "Datos Ingresados\n";
        //  Te presenta en pantalla 
        System.out.println("Ingrese la ciudad");
        // Permite ingresar por teclado 
        String ciudad = entrada.nextLine(); // Quito
        
        
        cadenaFinal = String.format("%sCiudad:%s\n",
                cadenaFinal, ciudad);
        //System.out.printf("%s\n",cadenaFinal);
        
        System.out.println("Ingrese la provincia");
        String provincia = entrada.nextLine(); // 
        
        cadenaFinal = String.format("%sProvincia:%s\n",  
                cadenaFinal,
                provincia);
        //String.format funciona como el printf
        System.out.println("Ingrese la país");
        String pais = entrada.nextLine(); // 
        
        cadenaFinal = String.format("%sPaís:%s\n",  
                cadenaFinal, 
                pais);
        
        System.out.printf("%s", cadenaFinal);
    
    }
}
