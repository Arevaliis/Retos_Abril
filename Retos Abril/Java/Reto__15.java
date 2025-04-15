package RetosAbril;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reto15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pattern pattern = Pattern.compile(
                "(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[*?!^“$]).{8,}"
        );

        System.out.println("Introduzca su nueva contraseña: ");
        String contrasenya=  scanner.nextLine();
        Matcher matcher = pattern.matcher(contrasenya);
        boolean esValida = matcher.matches() && !contrasenya.toLowerCase().contains("git");

        System.out.println(esValida ? "Contraseña valida": "Contraseña no valida");
    }
}
