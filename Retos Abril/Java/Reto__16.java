package RetosAbril;

import java.util.Scanner;

public class Reto16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean estaCalculando = true;

        while (estaCalculando){
            try{
                System.out.print("introduce X: ");
                int x = Integer.parseInt(scanner.nextLine());

                System.out.print("introduce Y: ");
                int y = Integer.parseInt(scanner.nextLine());

                int resultado = calculadora(x, y, scanner);
                System.out.println("Tadá! El resultado es " + resultado);

            }catch (NumberFormatException e){
                System.out.println("Introduce un Numero");
            } catch (ArithmeticException e){
                System.out.println("No puedes dividir entre 0");
            }

            estaCalculando=  seguirCalculando(scanner);

        }
    }

    public static int calculadora(int x, int y, Scanner scanner){
        System.out.print("¿Que operacion quieres hacer? (+,-,/,*)");
        String respuesta =  scanner.nextLine().toUpperCase();
        switch (respuesta){
            case "+" -> { return x + y; }
            case "-" -> { return x - y; }
            case "/" -> { return x / y; }
            case "*" -> { return x * y; }
            default -> System.out.println("Esto " + respuesta +  " no es una operacion");
        }
        return 0;
    }

    public static boolean seguirCalculando(Scanner scanner){
        System.out.print("¿Desea continuar? (S/N): ");
        String respuesta = scanner.nextLine().trim().toUpperCase();

        switch (respuesta) {
            case "S" -> {return true;}
            case "N" -> {
                System.out.println("Saliendo...");
                return false;
            }
            default -> {
                System.out.println("Opción no válida. Elija S o N.");
                return seguirCalculando(scanner);
            }
        }
    }
}
