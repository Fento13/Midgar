import java.util.Arrays;
import java.util.Scanner;

public class Ejercicios {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        EjercicioArrays();
    }

    public static void Ejercicio5() {
        /*
         * 5. Haz un programa que lea por teclado una cadena y muestre una estructura
         * como la del ejemplo para "CADENA":
         * 
         * C A D E N A
         * A
         * D
         * E
         * N
         * A
         */
        String cadena;
        System.out.println("Ingrese una cadena de texto:");
        cadena = sc.nextLine();
        for (int i = 0; i < cadena.length(); i++) {
            System.out.print(cadena.charAt(i) + " ");
        }
        System.out.println();

        for (int i = 0; i < cadena.length(); i++) {
            System.out.println(cadena.charAt(i));

            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.println(" ");
            }
            System.out.println(cadena.charAt(i));
        }
    }

    public static void Ejercicio6() {
        /*
         * 6. Haz lo mismo, pero con esta estructura:
         * 
         * C A D E N A
         * A A
         * D D
         * E E
         * N N
         * A A
         */

        String cadena;
        String espacios = " ";
        System.out.println("Ingrese una cadena de texto:");
        cadena = sc.nextLine();
        for (int i = 1; i < cadena.length; i++, espacios += "  ") {
            System.out.println(cadena.charAt(i) + espacios + cadena.charAt(i));
        }
    }

    public static void Ejercicio7() {
        /*
         * 1. Haz un programa que, dada una cadena, muestre su pirámide. Por ejemplo:
         * para la cadena "PRUEBA" sería:
         * 
         * P
         * PR
         * PRU
         * PRUE
         * PRUEB
         * PRUEBA
         */

        String cadena;
        System.out.println("Ingrese una cadena de texto:");
        cadena = sc.nextLine();

        for (int i = 0; i < cadena.length(); i++) {
            System.out.println(cadena.substring(0, i + 1));
        }
    }

    public static void Ejercicio8() {
        /*
         * 2. Haz un programa que, dada una cadena, muestre cuántas vocales tiene, tanto
         * mayúsculas como minúsculas.
         */
        String cadena;
        System.out.println("Ingrese una cadena de texto:");
        cadena = sc.nextLine();
        int contador = 0;
        String vocales = "aeiouAEIOU";

        for (int i = 0; i < cadena.length(); i++) {
            if (vocales.indexOf(cadena.charAt(i)) != -1) {
                contador++;
            }
        }
        System.out.println("La cantidad de vocales en la cadena es: " + contador);
    }

    public static void Ejercicio9() {
        /*
         * 3. Haz un programa que, dada una cadena, elimine todos los dígitos (es decir,
         * caracteres del '0' al '9') que tenga. Para ello, investiga cómo funciona el
         * método replaceAll() de los strings.
         */
        String cadena;
        System.out.println("Ingrese una cadena de texto:");
        cadena = sc.nextLine();

        for (int i = 0; i <= 9; i++) {
            cadena = cadena.replaceAll(Integer.toString(i), "");
        }
        System.out.println("La cadena sin dígitos es: " + cadena);
    }

    public static void Ejercicio10() {
        /*
         * 4. Haz un programa que pida al usuarios dos cadenas, C1 y C2.
         * Después, dirá si la cadena C1 está contenida en C2. Ejemplo: si C1 es "hola"
         * y C2 es "hola qué tal",
         * dirá "'hola' está contenido en 'hola que tal'". Otro ejemplo: si C1 es
         * "adiós" y C2 es "hola qué tal", dirá "'adiós'
         * NO está contenido en 'hola qué tal'". Para ello, investiga cómo funciona el
         * método contains() de los strings.
         */

        String c1, c2;
        System.out.println("Ingrese la primera cadena (C1):");
        c1 = sc.nextLine();
        System.out.println("Ingrese la segunda cadena (C2):");
        c2 = sc.nextLine();

        if (c2.contains(c1)) {
            System.out.println("'" + c1 + "' está contenido en '" + c2 + "'");
        } else {
            System.out.println("'" + c1 + "' NO está contenido en '" + c2 + "'");
        }
    }

    public static void Ejercicio11() {
        /*
         * 1. Haz un programa que, dada una cadena, muestre su pirámide. Por ejemplo:
         * para la cadena "PRUEBA" sería:
         * 
         * P
         * PR
         * PRU
         * PRUE
         * PRUEB
         * PRUEBA
         */

        String cadena;
        System.out.println("Ingrese una cadena de texto:");
        cadena = sc.nextLine();

        for (int i = 0; i < cadena.length(); i++) {
            System.out.println(cadena.substring(0, i + 1).toUpperCase());
        }
    }

    public static void Ejercicio12() {
        /*
         * 5. Haz un programa que pida al usuario una cadena y nos diga si cumple o no
         * este formato:
         * - Tiene 8 caracteres de longitud
         * - Los 4 primeros caracteres son letras mayúsculas
         * - Los 3 últimos caracteres son dígitos
         * - El 5º carácter es un guion
         */

        String cadena;
        System.out.println("Ingrese una cadena de texto:");
        cadena = sc.nextLine();

        if (cadena.length() == 8) {
            if (cadena.matches("^[A-Z]{4}-[0-9]{3}$")) {
                System.out.println("La cadena cumple el formato requerido.");
            } else {
                System.out.println("La cadena NO cumple el formato requerido.");
            }
        }
    }
}
