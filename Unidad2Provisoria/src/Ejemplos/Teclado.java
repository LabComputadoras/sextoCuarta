
package Ejemplos;

import java.util.Scanner;                   // Importar la clase Scanner

public class Teclado {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int numero;
        float numeroRacional;
        String texto;
        
        System.out.println("Por favor, ingrese un n�mero:");                    // Mensaje decorativo.
        numero = teclado.nextInt();                                                // Se lee un n�mero entero.
        System.out.println("El n�mero que ingres� fue: " + numero);             // Imprimimos el resultao.
        System.out.println("Por favor, ingrese un n�mero con parte decimal:");
        numeroRacional = teclado.nextFloat();                                   // Se lee un n�mero del tipo float
        System.out.println("El n�mero ingresado fue: " + numeroRacional);
        System.out.println("Por favor, escrib� tu nombre: ");
        teclado.nextLine();                                                     // Se purga el enter.
        texto = teclado.nextLine();                                             // Leemos una l�nea de texto.
        System.out.println("Su nombre es " + texto);
    } 
}
