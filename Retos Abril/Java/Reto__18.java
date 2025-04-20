package RetosAbril;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Reto18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Crear un HashMap para contar los votos de cada candidato
        HashMap<String, Integer> conteoVotos = new HashMap<>();
        conteoVotos.put("coder", 0);
        conteoVotos.put("debugger", 0);
        conteoVotos.put("tester", 0);
        conteoVotos.put("votos invalidos", 0);

        // Ciclo que simula a 5 votantes
        for (int votantes = 0; votantes < 5; votantes++) {
            System.out.println("¿Para quien va su voto?: (\"Coder\", \"Debugger\", \"Tester\") ");
            String voto = scanner.nextLine().toLowerCase();
            int numeroAleatorio = random.nextInt(0, 6);

            // Simula un error aleatorio: si el número aleatorio coincide con el índice del votante
            if (numeroAleatorio == votantes) {
                int totalVotos = conteoVotos.get("votos invalidos");
                conteoVotos.replace("votos invalidos", (++totalVotos));
                System.out.println("¡Error en el conteo! ¡Se descarta este voto!");
            } else {
                // Si no hubo error, verifica si el voto es válido
                if (conteoVotos.containsKey(voto)) {
                    int totalVotos = conteoVotos.get(voto);
                    conteoVotos.replace(voto, (++totalVotos));
                } else {
                    // Si no es un nombre válido, se cuenta como voto inválido
                    int totalVotos = conteoVotos.get("votos invalidos");
                    conteoVotos.replace("votos invalidos", (++totalVotos));
                }
            }
        }

        // Imprime los resultados finales de la votación
        for (String candidato : conteoVotos.keySet()) {
            System.out.println(candidato + ": " + conteoVotos.get(candidato));
        }

        // Cierra el scanner para liberar recursos
        scanner.close();
    }
}

