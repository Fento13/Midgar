public class FizzBuzz {
    public static void main(String[] args) {
        /*
 * Escribe un programa que muestre por consola (con un print) los
 * números de 1 a 100 (ambos incluidos y con un salto de línea entre
 * cada impresión), sustituyendo los siguientes:
 * - Múltiplos de 3 por la palabra "fizz".
 * - Múltiplos de 5 por la palabra "buzz".
 * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
 */

        String buzz  ="buzz";
        String fizzbuzz = "fizzbuzz";

        for (int i = 1; i < 101; i++) {

        int divisible3 = i % 3 == 0 ? 1:0;
        int divisible5 = i % 5 == 0 ? 1:0;
        
            if ( divisible3 == 1 && divisible5 == 1 ) {
                System.out.println("fizz");
            }else if (divisible3 == 1) {
                System.out.println(buzz);
            } else if (divisible5 == 1) {
                System.out.println(fizzbuzz);
            } else {
                System.out.println(i);
            }
            System.out.println();
        }
    }
}
