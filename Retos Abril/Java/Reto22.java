package RetosAbril;

import java.util.Random;
import java.util.Scanner;

public class Reto22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Lista de canciones y pistas asociadas
        String[] canciones = {
                "Yellow Submarine",
                "Bohemian Rhapsody",
                "Imagine",
                "Billie Jean",
                "Hotel California"
        };

        String[] pistas = {
                "Tiene algo que ver con un color primario y un vehículo acuático... creo.",
                "Es una especie de ópera que no entenderás del todo.",
                "Cierra los ojos... ahora imagina un mundo mejor.",
                "Una canción que hizo que la gente se preguntara quién era Billie.",
                "Podrías registrarte para siempre, pero nunca marcharte realmente..."
        };

        // Selección aleatoria de canción y pista
        int indiceAleatorio = random.nextInt(canciones.length);
        String cancion = canciones[indiceAleatorio].toLowerCase();
        String pista = pistas[indiceAleatorio];

        Boolean estaFuncionando = true;

        // Bucle con 5 intentos (de 4 a 0)
        for (int vidas = 4; vidas >= 0; vidas--) {
            if (estaFuncionando && vidas > 0){
                System.out.print("Total de vidas: " + vidas + ". ¿En que cancion estoy pensando?: ");
                try {
                    String respuesta = scanner.nextLine().trim().toLowerCase();

                    // Validar que no contenga números
                    if (respuesta.matches(".*\\d.*")) {
                        throw new Exception("Error: No valen numeros!!");
                    }

                    // Si acierta, termina el juego
                    if (respuesta.equalsIgnoreCase(cancion)){
                        System.out.println("Has acertado la cancion !!");
                        estaFuncionando = false;
                    }
                    // Si falla y aún tiene vidas
                    else if (vidas > 1) {
                        System.out.println("Has fallado. Aqui tienes una pista: " + pista);
                    }
                    // Último intento fallido
                    else {
                        System.out.print("Fallaste");
                    }
                } catch (Exception e) {
                    System.out.println("¡Eso no suena como el título de una canción!");
                }
            }
            // Si se acaban las vidas
            else if (vidas == 0 && estaFuncionando) {
                System.out.print(". Te quedastes sin vidas. La cancion era: " + cancion);
            }
        }
    }
}
