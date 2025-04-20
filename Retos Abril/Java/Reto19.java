package RetosAbril;

import java.util.Scanner;

public class Reto19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String PIN = "1111";
        int saldo = 10000;
        int intentos = 3;
        boolean estaFuncionando = true;

        while (intentos > 0 && estaFuncionando){
            System.out.print("Introduzca el PIN: ");
            String intento = scanner.nextLine();

            if (PIN.equals(intento)) {
                while (estaFuncionando) {
                    mostrarMenu();
                    saldo = accionUsuario(elegirAccion(scanner), scanner, saldo);
                    estaFuncionando = seguirFuncionado(scanner);
                }
            } else {
                System.out.println("Le quedan " + --intentos + " intentos.");
                if (intentos == 0){
                    System.out.println("Cuenta Bloqueada");
                }
            }
        }
    }

    /**
     * Muestra el menú principal del cajero automático con las opciones disponibles.
     */
    public static void mostrarMenu(){
        System.out.println("""
                ****** Menu Banco ****
                
                    1. Consultar Saldo
                    2. Retirar Fondos
                    3. Salir
                **********************
                """);
    }

    /**
     * Solicita al usuario una opción del menú y la devuelve como entero.
     *
     * @param scanner Objeto Scanner para leer la entrada del usuario.
     * @return La opción elegida por el usuario.
     */
    public static int elegirAccion(Scanner scanner){
        System.out.print("Elija una opción: ");
        return Integer.parseInt(scanner.nextLine());
    }

    /**
     * Ejecuta la acción correspondiente según la opción seleccionada por el usuario.
     *
     * @param opcionUsuario Opción seleccionada del menú.
     * @param scanner Objeto Scanner para leer entradas adicionales.
     * @param saldo Saldo actual de la cuenta.
     * @return El saldo actualizado tras ejecutar la acción.
     */
    public static int accionUsuario(int opcionUsuario, Scanner scanner, int saldo) {
        switch (opcionUsuario) {
            case 1 -> consultarSaldo(saldo);
            case 2 -> saldo = retirarFondos(saldo, scanner);
            default -> {
                System.out.println("Introduzca una opción válida.");
                accionUsuario(opcionUsuario, scanner, saldo);
            }
        }
        return saldo;
    }

    /**
     * Muestra el saldo actual del usuario.
     *
     * @param saldo Saldo actual disponible.
     */
    public static void consultarSaldo(int saldo){
        System.out.println("Dispone de un saldo de: " + saldo + "€.");
    }

    /**
     * Permite al usuario retirar fondos si dispone de saldo suficiente.
     *
     * @param saldo Saldo actual del usuario.
     * @param scanner Objeto Scanner para leer la cantidad a retirar.
     * @return El saldo actualizado tras la retirada.
     */
    public static int retirarFondos(int saldo, Scanner scanner){
        try {
            System.out.println("¿Cuanto dinero desea retirar?: ");
            int dineroRetirado = Integer.parseInt(scanner.nextLine());

            if ((saldo - dineroRetirado) >= 0){
                saldo -= dineroRetirado;
                System.out.println("Su saldo es de " + saldo + "€.");
            } else {
                System.out.println("No dispone de tanto dinero");
            }

        } catch (NumberFormatException e) {
            System.out.println("Introduzca Números.");
        }
        return saldo;
    }

    /**
     * Pregunta al usuario si desea realizar otra operación.
     *
     * @param scanner Objeto Scanner para leer la respuesta del usuario.
     * @return true si desea continuar, false si desea salir.
     */
    public static boolean seguirFuncionado(Scanner scanner){
        System.out.print("¿Quieres hacer algo mas?: (S/N)");
        String respuesta = scanner.nextLine().toUpperCase();
        if (respuesta.equals("S")) {
            return true;
        }
        System.out.println("Saliendo...");
        return false;
    }
}
