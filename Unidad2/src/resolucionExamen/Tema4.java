package resolucionExamen;

import java.util.Scanner;

public class Tema4 {
    public static void main(String[] args) {

        int numeroElegido;
        int numeroAdivinado;
        boolean adivinado = false;
        Scanner ent = new Scanner(System.in);

        // Resolución:

        System.out.println("Jugador 1: Elija un número entre el 1 y el 100");
        numeroElegido = ent.nextInt();

        System.out.println("Turno jugador 2");

        for (int i = 0; i < 5; i++) {
            System.out.println("Jugador 2: Adivine el número");
            numeroAdivinado = ent.nextInt();

            if (numeroAdivinado == numeroElegido) {
                adivinado = true;
                break;
            }
        }

        if (adivinado) {
            System.out.println("Ganó el jugador 2.");
        } else {
            System.out.println("Ganó el jugador 1.");
        }

    }
}
