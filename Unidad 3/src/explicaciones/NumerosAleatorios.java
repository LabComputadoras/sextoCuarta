package explicaciones;

public class NumerosAleatorios {
    public static void main(String[] args) {
        int max = 20;
        int min = 10;
        int a;
        int b;
        double r;

        a = max - min;
        b = min;

        r = Math.random() * a + b;
        System.out.println(r);

    }
}
