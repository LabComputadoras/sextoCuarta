package funciones;

public class Funciones {
    public static void imprimirVector(int[] vector) {
        for(int elemento : vector) {
            System.out.println(elemento);
        }
    }

    public static int enteroAleatorio (int min, int max) {
        int a = max - min + 1;
        int b = min;
        return (int) Math.floor(Math.random() * a + b);
    }

    public static int[] vectorAleatorio (int dim, int min, int max) {

        int[] vectorAleatorio = new int[dim];
        for (int i = 0; i < dim; i++) {
            vectorAleatorio[i] = enteroAleatorio(min, max);
        }
        return vectorAleatorio;
    }
}
