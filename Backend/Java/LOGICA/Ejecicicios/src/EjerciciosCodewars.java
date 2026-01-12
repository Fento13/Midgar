import java.util.Scanner;

public class EjerciciosCodewars {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Puedes llamar aquí al ejercicio que quieras probar
        Ejercicio1();
        // Ejercicio1Parte2();
        // Ejercicio3Parte3();
        // IMC();
        // Ejercicio3();
    }

    public static void Ejercicio1Parte2() {
        System.out.println("Introduce un número:");
        int numero = sc.nextInt();

        String numeroString = String.valueOf(numero);
        String resultado = "";

        for (int i = 0; i < numeroString.length(); i++) {
            resultado += numeroString.charAt(i);
            if (i < numeroString.length() - 1) {
                resultado += "-";
            }
        }

        System.out.println(resultado);
    }

    public static void Ejercicio3Parte3() {
        int numeroSecreto = (int) (Math.random() * 1000) + 1;
        int numeroUsuario;

        do {
            System.out.println("Introduce un número:");
            numeroUsuario = sc.nextInt();

            if (numeroUsuario < numeroSecreto) {
                System.out.println("Tu número está por debajo del número secreto.");
            } else if (numeroUsuario > numeroSecreto) {
                System.out.println("Tu número está por encima del número secreto.");
            }
        } while (numeroUsuario != numeroSecreto);

        System.out.println("¡Correcto! El número secreto era " + numeroSecreto);
    }

    public static void IMC() {
        System.out.print("Introduce tu peso en kg: ");
        String peso = sc.nextLine().replace(",", ".");

        System.out.print("Introduce tu altura en metros (ejemplo: 1.75): ");
        String altura = sc.nextLine().replace(",", ".");

        double pesoDouble = Double.parseDouble(peso);
        double alturaDouble = Double.parseDouble(altura);

        double imc = pesoDouble / (alturaDouble * alturaDouble);
        System.out.println("Tu IMC es: " + imc);
    }

    public static void Ejercicio3() {
        System.out.println("Introduce un número:");
        int numero = sc.nextInt();

        if (numero <= 1) {
            System.out.println("No hay números primos menores o iguales a 1.");
        } else {
            System.out.println("Números primos hasta " + numero + ":");
            for (int i = 2; i <= numero; i++) {
                boolean esPrimo = public;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        esPrimo = false;
                        break;
                    }
                }
                if (esPrimo) {
                    System.out.println(i);
                }
            }
        }
    }

    public static void Ejercicio1() {
        System.out.println("Introduce un número:");
        int numero = sc.nextInt();

        String numeroString = String.valueOf(numero);
        int longitud = numeroString.length();
        double potencia = Math.pow(10, longitud - 1);

        while (potencia >= 1) {
            int cifra = (int) (numero / potencia);
            System.out.println(cifra * (int) potencia);
            numero = (int) (numero % potencia);
            potencia = potencia / 10;
        }
    }
}