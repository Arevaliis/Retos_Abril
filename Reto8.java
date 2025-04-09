package RetosAbril;

import java.util.Scanner;

public class Reto8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        mensajePersonalizado(ingresarNombre(scanner));
        scanner.close(); // Cerramos el scanner al final para liberar recursos
    }

    /**
     * Solicita al usuario que introduzca su nombre y lo convierte a mayúsculas.
     *
     * @param scanner Scanner para leer la entrada del usuario
     * @return El nombre introducido en mayúsculas
     */
    static String ingresarNombre(Scanner scanner){
        System.out.println("Introduzca su nombre: ");
        String nombre = scanner.nextLine().toUpperCase();
        return nombre.charAt(0) + nombre.substring(1).toLowerCase(); // Convertimos el nombre en mayúsculas al formato convencional.
    }

    /**
     * Imprime un mensaje personalizado en función del nombre del usuario.
     * Si el nombre empieza por 'A' y tiene más de 7 letras, muestra un mensaje especial.
     * Si solo tiene más de 7 letras, muestra otro mensaje.
     * En otros casos, un saludo estándar.
     *
     * @param nombre Nombre del usuario en mayúsculas
     */
    static void mensajePersonalizado(String nombre){
        if (nombre.charAt(0) == 'A' && nombre.length() > 7)
            System.out.printf("¡Hola, Asombroso/a %s! ¡Qué nombre tan largo y sofisticado!%n", nombre);
        else if (nombre.length() > 7)
            System.out.printf("¡Vaya, %s, qué nombre tan largo y sofisticado!%n", nombre);
        else
            System.out.printf("Saludos, %s%n", nombre);
    }
}
