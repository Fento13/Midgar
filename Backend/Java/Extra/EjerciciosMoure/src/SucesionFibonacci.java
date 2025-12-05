public class SucesionFibonacci {
    public static void main(String[] args) {
        /*
 * Escribe un programa que imprima los 50 primeros números de la sucesión
 * de Fibonacci empezando en 0.
 * - La serie Fibonacci se compone por una sucesión de números en
 *   la que el siguiente siempre es la suma de los dos anteriores.
 *   0, 1, 1, 2, 3, 5, 8, 13...
 */
        int n0 = 0;
        int n1 = 1;

        for (int i = 0; i < 51; i++) {
            int fib = n0 + n1;
            n0 = n1;
            n1 = fib;
            System.out.println(n0 + " , " + n1);
        }

    }
}
