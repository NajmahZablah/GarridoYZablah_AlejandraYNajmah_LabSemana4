/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package garridoyzablah_alejandraynajmah_labsemana4;

import java.util.*;
/**
 *
 * @author najma
 */
public class Ejercicio_CodigoEnigma {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in).useDelimiter("\n");
        int opcion = 0;
        
        //Ciclo para que aparezca el menu interactivo.
        while (opcion != 3) {
            System.out.println("\n=== Menu Interactivo ===");
            System.out.println("1. Encriptar texto");
            System.out.println("2. Desencriptar texto");
            System.out.println("3. Regresar");
            System.out.print("Slecciona una de las opciones: ");
            opcion = lea.nextInt();
            
            /*
            Procedimiento:
            Práctica de las estructuras condiciones y de control.
            */
            if (opcion == 1) {
                System.out.print("Por favor, ingresa el texto a encriptar: ");
                String texto = lea.next();
                String pares = "";
                String impares = "";
                int longitud = texto.length();
                int i = 0;

                while (i < longitud) {
                    if (i % 2 == 0) {
                        pares = pares + texto.charAt(i);
                    } else {
                        impares = impares + texto.charAt(i);
                    }
                    i++;
                }
                String resultado = pares + impares;
                System.out.println("Texto encriptado: " + resultado);

                } else if (opcion == 2) {
                System.out.print("Ingresa el texto a desencriptar: ");
                String textoEncriptado = lea.next();
                String original = "";
                int longitud = textoEncriptado.length();
                int mitad = longitud / 2 ;
                String paresEncriptado = textoEncriptado.substring(0, mitad);
                String imparesEncriptado = textoEncriptado.substring(mitad);
                
                for (int i = 0; i < mitad; i++) {
                    original += textoEncriptado.charAt(i);
                    
                    int indiceImpar = i + mitad; 
                    if (indiceImpar < longitud) {
                        original += textoEncriptado.charAt(indiceImpar);
                    }
                }
                System.out.println("Texto desencriptado: "+original);
                
                } else if (opcion == 3) {
                System.out.println("Saliendo del programa... espere un momento...");
            } else {
                System.out.println("Opción invalida. Intenta de nuevo.");
            }
        }
    }
}
