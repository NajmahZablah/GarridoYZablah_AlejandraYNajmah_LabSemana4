/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package garridoyzablah_alejandraynajmah_labsemana4;

import java.util.Scanner;
/**
 *
 * @author najma
 */
public class Ejercicio_CodigoEnigma {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in).useDelimiter("\n");
        
        //Menu interactivo:
        System.out.println("\n=== Menu Proncipal ===");
        System.out.println("1. Encriptar texto");
        System.out.println("2. Desencriptar texto");
        System.out.println("3. Regresar");
        System.out.print("Por faovr, seleccione una de las opciones: ");
        int opcion = lea.nextInt();
        
        //Procedimiento:
        switch (opcion) {
            case 1: 
                System.out.println("Ahora ingrese el mensaje que desea encriptar: ");
                String mensaje = lea.next();
                
            case 2:
            
            case 3:
                
        }
            
    }
}
