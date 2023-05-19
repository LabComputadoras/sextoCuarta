package ejercicios;

public class Repeticiones {
    public static void main(String[] args) {

        int edad = 12;

        while(edad < 18){
            System.out.print("Tu edad es " + edad);
            System.out.println(", por lo tanto, no podes pasar.");
            edad++;     // Incrementamos la edad en cada iteración.
        }

        System.out.println("Sos mayor de edad, ya podes pasar ;)");
    }
}

/*
  Ahora, dentro del while incrementamos el valor de edad en cada iteración. Por lo tanto, en algún momento se dejará de
  cumplir la condición, interrumpiendo de esta manera las repeticiones.
*/
