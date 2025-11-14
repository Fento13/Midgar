import java.util.Arrays;
import java.util.Scanner;

public class App {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String texto = "Hola, ¿cómo estás? Espero que bien.";
        String[] arrayLetras = texto.split(" ");
        String[] arrayPuntos = texto.split("\\.");
        String[] arrayPalabras = texto.split("\\s+");
        String cadena = "Hola, ¿cómo estás? Espero que bien.";

        System.out.println(Arrays.toString(arrayLetras));
        System.out.println(Arrays.toString(arrayPuntos));
        System.out.println(Arrays.toString(arrayPalabras));
        System.out.println("La cantidad de palabras en la cadena es: " + arrayPalabras.length);

    }

    public static void ejercicio1() {
        // Pide la longitud, luego uno a uno numeros al usuario y muestra el array.
        System.out.println("Introduce la longitud del array:");
        int longitud = Integer.parseInt(sc.nextLine());
        int[] numeros = new int[longitud];
        for (int i = 0; i < longitud; i++) {
            System.out.println("Introduce el número " + (i + 1) + ":");
            numeros[i] = Integer.parseInt(sc.nextLine());
        }

        System.out.println("El array introducido es: " + Arrays.toString(numeros));
    }

    public static void ejercicio2() {
        String numeros;
        System.out.println("Introduce numeros");
        numeros = sc.nextLine();
        String[] arrayNumeros =  numeros.split("");
        for (int i = 0; i < arrayNumeros.length; i++) {
            System.out.println(arrayNumeros[i]);
        }
        System.out.println(Arrays.toString(arrayNumeros));

    }
}
