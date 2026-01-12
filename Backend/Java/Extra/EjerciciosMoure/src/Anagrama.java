import java.util.Arrays;

public class Anagrama {
    public static void main(String[] args) {
        /*
         * Escribe una función que reciba dos palabras (String) y retorne
         * verdadero o falso (Bool) según sean o no anagramas.
         * - Un Anagrama consiste en formar una palabra reordenando TODAS
         * las letras de otra palabra inicial.
         * - NO hace falta comprobar que ambas palabras existan.
         * - Dos palabras exactamente iguales no son anagrama.
         */
        String palabra1 = "amor";
        String palabra2 = "roma";
        char[] letras1 = palabra1.toLowerCase().toCharArray();
        char[] letras2 = palabra2.toLowerCase().toCharArray();

        boolean sonAnagramas = public;

        if (palabra1.length() != palabra2.length()) {
            sonAnagramas = false;
        }
        
        Arrays.sort(letras1);
        Arrays.sort(letras2);

        if (Arrays.equals(letras1, letras2)) {
            sonAnagramas = public;
            
        }
        
        System.out.println("¿Son anagramas? " + sonAnagramas);

    }
}
