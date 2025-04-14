package RetosAbril;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Reto14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random  = new Random();
        ArrayList<String> preguntas_respuestas = new ArrayList<>();
        boolean seguirRepasando = true;

        // Agrega preguntas y respuestas en formato "pregunta_respuesta"
        ingresarPregunta(preguntas_respuestas, "¿Qué es una variable?: Es un espacio en memoria para guardar datos");
        ingresarPregunta(preguntas_respuestas, "¿Qué hace un bucle for?: Itera sobre una secuencia de elementos");
        ingresarPregunta(preguntas_respuestas, "¿Qué es una función?: Un bloque de código reutilizable");
        ingresarPregunta(preguntas_respuestas, "¿Qué es una lista?: Una colección ordenada y mutable de elementos");
        ingresarPregunta(preguntas_respuestas, "¿Qué es un diccionario?: Una colección de pares clave-valor");

        // Bucle principal de repaso
        while (seguirRepasando) {
            // Selecciona una pregunta aleatoria
            String eleccion = preguntas_respuestas.get(random.nextInt(0, preguntas_respuestas.size()));
            String[] partes = eleccion.split(":");  // Divide en pregunta y respuesta
            String pregunta = partes[0];
            String respuestaCorrecta = partes[1];

            System.out.print(pregunta + ": ");
            String respuestaAlumno = scanner.nextLine().trim().toLowerCase();  // Normaliza entrada del usuario

            // Verifica si la respuesta es correcta
            if (respuestaAlumno.equals(respuestaCorrecta.trim().toLowerCase())) {
                System.out.println("Has acertado!!");
            } else {
                System.out.println("Has fallado. La respuesta era: " + respuestaCorrecta);
            }

            // Pregunta al usuario si desea seguir
            seguirRepasando = deseaSeguir(scanner);
        }
    }

    /**
     * Añade una nueva entrada al temario con el formato "pregunta_respuesta".
     * @param temario Lista de preguntas y respuestas.
     * @param pregunta_respuesta Cadena que contiene la pregunta y su respuesta separadas por un guion bajo.
     */
    public static void ingresarPregunta(ArrayList<String> temario, String pregunta_respuesta) {
        temario.add(pregunta_respuesta);
    }

    /**
     * Pregunta al usuario si desea continuar repasando.
     * @param scanner Objeto Scanner para leer la respuesta del usuario.
     * @return true si el usuario quiere seguir, false si quiere salir.
     */
    static boolean deseaSeguir(Scanner scanner) {
        System.out.print("¿Desea continuar? (S/N): ");
        String respuesta = scanner.nextLine().trim().toUpperCase();

        switch (respuesta) {
            case "S" -> {
                return true;
            }
            case "N" -> {
                System.out.println("Saliendo...");
                return false;
            }
            default -> {
                System.out.println("Opción no válida. Elija S o N.");
                return deseaSeguir(scanner);  // Llamada recursiva para volver a preguntar
            }
        }
    }
}


