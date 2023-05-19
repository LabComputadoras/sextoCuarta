package ejercicios;

import java.util.Scanner;

public class Teclado {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int variableEntera;         // Declaramos una variable para almacenar enteros.
        float variableRacional;     // Declaramos una variable que admite decimales.
        String variableTexto;       // Declaramos una variable para almacenar texto.

        variableEntera = teclado.nextInt();     // Utilizamos el método nextInt() para leer un entero.
        variableRacional = teclado.nextFloat(); // Utilizamos el método nextFloat() para leer un float.
        variableTexto =  teclado.nextLine();    // Utilizamos el método nextLine() para leer un String.

        System.out.println("El número ingresado fue: " + variableEntera);       // Imprimimos en pantalla el entero ingresado.
        System.out.println("El racional ingresado fue: " + variableRacional);   // Imprimimos en pantalla el racional ingresado.
        System.out.println("El texto ingreado fue: " + variableTexto);          // Imprimios en pantalla el texto ingresando.

    }
}
