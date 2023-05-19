package ejercicios;

import java.util.Scanner;

public class Decisiones {
    public static void main(String[] args) {

        int edad;
        Scanner ent = new Scanner(System.in);

        System.out.println("Por favor, ingrese su edad.");
        edad = ent.nextInt();

        if (edad > 18){
            System.out.println("Es mayor de edad, puede ingresar :)");      // Esta línea solo se ejecuta si la condición es verdadera.
        } else {
            System.out.println("No puede pasar, es menor de edad.");        // Esta línea solo se ejecuta si la condición es falsa.
        }

        System.out.println("Llegamos al final del código.");
    }
}

/*
    En este caso, si la edad ingresada por el usuario es mayor que 18 se mostrará el mensaje del if pero si la edad es
    menor que 18 veremos el mensaje del else.
*/
