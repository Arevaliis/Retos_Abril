package RetosAbril;

import java.util.Arrays;
import java.util.Scanner;

public class Reto20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Listas de ingredientes que el robot ya conoce o que tienen propiedades mágicas
        String [] ingredientesConocidos = new String[]{"tomate", "cebolla", "ajo"};
        String [] ingredientesSecretos = new String[]{"polvo de hadas", "lágrimas de unicornio"};

        // Contadores para llevar registro del tipo de ingredientes ingresados
        int conocidos = 0, secretos = 0, desconocidos = 0;

        // Bucle para pedir 5 ingredientes al usuario
        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce un Ingrediente: ");
            String ingrediente = scanner.nextLine();

            // Verifica si el ingrediente está en la lista de conocidos
            if (Arrays.asList(ingredientesConocidos).contains(ingrediente)){
                System.out.println("¡Excelente elección!");
                conocidos++;
            } else if (Arrays.asList(ingredientesSecretos).contains(ingrediente)) {
                // Verifica si está en la lista de ingredientes mágicos (con try-catch simulado)
                try {
                    throw new Exception("Ingrediente mágico detectado");
                } catch (Exception e) {
                    System.out.println(e.getMessage() + "\n¡Chispas! ¡Este ingrediente tiene propiedades mágicas!");
                    secretos++;
                }
            }else {
                // Si no está en ninguna lista, se considera desconocido
                System.out.println("¿Qué es eso? ¡No tengo ni idea de cómo usarlo!");
                desconocidos++;
            }
        }
        System.out.printf("\nTotal ingredientes desconocidos: %d" +
                          "\nTotal ingredientes conocidos: %d" +
                          "\nTotal ingredientes mágicos: %d\n",
                           desconocidos, conocidos, secretos);
    }
}
