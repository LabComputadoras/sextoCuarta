package explicaciones;

import funciones.Funciones.*;

import static funciones.Funciones.enteroAleatorio;
import static funciones.Funciones.imprimirVector;

public class NumerosAleatorios {
    public static void main(String[] args) {
        int max = 20;
        int min = 10;
        int[] vectorAleatorio = new int[30];

        for (int i = 0; i < vectorAleatorio.length; i++) {
            vectorAleatorio[i] = enteroAleatorio(min,max);
        }

        System.out.println();
        imprimirVector(vectorAleatorio);
    }
}
