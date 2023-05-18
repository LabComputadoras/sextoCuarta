
package Ejemplos;

import java.util.Scanner;                   // Importar la clase Scanner

public class Teclado {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int numero;
        float numeroRacional;
        String texto;
        
        System.out.println("Por favor, ingrese un número:");                    // Mensaje decorativo.
        numero = teclado.nextInt();                                                // Se lee un número entero.
        System.out.println("El número que ingresó fue: " + numero);             // Imprimimos el resultao.
        System.out.println("Por favor, ingrese un número con parte decimal:");
        numeroRacional = teclado.nextFloat();                                   // Se lee un número del tipo float
        System.out.println("El número ingresado fue: " + numeroRacional);
        System.out.println("Por favor, escribí tu nombre: ");
        teclado.nextLine();                                                     // Se purga el enter.
        texto = teclado.nextLine();                                             // Leemos una línea de texto.
        System.out.println("Su nombre es " + texto);
    } 
}
