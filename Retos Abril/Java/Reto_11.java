package RetosAbril;

import java.util.Random;
import java.util.Scanner;

public class Reto11 {
    public static void main(String[] args) {
        // Instanciamos las clases Random y Scanner para generar números aleatorios y leer la entrada del usuario
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Array con nombres de lenguajes de programación
        String[] lenguajes = new String[]{
                "Python", "C", "C++", "Java", "JavaScript",
                "Ruby", "Go", "Swift", "Kotlin", "PHP",
                "TypeScript", "Rust", "Perl", "Scala", "Haskell",
                "R", "Dart", "Elixir", "MATLAB", "Objective-C"
        };

        // Número de intentos (vidas) que tiene el usuario
        int vidas = 5;

        // Seleccionamos aleatoriamente un lenguaje del array
        String palabra_elegida = lenguajes[random.nextInt(0, lenguajes.length - 1)];
        boolean estaFuncionando = true;

        // Bucle principal del juego
        while (estaFuncionando) {

            if (vidas > 0) {
                // Solicitamos al usuario que adivine el lenguaje de programación
                System.out.print("Dime el lenguaje de programación en el que estoy pensando: ");
                String lenguajeProgramacion = scanner.nextLine();

                // Comprobamos si la respuesta del usuario es correcta (ignorando mayúsculas/minúsculas)
                if (lenguajeProgramacion.equalsIgnoreCase(palabra_elegida)) {
                    estaFuncionando = false;
                    System.out.println("¡Has acertado la palabra!");
                } else {
                    --vidas;
                    System.out.println("Has fallado. Te quedan " + vidas + " vidas.");
                }

            } else {
                // Si se acaban las vidas, mostramos el mensaje de fin de juego y salimos del bucle
                System.out.println("Game Over. La palabra que había elegido era: " + palabra_elegida);
                estaFuncionando = false;
            }
        }

        // Cerramos el scanner para liberar recursos
        scanner.close();
    }
}

