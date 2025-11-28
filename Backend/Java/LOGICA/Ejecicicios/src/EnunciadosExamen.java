import java.util.Scanner;

public class EnunciadosExamen {
    public static void main(String[] args) {
    Enunciado2();
    }

    public static void Enunciado1() {
        // Numero Armstrong
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = sc.nextInt();

        //longitud del numero igual a cero de momento...
        int longitud =  0;
        //un numero temporal para no perder el valor del numero original
        int temporal = numero;

        //calculo de la longitud del numero
        if (temporal == 0) {
            //si el numero es 0, su longitud es 1
            longitud = 1;
        } else {
            //mientras el numero temporal no sea 0, se divide entre 10 y se incrementa la longitud
            while (temporal != 0) {
                temporal /=  10; 
                longitud++;
            }
        }

        int suma = 0;
        temporal = numero;

        while (temporal != 0) {
            int digito = temporal % 10;
            
            suma += Math.pow(digito, longitud);
            temporal /= 10;

        }

        if (suma == numero) {
            System.out.println(numero + " es un numero Armstrong");
        } else {
            System.out.println(numero + " no es un numero Armstrong");
        }

        sc.close();
    }

    public static void Enunciado2() {
        int numeroSecreto = (int) (Math.random() * 1000) + 1;
        int min = 1;
        int max = 1000;
        int intento;
        int contador = 0;

        System.out.println("El número secreto está entre 1 y 1000");
        System.out.println("(El número secreto es: " + numeroSecreto + ")"); // Solo para comprobar

        do {
            intento = (min + max) / 2; // se calcula el rango (punto medio)
            contador++;

            System.out.println("Intento #" + contador + ": " + intento);

            if (intento < numeroSecreto) {
                System.out.println("Demasiado bajo 🔽");
                min = intento + 1; // actualiza límite inferior
            } else if (intento > numeroSecreto) {
                System.out.println("Demasiado alto 🔼");
                max = intento - 1; // actualiza límite superior
            } else {
                System.out.println("🎯 ¡Adivinado! El número era " + numeroSecreto);
                System.out.println("Intentos: " + contador);
            }

        } while (intento != numeroSecreto);
    }
}
