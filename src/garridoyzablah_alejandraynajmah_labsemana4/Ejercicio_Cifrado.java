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
public class Ejercicio_Cifrado {
    public static void main(String[] args) {
        Scanner lea= new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese una frase: ");
        String frase = lea.next();
        
        System.out.println("Ingrese cantidad de posiciones a despalzar: ");
        int desplazamiento = lea.nextInt();
        
        String resultado = "";
        
        int i=0;
        
        while (i<frase.length()){
            char caracter = frase.charAt(i);
            
            if (caracter >= 'A' && caracter <= 'Z'){
                //Para todas las mayúsculas 
                char cifrado = (char)(caracter + desplazamiento);
                if (cifrado > 'Z') {
                    cifrado = (char)(cifrado - 26);
                }
                resultado = resultado + cifrado;
                 } else if (caracter >= 'a' && caracter <= 'z') {
                // Para todas las minúsculas
                char cifrado = (char)(caracter + desplazamiento);
                if (cifrado > 'z') {
                    cifrado = (char)(cifrado - 26);
                }
                
                resultado = resultado + cifrado;
                }else{
                //Para cualquiero otra entrada
                resultado = resultado+caracter;
            }
            i=i+1;
           
        }
        //Se mostrará el resultado del cifrado 
        System.out.println("La frase cifrada se muestra como:");
        System.out.println(resultado);
    }
}

    
