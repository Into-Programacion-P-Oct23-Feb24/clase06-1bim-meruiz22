/*
*   Generar un programa que permita ingresar un nombre de una ciudad;
*   Los nombres de las ciudades permitidas son las que empiezan con vocal.
*   Si la ciudad es permitida presentar un mensaje:
*   Nombre con inicial O de otavalo
*   Si la ciudad no es permitida presentar un mensaje:
*   opción incorrecta; ninguna de las anteriores
 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo031 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        System.out.println("Ingrese el nombre de estudiante");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese el apellido de estudiante");
        String apellido = entrada.nextLine();
        System.out.println("Ingrese el universidad de estudiante");
        String universidad = entrada.nextLine();
        System.out.println("Ingrese el edad de estudiante");
        int edad = entrada.nextInt();
        // nombre = "atacames"
        char valor = nombre.charAt(0); // obtener el primer caracter de una
                                       // cadena
        //  L   o   j   a
        //  0   1   2   3
        switch(valor){
            case 'a':
            case'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                System.out.printf("%s %s de edad  %s "
                        + "es estudisnte de la %s", 
                         nombre.toUpperCase(),apellido.toUpperCase(),
                        edad,universidad );
                break;
               
            
            default:
                 System.out.printf("%s %s de edad  %s "
                         + "es estudisnte de la %s", 
                         nombre.toLowerCase(),apellido.toLowerCase(),
                        edad,universidad );
                break;
                
        }
        
    }
}
