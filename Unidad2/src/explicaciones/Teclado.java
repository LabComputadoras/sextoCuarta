package explicaciones;

import java.util.Scanner;

public class Teclado {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int variableEntera;
        float variableRacional;
        String variableTexto;

        System.out.println("Ingrese un número entero: ");       // Mensaje instructivo para el usuario.
        variableEntera = teclado.nextInt();

        System.out.println("Ingrese un número con decimales");  // Mensaje instructivo para el usuario.
        variableRacional = teclado.nextFloat();

        System.out.println("Ingrese su nombre: ");              // Mensaje instructivo para el usuario.
        teclado.nextLine();
        variableTexto =  teclado.nextLine();

        System.out.println("El número ingresado fue: " + variableEntera);
        System.out.println("El racional ingresado fue: " + variableRacional);
        System.out.println("El texto ingreado fue: " + variableTexto);

    }
}
