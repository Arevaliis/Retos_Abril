package RetosAbril;

import java.util.Random;
import java.util.Scanner;

public class Reto7 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Simula la carrera entre caracoles
        int[] resultado = desarrolloCarrera(20, random, scanner);

        // Calcula la mayor distancia recorrida
        int numeroMasGrande = mayorDistanciaRecorrida(resultado);

        // Anuncia al ganador o ganadores
        campeonCarrera(resultado, numeroMasGrande);
    }

    /**
     * Simula la carrera de los caracoles.
     * Cada caracol avanza entre 1 y 5 unidades por vuelta.
     *
     * @param vueltas Número total de vueltas de la carrera.
     * @param random Objeto Random para generar movimientos aleatorios.
     * @param scanner Objeto Scanner para leer el número de participantes.
     * @return  Matriz que contiene las distancias finales recorridas por cada caracol.
     */
    static int[] desarrolloCarrera(int vueltas, Random random, Scanner scanner){
        System.out.print("¿Cuántos caracoles participan?: ");
        int participantes = Integer.parseInt(scanner.nextLine());
        int[] resultado = new int[participantes];

        for (int participante = 0; participante < participantes; participante++) {
            for (int i = 1; i < vueltas + 1; i++) {
                resultado[participante] += random.nextInt(1, 6);
            }
        }

        return resultado;
    }

    /**
     * Determina la mayor distancia recorrida entre todos los caracoles.
     *
     * @param resultado Matriz con las distancias recorridas por cada caracol.
     * @return La distancia máxima recorrida.
     */
    static int mayorDistanciaRecorrida(int[] resultado){
        int mayorDistanciaRecorrida = 0;
        for (int numeroMayor : resultado){
            if (numeroMayor > mayorDistanciaRecorrida){
                mayorDistanciaRecorrida = numeroMayor;
            }
        }
        return mayorDistanciaRecorrida;
    }

    /**
     * Anuncia el o los ganadores de la carrera.
     *
     * @param resultado Arreglo con las distancias recorridas por cada caracol.
     * @param mayorDistanciaRecorrida La distancia más alta alcanzada por algún caracol.
     */
    static void campeonCarrera(int[] resultado, int mayorDistanciaRecorrida){
        String ganador = "";

        for (int i = 0; i < resultado.length; i++) {
            // Si el resultado del caracol es igual a la mayor distancia lo añade a los campeones
            if (resultado[i] == mayorDistanciaRecorrida){
                ganador += "Caracol_" + (i + 1) + ", "; // Va concatenando campeones
            }
        }
        System.out.println("El/Los ganadores son: " + ganador.substring(0, ganador.length() - 2) + ".");
    }
}
