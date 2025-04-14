package RetosAbril;

import java.util.Scanner;

public class Reto10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try{
            preparando_pedido(scanner); // Obtenemos los datos del pedido en función de las cajas pedidas
        }catch (NumberFormatException e){
            System.out.println("Debe introducir un numero.");
        }
        scanner.close();
    }

    /**
     * En funcion de las cajas pedidas por el usuario obtenemos unos parametros para el pedido
     * @param scanner  Scanner para leer la cantidad de cajas pedidas por el usuario
     */
    public static void preparando_pedido(Scanner scanner){
        System.out.print("¿Cuantos paquetes quiere?: ");
        int totalPaquetesUsuario = Integer.parseInt(scanner.nextLine());
        
        if (totalPaquetesUsuario < 5) { // Caso menos de 5 cajas
            System.out.println("Debe comprar al menos 5 paquetes");
        } else if (totalPaquetesUsuario < 15) { // Caso menos de 15 cajas. Gastos de envio = 10
            imprimirTicket(totalPaquetesUsuario, 10);
        } else if (totalPaquetesUsuario < 19) { // Caso gasto menos a 120 (19 cajas). No opta promocion
            System.out.println("No puedes optar a las promociones, te faltan "+ (120 - (totalPaquetesUsuario * 6) + "€."));
            imprimirTicket(totalPaquetesUsuario, 0);
        } else if (totalPaquetesUsuario < 41) { // Caso gasto menor de 250 (41 cajas). Promocion 5% descuento
            imprimirTicket(totalPaquetesUsuario, 0, 5);
        } else{ // Caso mas de 250€. Promocion 10% descuento
            imprimirTicket(totalPaquetesUsuario, 0, 10);
        }
    }

    /**
     * Imprime un ticket de compra sin promoción.
     * @param cajas Total de cajas ingresadas mediante Scanner por el Usuario
     * @param gastosEnvio Gastos de envio en el pedido 10 o 0.
     */
    public static void imprimirTicket(int cajas, int gastosEnvio) {
        double total = (cajas * 6 + gastosEnvio);

        System.out.printf("""
           -------------------------------
            ****** Ticket de Compra ******
            -------------------------------
            Numero total de cajas: %d
            Gastos de envio: %d€
            Promoción: 0%%
            --------------------------------
            Total de la compra: %.2f€
            --------------------------------
            """, cajas, gastosEnvio, total);
    }

    /**
     * Método sobrecargado que imprime un ticket de compra aplicando una promoción.
     * @param cajas Número total de cajas compradas.
     * @param gastosEnvio Gastos de envío aplicados (0€ o 10€).
     * @param promocion Porcentaje de descuento aplicado sobre el total (por ejemplo, 5 o 10).
     */

    public static void imprimirTicket(int cajas, int gastosEnvio, float promocion) {
        double total = (cajas * 6 + gastosEnvio) * (1.00 - (promocion/100));

        System.out.printf("""
           -------------------------------
            ****** Ticket de Compra ******
            -------------------------------
            Numero total de cajas: %d
            Gastos de envio: %d€
            Promoción: %.0f%%
            --------------------------------
            Total de la compra: %.2f€
            --------------------------------
            """, cajas, gastosEnvio, promocion, total);
    }
}
