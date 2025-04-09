package RetosAbril;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Reto6 {
    public static void main(String[] args) {
        // Creamos el objeto Scanner para leer datos de entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Controla errores de entrada en el Scanner
        try {
            System.out.print("Introduzca el precio del producto: ");
            double precioProducto = Double.parseDouble(scanner.nextLine());

            System.out.print("Introduzca dinero entregado por el cliente: ");
            double dineroCliente = Double.parseDouble(scanner.nextLine());

            // Verificamos si el cliente ha entregado suficiente dinero
            if (dineroCliente > precioProducto) {
                double cantidadDevolver = dineroCliente - precioProducto;
                sistemaDevolucion(cantidadDevolver); // Calculamos y mostramos el desglose del cambio
            } else {
                System.out.println("Dinero insuficiente, te faltan " + (precioProducto - dineroCliente) + "€.");
            }

        } catch (NumberFormatException e) {
            // Capturamos el error si el usuario introduce caracteres no numéricos
            System.out.println("ERROR: Introduzca un número válido.");
        }

        // Cerramos el Scanner
        scanner.close();
    }

    /**
     * Calcula cuántas unidades de cada billete o moneda se deben entregar como cambio
     * @param cantidadDevolver Cantidad total a devolver al cliente
     */
    static void sistemaDevolucion(Double cantidadDevolver) {
        // Lista de valores de billetes y monedas disponibles, ordenados de mayor a menor
        double[] tiposCambio = new double[]{500.00, 200.00, 100.00, 50.00, 20.00, 10.00, 5.00, 2.00, 1.00,
                0.50, 0.20, 0.10, 0.05, 0.02, 0.01};

        // Estructura para almacenar cuántas unidades de cada tipo se deben entregar
        LinkedHashMap<Double, Integer> totalCambio = new LinkedHashMap<>();

        // Calculamos la cantidad de cada tipo de billete/moneda a devolver
        for (int i = 0; i < tiposCambio.length; i++) {
            if (tiposCambio[i] <= cantidadDevolver) {
                double cantidad = cantidadDevolver / tiposCambio[i];
                cantidadDevolver %= tiposCambio[i];
                totalCambio.put(tiposCambio[i], (int) cantidad);
            }
        }

        // Mostramos el mensaje con el desglose del cambio
        imprimirMensajeCambio(totalCambio);
    }

    /**
     * Imprime un mensaje detallado con el desglose del cambio a entregar al cliente
     * @param cambio Mapa con el tipo de billete/moneda y su cantidad correspondiente
     */
    static void imprimirMensajeCambio(LinkedHashMap<Double, Integer> cambio) {
        System.out.println("Tome su cambio:");
        for (Double valor : cambio.keySet()) {
            int cantidad = cambio.get(valor);
            if (cantidad > 0) {
                String tipo = valor >= 5 ? "billete" : "moneda";
                String plural = cantidad > 1 ? "s" : "";
                System.out.printf("- %d %s%s de %.2f€%n", cantidad, tipo, plural, valor);
            }
        }
    }
}
