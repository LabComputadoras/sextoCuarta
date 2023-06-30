package explicaciones;

public class Vectores {
    public static void main(String[] args) {
        int[] vector = {1,2,3};
        int[] segundoVector = {1, 2, 3, 4, 1 , 1, 1, 1};
        imprimirVector(segundoVector);
        System.out.println();
        imprimirVector(vector);
    }

    static void imprimirVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }

}
