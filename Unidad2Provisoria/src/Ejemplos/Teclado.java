
package Ejemplos;

import java.util.Scanner;                   // Importar la clase Scanner

public class Teclado {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int edad;
        System.out.println("Por favor, ingrese su edad: ");
        edad = teclado.nextInt();
        
        if(edad >= 18) {
            System.out.println("Podes pasar.");
        } else {
            System.out.println("No podes pasar.");
        }
        
        System.out.println("El programa finalizó.");
        
        
    } 
}
