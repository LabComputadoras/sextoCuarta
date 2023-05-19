package ejercicios;

public class Repeticiones {
    public static void main(String[] args) {

        int edad = 12;      // Declaramos una variable entera que inicialmente vale 12.

        while(edad < 18){
            System.out.println("Sos menor de edad, no podes pasar.");
        }

    }
}

/*
  En este caso, la condición del while siempre se cumple y nunca se deja de cumplir. Por lo tanto, hemos generado un
  bucle infinito.
*/
