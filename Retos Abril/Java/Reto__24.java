package RetosAbril;

import java.util.Scanner;

public class Reto24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array con las preguntas del cuestionario (tipo test con 3 opciones)
        String[] preguntas = new String[]{
                "¿Cuál es la capital de Francia?\na) Berlín\nb) Madrid\nc) París",
                "¿Cuál es el resultado de 3 * 4?\na) 7\nb) 12\nc) 9",
                "¿Qué lenguaje se usa para análisis de datos?\na) Python\nb) HTML\nc) CSS"
        };

        // Respuestas correctas correspondientes a cada pregunta
        String[] respuestas = new String[]{"c", "b", "a"};

        // Inicializa la puntuación del usuario
        double puntuacion = 0.00;

        // Bucle que recorre cada pregunta
        for (int i = 0; i < preguntas.length; i++) {
            System.out.println(preguntas[i]); // Muestra la pregunta actual
            System.out.print("Respuesta: ");
            String opcionUsuario = scanner.nextLine().trim(); // Lee la respuesta del usuario (sin espacios extra)

            try {
                // Verifica que la opción del usuario sea válida (a, b o c)
                verificarRespuesta(opcionUsuario);
            } catch (IllegalArgumentException e) {
                // Si la respuesta no es válida, se lanza y captura una excepción mostrando el mensaje de error
                System.out.println(e.getMessage());
            }

            // Si la respuesta es correcta, suma 1 punto
            if (respuestas[i].equalsIgnoreCase(opcionUsuario)) {
                puntuacion += 1.00;
            // Si la respuesta no es correcta pero es válida (a, b o c), suma 0.5
            } else if (opcionUsuario.matches("[abc]")) {
                puntuacion += 0.50;
            }
        }
        scanner.close();

        // Muestra la nota final del examen
        System.out.println("Nota examen: " + puntuacion);
    }

    /**
     * Método que verifica si la respuesta es válida.
     * Solo se aceptan las letras a, b o c (minúsculas o mayúsculas).
     * Si no cumple, lanza una excepción.
     */
    public static void verificarRespuesta(String respuesta) throws IllegalArgumentException {
        if (respuesta.matches("[^abc]")) {
            throw new IllegalArgumentException("Debe contestar con a, b o c.");
        }
    }
}
