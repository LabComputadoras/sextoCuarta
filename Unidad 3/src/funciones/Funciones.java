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
}
