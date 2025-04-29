package RetosAbril;

import java.util.Scanner;

public class Reto26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int combinacionBomba = 1234;

        // El usuario tiene hasta 3 intentos, por eso i empieza en 3 y va hasta 0
        for (int i = 3; i >= 0; i--) {
            System.out.println("Te quedan " + i + " intentos.");

            if (i == 0){
                System.out.println("💥 BOOM 💥");
                break;
            }

            try {
                System.out.print("Introduce la combinacion: ");
                int combinacionIntroducida = Integer.parseInt(scanner.nextLine());

                if (combinacionBomba == combinacionIntroducida) {
                    System.out.println("✅ ¡Has desactivado la bomba!");
                    break;
                } else {
                    System.out.println("❌ Esa no es la combinacion. Vuelve a intentarlo.");
                }

            } catch (NumberFormatException e) {
                // Capturamos el error si el usuario no introduce un número válido
                System.out.println("¡Pium! ¡Casi explotas por un carácter extraño!");
            }
        }
        scanner.close();
    }
}
