package RetosAbril;

import java.util.Random;
import java.util.Scanner;

public class Reto21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Variables para las puntuaciones de cada casa de personalidad
        int aventurero = 0, reflexivo = 0, social = 0;

        // Array con las 3 preguntas del test
        String [] preguntas = new String[]{
                "¿Que prefieres comer, dormir o bailar?",
                "¿Mejor club de futbol? (Madrid, Barca o Juventus)",
                "¿Animal de compañia? (Perro, Gato o Serpiente)"
        };

        // Bucle que recorre cada pregunta
        for (int i = 0; i < preguntas.length; i++) {
            try {
                // Muestra la pregunta y recoge la respuesta del usuario
                System.out.print(preguntas[i] + ": (1/2/3) ");
                int respuesta = Integer.parseInt(scanner.nextLine());

                // Asigna puntos a cada casa según la opción elegida
                switch (respuesta) {
                    case 1 -> aventurero += 3;
                    case 2 -> reflexivo++;
                    case 3 -> social += 2;
                    default -> {
                        // Si la opción no es válida, lanza excepción controlada
                        try {
                            throw new RuntimeException("Opcion no valida. ");
                        } catch (Exception e) {
                            System.out.println(e.getMessage() + "Puntuación aleatoria.");
                            // Asigna puntos aleatorios a una casa
                            int numeroAleatorio = random.nextInt(0, 3);
                            if (numeroAleatorio > 1) {
                                aventurero += numeroAleatorio;
                            } else if (numeroAleatorio == 1) {
                                social += numeroAleatorio;
                            }
                        }
                    }
                }
            } catch (NumberFormatException e) {
                // Si el usuario no introduce un número válido, asigna puntuación aleatoria
                System.out.println("Introduce un numero. Puntuación aleatoria.");
                int numeroAleatorio = random.nextInt(0, 3);
                if (numeroAleatorio > 1){
                    aventurero += numeroAleatorio;
                } else if (numeroAleatorio == 1) {
                    social += numeroAleatorio;
                }
            }
        }

        // Determina y muestra la casa ganadora según las puntuaciones
        if (aventurero >= reflexivo && aventurero >= social){
            System.out.println("Eres un aventurero!!");
        } else if (social >= aventurero) {
            System.out.println("Eres muy Social!");
        } else {
            System.out.println("Eres un reflexivo!");
        }
    }
}

