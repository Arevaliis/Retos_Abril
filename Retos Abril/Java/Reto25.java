package RetosAbril;

import java.util.ArrayList;
import java.util.Scanner;

public class Reto25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> flores = new ArrayList<>();

        // Bucle para pedir nombres de flores hasta que el usuario diga que no ingresar mas flores
        while (true) {
            System.out.print("Dime el nombre de una flor: ");
            String flor = scanner.nextLine();

            // Añadimos el nombre introducido a la lista
            flores.add(flor);

            // Preguntamos si quiere ingresar otra flor
            System.out.print("¿Desea ingresar otra flor más? (SI/NO): ");
            String respuesta = scanner.nextLine();

            // Si la respuesta no es "si", salimos del bucle
            if (!respuesta.equalsIgnoreCase("si")) {
                break;
            }
        }

        // Bucle for-each para recorrer cada flor ingresada
        for (String flor : flores) {

            // Si la longitud del nombre de la flor es menor a 4 letras
            if (flor.length() < 4) {
                System.out.println(flor + " es una palabra marchita");

                try {
                    // Intentamos acceder a la cuarta letra (índice 3)
                    // Esto lanzará una excepción si la palabra tiene menos de 4 letras
                    flor.charAt(3);
                } catch (StringIndexOutOfBoundsException e) {
                    // Capturamos la excepción y mostramos un mensaje divertido
                    System.out.println("¡Tan corta que ni siquiera tiene una cuarta letra para oler!");
                }
            }
        }
        scanner.close();
    }
}

