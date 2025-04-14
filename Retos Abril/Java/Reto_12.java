package RetosAbril;

import java.util.ArrayList;
import java.util.Scanner;

public class Reto12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numero_suerte = new ArrayList<>(); // Lista para almacenar los números de la suerte
        boolean estaFuncionando = true;

        // Bucle principal que ejecuta el programa mientras el usuario desee continuar
        while (estaFuncionando){
            try {
                estaFuncionando = sigueFuncionando(scanner, numero_suerte);
            } catch (NumberFormatException e){
                System.out.println("Introduzca un número.");
            }
        }
        scanner.close();
    }

    /**
     * Verifica si el número ingresado es múltiplo de 7 y si no ha sido introducido antes.
     * @param scanner Objeto Scanner para leer datos del usuario.
     * @param numeros_suerte Lista de números mágicos.
     * @return true si el usuario quiere continuar, false si desea salir.
     */
    static Boolean sigueFuncionando(Scanner scanner, ArrayList numeros_suerte ){
        System.out.print("Dime un número: ");
        int numero = Integer.parseInt(scanner.nextLine());

        if (numero % 7 == 0 && !numeros_suerte.contains(numero)){
            System.out.println("El número " + numero + " es un número de la suerte.");
            numeros_suerte.add(numero);
        } else {
            System.out.println("El número " + numero + " no es un número de la suerte.");
        }

        return deseaSeguir(scanner, numeros_suerte);
    }

    /**
     * Pregunta al usuario si desea continuar y actúa en consecuencia.
     * @param scanner Objeto Scanner para leer la respuesta.
     * @param numeros_suerte Lista de números mágicos hasta el momento.
     * @return true si el usuario desea continuar, false si desea salir.
     */
    static boolean deseaSeguir(Scanner scanner, ArrayList numeros_suerte){
        System.out.print("¿Desea continuar? (S/N): ");
        String respuesta = scanner.nextLine().trim().toUpperCase();
        switch (respuesta){
            case "S" -> {
                return true;
            }
            case "N" -> {
                System.out.println("Saliendo...");
                imprimirNumerosMagicos(numeros_suerte); // Termina el programa e imprime los numero magicos
                return false;
            }
            default -> {
                System.out.print("Elija S o N.");
                return deseaSeguir(scanner, numeros_suerte);
            }
        }
    }

    /**
     * Imprime todos los números mágicos.
     * @param numeros_suerte Lista con los números mágicos.
     */
    public static void imprimirNumerosMagicos(ArrayList numeros_suerte){
        String mensaje = "\nHemos obtenido un total de " + numeros_suerte.size() + " números mágicos. Son ";
        for (Object numeros: numeros_suerte){
            mensaje += numeros + ", ";
        }
        // Elimina la última coma y espacio, y añade un punto final
        System.out.println(mensaje.substring(0, mensaje.length() - 2) + ".");
    }
}
