package ejemplos;

import java.util.Scanner;

public class AlgoritmoBabilonico {
    public static void main(String[] args) {

        float cateto1;
        float cateto2;
        float hipo;
        float suma;
        float tol = 0.01f;

        Scanner ent = new Scanner(System.in);

        System.out.println("Ingrese el valor de un cateto: ");
        cateto1 = ent.nextFloat();
        System.out.println("Ingrese el valor de otro cateto: ");
        cateto2 = ent.nextFloat();

        suma = cateto1*cateto1 + cateto2*cateto2;
        hipo = raiz(suma,tol);

        System.out.println("La hipotenusa es de " + hipo);

    }

   static float raiz(float area, float tol) {

       float base;
       float altura;
       float error;


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
        return base;
   }
}
