package ejercicios;

import java.util.Scanner;

public class Teclado {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int variableEntera;
        float variableRacional;
        String variableTexto;

        variableEntera = teclado.nextInt();
        variableRacional = teclado.nextFloat();
        teclado.nextLine();                         // Purgamos la entrada antes de leer un texto.
        variableTexto =  teclado.nextLine();        // Leemos el texto una vez purgado.

        System.out.println("El número ingresado fue: " + variableEntera);
        System.out.println("El racional ingresado fue: " + variableRacional);
        System.out.println("El texto ingreado fue: " + variableTexto);

    }
}
