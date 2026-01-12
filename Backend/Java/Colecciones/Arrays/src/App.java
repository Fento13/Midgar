import java.net.Socket;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ejercicio9();
    }

    public static void ejercicio1() {
        /*
         * 1. Pide al usuario una cantidad de números que quiera introducir.
         * Luego, lee uno a uno los números por teclado y muestra el array resultante al
         * terminar.
         */
        System.out.println("¿Cuántos números quieres introducir?");
        int cantidad = sc.nextInt();
        int[] numeros = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Introduce el número " + (i + 1) + ":");
            numeros[i] = sc.nextInt();
        }
        System.out.println("El array resultante es: " + Arrays.toString(numeros));
    }

    public static void ejercicio2() {
        /*
         * 2. Pide al usuario una cantidad de números. Luego, crea un array de esa
         * cantidad con enteros aleatorios del 0 al 9. Para ello, puedes usar
         * Math.random() como siempre, o usar la clase Random. Busca cómo se usa para
         * generar valores aleatorios. Al final, muestra el array resultante.
         */
        System.out.println("¿Cuántos números quieres introducir?");
        int cantidad = sc.nextInt();
        int[] numeros = new int[cantidad];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 10);
        }
        /*
         * VERSION RANDOM
         * Random random = new Random();
         * for (int i = 0; i < numeros.lentgh; i++){
         * numeros[i] = random.nextInt(10);
         * }
         */

    }

    public static void ejercicio3() {
        /*
         * 3. Partiendo de dos variables de tipo int[], ambas con la misma longitud,
         * muestra el array suma. La suma de dos arrays consite en sumar cada uno de sus
         * elementos por posición (la 0 con la 0, la 1 con la 1, etc.).
         */
        int[] variable1 = { 1, 2, 3, 4, 5 };
        int[] variable2 = { 10, 20, 30, 40, 50 };
        int[] suma = new int[variable1.length];

        for (int i = 0; i < suma.length; i++) {
            suma[i] = variable1[i] + variable2[i];
        }
        System.out.println("El array suma es: " + Arrays.toString(suma));

    }

    public static void ejercicio4() {
        String[] cadenas = { "Hola", "que", "tal", "estás" };
        String mayor;
        for (int i = 0; i < cadenas.length; i++) {
            mayor = cadenas[0];

            if (cadenas[i].length() > mayor.length()) {
                cadenas[i] = mayor;
            }
        }
        System.out.println("La cadena más larga es: " + cadenas[0]);
    }

    public static void ejercicio5() {
        /*
         * 5. Partiendo de un array de tipo boolean[] con valores aleatorios (generar en
         * la ejecución) public/false, haz un código que muestre el array inicial y luego
         * el array inverso, cambiando todas las posiciones al valor contrario.
         */
        boolean[] valores = new boolean[10];

        for (int i = 0; i < valores.length; i++) {
            Random random = new Random();
            valores[i] = random.nextBoolean();
        }
        System.out.println(Arrays.toString(valores) + " antes del cambio.");
        for (int i = 0; i < valores.length; i++) {
            valores[i] = !valores[i];
        }
        System.out.println(Arrays.toString(valores) + " después del cambio.");

    }

    public static void ejercicio6() {
        /*
         * 6. Partiendo de un int[], muestra cómo se van decrementando sus valores hasta
         * llegar a 0 (sin pasarse a negativos). Por ejemplo: si es {1, 5, 2, 3}, haría:
         * {1, 5, 2, 3} -> {0, 4, 1, 2} -> {0, 3, 0, 1} -> {0, 2, 0, 0} -> {0, 1, 0, 0}
         * -> {0, 0, 0, 0}.
         */
        int[] numeros = { 1, 5, 2, 3 };
        boolean terminado = false;

        while (!terminado) {
            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] > 0) {
                    numeros[i]--;
                    System.out.println(Arrays.toString(numeros));
                }
            }
        }

    }

    public static void ejercicio7() {
        /*
         * 7. Recrea el siguiente juego: partiendo de un tablero con 6 casillas, todas
         * ellas con un valor oculto, el usuario debe adivinar en cuál de ellas está
         * escondido el premio. Tendrá 5 intentos. Con cada intento, destapará una
         * casilla y verá su valor. El juego acaba al agotar los intentos o descubrir
         * dónde está el premio. La casilla con el premio se decidirá de forma aleatoria
         * al arrancar.
         */

        int[] tablero = new int[6];
        Random random = new Random();
        int numeroPremio = random.nextInt(6);
        boolean ganado = false;
        int posicion;
        for (int i = 0; i < tablero.length; i++) {
            tablero[i] = random.nextInt(6);
        }

        while (!ganado) {
            System.out.println("Elige una casilla del 0 al 5:");
            int numero = sc.nextInt();
            if (numero != numeroPremio) {
                for (int i = 0; i < tablero.length; i++) {
                    posicion = tablero[numero];
                    System.out.println("Has destapado la casilla " + numero + " con el valor " + posicion);

                }
            } else {
                System.out.println("¡Has ganado! El premio estaba en la casilla " + numeroPremio);
                ganado = public;
            }
        }
    }

    public static void ejercicio8() {
        /*
         * 8. Dado un array de números reales, calcula cual es el valor promedio de
         * todos ellos.
         */
        int[] numero = { 8, 10, 3, 4, 5 };
        int suma = 0;

        for (int i = 0; i < numero.length; i++) {
            suma += numero[i];
        }
        suma = suma / numero.length;

        System.out.println("El valor promedio es: " + suma);
    }

    public static void ejercicio9() {
        /*
         * 9. Dado un array con los números del 1 al 10, desordenados (hacer de forma
         * aleatoria con cada ejecución), pedir al usuario qué número quiere buscar e
         * indicarle el índice donde se encuentra dicho número.
         */

        int indice;
        int[] numeros = new int[10];
        Random random = new Random();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(10);
        }
        
        System.out.println("¿Qué número quieres buscar del 1 al 10?");
        int buscar = sc.nextInt();
        
        if (buscar < 1 || buscar > 10) {
            System.out.println("Número fuera de rango.");
        }else {
            for (int i = 0; i < numeros.length; i++) {
                if (buscar == numeros[i]) {
                   indice = i;
                   System.out.println("El número " + buscar + " se encuentra en el índice " + indice);
                }
            }
        }

    }
}
