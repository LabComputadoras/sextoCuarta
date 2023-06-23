package resolucionExamen;

import java.util.Scanner;

public class Tema2 {
    public static void main(String[] args) {

        int numero1;
        int numero2;
        int suma = 0;
        Scanner ent = new Scanner(System.in);

        // Resolución

        System.out.println("Por favor ingrese un número: ");
        numero1 = ent.nextInt();
        System.out.println("Ingrese otro por favor: ");
        numero2 = ent.nextInt();

        if (numero1 > numero2) {
            int aux = numero1;
            numero1 = numero2;
            numero2 = aux;
        }

        for (int i = numero1; i <= numero2; i++) {
            suma += i;
        }

        System.out.println("La suma es " + suma);
    }
}
