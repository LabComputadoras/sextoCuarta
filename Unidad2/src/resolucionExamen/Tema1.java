package resolucionExamen;

import java.util.Scanner;

public class Tema1 {
    public static void main(String[] args) {

        int numeroIngresado;
        int contDivisores = 1;

        Scanner ent = new Scanner(System.in);


        // Resolución:

        System.out.println("Ingresa un número entero positivo:");
        numeroIngresado = ent.nextInt();

        for (int i = 2; i <= numeroIngresado; i++) {
            if (numeroIngresado % i == 0){
                contDivisores++;
            }

            if (contDivisores > 2){
                break;
            }
        }

        if (contDivisores == 2) {
            System.out.println("El número ingresdo es primo.");
        } else {
            System.out.println("El número ingresado no es primo.");
        }

    }
}
