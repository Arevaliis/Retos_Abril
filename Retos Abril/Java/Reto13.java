package RetosAbril;

import java.util.Scanner;

import static java.lang.String.valueOf;

public class Reto13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hora = 0, minutos = 0, segundos = 0;

        try {
            System.out.print("Introduce el numero de segundos que deseas contar: ");
            int tiempo = Integer.parseInt(scanner.nextLine());

            // Construimos el mensaje con formato HH:MM:SS
            for (int i = 0; i < tiempo + 1; i++) {
                String mensaje = String.format("%02d:%02d:%02d", hora, minutos, segundos);

                // Evitamos imprimir cuando se llegue a los 60 segundos exactos (por lógica interna)
                if (i != 60) {
                    System.out.println(mensaje);
                }

                // Actualizamos el tiempo (cada 3600s = 1h, cada 60s = 1min)
                if (i % 3600 == 0 && i != 0){
                    hora++;
                    minutos = 0;
                    segundos = 0;
                } else if (i % 60 == 0 && i != 0) {
                    segundos = 0;
                    minutos++;
                }else{
                    segundos++;
                }
            }
        }catch (NumberFormatException e){
            System.out.println("Debes introducir un numero.");
        }
    }
}
