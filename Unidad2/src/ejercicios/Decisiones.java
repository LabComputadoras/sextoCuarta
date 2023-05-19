package ejercicios;

import java.util.Scanner;       // Importamos la clase Scanner para poder crer un objeto.

public class Decisiones {
    public static void main(String[] args) {

        int edad;
        Scanner ent = new Scanner(System.in);                           // Creamos un objeto Scanner para las entradas manuales.

        System.out.println("Por favor, ingrese su edad.");              // Instrucción para el usuario.
        edad = ent.nextInt();                                           // Leemos la edad del usuario y la guardamos en la variable edad.

        if (edad > 18){
            System.out.println("Es mayor de edad, puede ingresar :)");
        }
        System.out.println("Llegamos al final del código.");
    }
}

// Ahora, dependiendo de la edad que digite el usuario, las lineas del if podrían o no ejecutarse.