package RetosAbril;

import javax.swing.*;
import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args) {
        // Inicializamos el objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Captura el error si el usuario introduce un valor que no es un número
        try {
            // Panel para introducir la nota
            double nota = Float.parseFloat(JOptionPane.showInputDialog("Introduce la nota del alumno"));

            // Nota redondeada al entero mas proximo
            double notaRedondeada = Math.round(nota);

            // Imprimimos la nota del alumno como un número entero
            System.out.println("Nota alumno: " + (int) notaRedondeada);

            // Captura la excepción e imprime un mensaje más descriptivo del problema
        } catch (NumberFormatException e) {
            System.out.println("Debe introducir un NUMERO.");
        }

        // Cierra el objeto Scanner para liberar recursos
        scanner.close();
    }
}
