package ejercicios;

public class Decisiones {
    public static void main(String[] args) {

        int edad = 19;  // Se declara una variable entera que inicialmente vale 19.

        if (edad > 18){
            System.out.println("Es mayor de edad, puede ingresar :)");
        }
        System.out.println("Llegamos al final del código.");
    }
}

// Al cumplirse la condición del if, en la consola veremos tanto el mensaje de dentro del if como el de fuera.