/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package garridoyzablah_alejandraynajmah_labsemana4;

import java.util.Scanner;
/**
 *
 * @author najma
 */
public class Ejercicio_Filtrar {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in).useDelimiter("\n");
        
        //Datos ingresados mediante el teclado
        System.out.print("Por favor, ingrese una frase: ");
        String frase = lea.next();
        System.out.print("Ingrese la longitud minima de cada palabra: ");
        int longitudMinima = lea.nextInt();
        
        /*Procedimiento:
        Separar la frase en palabras individuales
        */
        
        String[] palabras = frase.split(" ");
        
        System.out.println("\nPalabras con longitud mayor a "+longitudMinima+": ");
        
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() > longitudMinima) {
                System.out.println(palabras[i]);
            }
        }
    }
    
}
