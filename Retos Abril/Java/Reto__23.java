package RetosAbril;

import java.util.Scanner;

public class Reto23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dime una palabra: ");
        String palabra1 = scanner.nextLine();
        System.out.print("Dime una palabra: ");
        String palabra2 = scanner.nextLine();

        try {
            verificarPalabras(palabra1, palabra2);
            boolean riman = palabra1.substring(palabra1.length() - 2)
                                    .equalsIgnoreCase(palabra2.substring(palabra2.length() - 2));
            System.out.println((riman) ? "¡Estas palabras riman!" : "¡No riman!");

        } catch (StringIndexOutOfBoundsException e) {
            // Se lanza si alguna palabra tiene menos de 2 letras
            System.out.println("¡Necesito al menos dos letras para rimar!");
        } catch (IllegalArgumentException e) {
            // Se lanza si alguna palabra contiene caracteres no válidos (números, símbolos, etc.)
            System.out.println(e.getMessage());
        }
        scanner.close();
    }

    /**
     * Método que verifica si ambas palabras contienen solo letras.
     * Si alguna no lo cumple, lanza una excepción.
     */
    public static void verificarPalabras(String palabra1, String palabra2) throws IllegalArgumentException {
        if (!palabra1.matches("^[a-zA-Z]+$") || !palabra2.matches("^[a-zA-Z]+$")) {
            throw new IllegalArgumentException("¿Eso se considera una palabra?");
        }
    }
}
