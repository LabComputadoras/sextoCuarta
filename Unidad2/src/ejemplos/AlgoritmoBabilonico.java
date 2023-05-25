package ejemplos;

import java.util.Scanner;

public class AlgoritmoBabilonico {
    public static void main(String[] args) {

        // Declaración de variables

        float area;
        float tol;
        float base;
        float altura;
        float error;
        Scanner ent = new Scanner(System.in);

        // Entrada de datos

        System.out.println("Por favor, ingrese un número para calcular su raiz");
        area = ent.nextFloat();
        System.out.println("Por favor, ingrese la precisión deseada del resultado");
        tol = ent.nextFloat();

        // Inicialización de variables

        base = area;
        altura = area / base;
        error = Math.abs(base - altura);

        // Loop

        while(error > tol) {
            base = (base + altura) / 2;
            altura = area / base;
            error = Math.abs(base - altura);
        }

        // Mostrar resultados

        System.out.println("La raíz que busca es: " + base);
    }
}
