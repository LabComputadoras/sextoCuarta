package ejercicios;

public class Decisiones {
    public static void main(String[] args) {

        int edad = 17;  // Se declara una variable entera que inicialmente vale 17.

        if (edad > 18){
            System.out.println("Es mayor de edad, puede ingresar :)");
        }
        System.out.println("Llegamos al final del código.");
    }
}

// Al no cumplirse la condición del if, en la consola solo veremos el mensaje de fuera del if.