import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EjerciciosCodewars {
    public static void main(String[] args) {
        Ejercicio1();
    }

    public static void Ejercicio1() {
        int n = 0;
        int index;
        System.out.println("Introduzca un rango");
        try (Scanner s = new Scanner(System.in)) {
            try {
                n = s.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Formato de numero erroneo");
                return;
            }
        }

        if (n <= 0) {
            System.out.println("");
            return;
        }
        int[] base = new int[n];
        for (int i = 0; i < base.length; i++) {
            base[i] = i + 1;
        }
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < base.length; j++) {
                index = (i + j) % base.length;
                sb.append(base[index]);
            }
            System.out.println(sb.toString() + "\n");
        }

    }
}
