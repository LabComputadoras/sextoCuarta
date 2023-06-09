package ejerciciosGuia;

import java.util.Scanner;
public class Ejercicio27 {
    public static void main(String[] args) {

        // Declaración de variables

        double sumaPares = 0;
        double contPares = 0;
        double promedioPares;
        int numero;
        Scanner ent = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Por favor, ingrese un número");
            numero = ent.nextInt();
            if(numero % 2 == 0){
                sumaPares += numero;
                contPares++;
            }
        }

        promedioPares = sumaPares / contPares;

        System.out.println("El promedio de los pares fue: " + promedioPares);

    }
}
