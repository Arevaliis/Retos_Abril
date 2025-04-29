package RetosAbril;

public class Reto28 {
    public static void main(String[] args) {
        // Declaramos un array de palabras
        String[] palabras = new String[]{"dado", "salas", "pesaje", "oso", "castillo", "rotor", "anilina", "guerra", "alivio", "definicion"};

        // Creamos un array para almacenar las palabras al revés
        String[] palabraAlReves = new String[palabras.length];

        // Bucle para recorrer cada palabra del array "palabras"
        for (int i = 0 ; i < palabras.length ; i++) {
            // Inicializamos una cadena vacía para almacenar la palabra al revés
            String palabraNueva = "";

            // Bucle para recorrer cada carácter de la palabra de atrás hacia adelante
            for (int j = palabras[i].length() - 1; j >= 0 ; j--) {
                // Obtenemos el carácter en la posición "j" de la palabra actual
                String letra = palabras[i];

                // Añadimos el carácter al final de la palabra invertida
                palabraNueva += letra.charAt(j);
            }
            palabraAlReves[i] = palabraNueva;
        }

        // Bucle para recorrer las palabras originales y las invertidas
        for (int i = 0; i < palabraAlReves.length; i++) {
            // Comprobamos si la palabra original es igual a la invertida
            if (palabras[i].equalsIgnoreCase(palabraAlReves[i])){
                // Si son iguales, es un palíndromo, así que imprimimos el mensaje
                System.out.printf("misteriosamente palíndroma: %s !\n", palabras[i] );
            }
        }
    }
}

