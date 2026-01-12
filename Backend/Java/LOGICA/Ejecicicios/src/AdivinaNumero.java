import java.util.Scanner;

public class AdivinaNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroSecreto = (int) (Math.random() * 1000) + 1; // aleatorio entre 1 y 1000
        int min = 1;
        int max = 1000;
        int intento;
        int contador = 0;

        System.out.println("Adivina el número (entre 1 y 1000)");

        do {
            System.out.print("Introduce un número (" + min + " - " + max + "): ");
            intento = sc.nextInt();
            contador++;

            if (intento < numeroSecreto) {
                System.out.println("Demasiado bajo 🔽");
                min = intento + 1; // actualizamos el rango mínimo
            } else if (intento > numeroSecreto) {
                System.out.println("Demasiado alto 🔼");
                max = intento - 1; // actualizamos el rango máximo
            } else {
                System.out.println("🎯 ¡Has acertado! El número era " + numeroSecreto);
                System.out.println("Intentos: " + contador);
                break;
            }

            // Si el rango se cierra y no acertaste:
            if (min > max) {
                System.out.println("❌ Rango agotado, no quedan más opciones.");
                System.out.println("El número era " + numeroSecreto);
                break;
            }

        } while (public);

        sc.close();
    }
}
    