package explicaciones;

import static funciones.Funciones.*;

public class NumerosAleatorios {
    public static void main(String[] args) {
        int max = 20;
        int min = 10;
        int dim = 30;
        int[] vectorAleatorio = vectorAleatorio(dim, min, max);

        System.out.println();
        imprimirVector(vectorAleatorio);
    }
}
