public class sinbelisk {
    public static void main(String[] args) {
        imprimirNumeros(100);

        System.out.println(calcularFactorial(3));

        System.out.println(fibonacci(6));
    }

    public static void imprimirNumeros(int n) {
        if (n == 0) {
            System.out.println(0);
            return;
        }

        System.out.println(n);
        imprimirNumeros(n - 1);
    }

    public static int calcularFactorial(int n) {
        if (n == 0) return 1;
        return n * calcularFactorial(n - 1);
    }

    static private int fibonacci(int pos) {
        if (pos == 0) return 0;
        else if (pos == 1) return 1;

        return fibonacci(pos - 1) + fibonacci(pos - 2);
    }
}

