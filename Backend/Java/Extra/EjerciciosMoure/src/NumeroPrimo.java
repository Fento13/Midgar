import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        /*
         * Crea una única función (importante que sólo sea una) que sea capaz
         * de calcular y retornar el área de un polígono.
         * - La función recibirá por parámetro sólo UN polígono a la vez.
         * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
         * - Imprime el cálculo del área de un polígono de cada tipo.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el tipo de poligono: ");
        String poligono = scanner.nextLine();

        switch (poligono.toLowerCase()) {
            case "triangulo":
            System.out.println("base X altura / 2");
                break;
            case "cuadrado":
            System.out.println("lado X lado");
                break;
            case "rectangulo":
              System.out.println("base X altura");
                break;
        }

    }
}
