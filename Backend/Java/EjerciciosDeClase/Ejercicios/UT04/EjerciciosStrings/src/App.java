import java.util.Scanner;

public class App {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        String cadena = sc.nextLine();
        char cadenaInicial = cadena.charAt(0);
        char cadenaFinal = cadena.charAt(cadena.length() - 1);
        for (int i = 0; i < cadena.length(); i++) {
            System.out.println(cadena.charAt(i));
        }
        
        if (cadenaInicial == cadenaFinal) {
            System.out.println("La cadena empieza y termina con el mismo caracter");
        } else {
            System.out.println("La cadena no empieza y termina con el mismo caracter");
            
        }
        
}
}