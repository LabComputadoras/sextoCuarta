package ejercicios;

import java.util.Scanner;       // Importamos la clase Scanner para poder crer un objeto.

public class Decisiones {
    public static void main(String[] args) {

        int edad;
        Scanner ent = new Scanner(System.in);

        System.out.println("Por favor, ingrese su edad.");
        edad = ent.nextInt();

        if (edad > 18){
            System.out.println("Es mayor de edad, puede ingresar :)");
        } else {    // Comienzo del else.

        }           // Fin del else.

        System.out.println("Llegamos al final del código.");
    }
}

/*
 Else es una estructura opcional que podemos añadir si deseeamos programar un coportamiento que solamente se ejecutará
 si la condición resulta falsa.
*/
