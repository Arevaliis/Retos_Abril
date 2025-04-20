package RetosAbril;

import java.util.LinkedList;
import java.util.Scanner;

public class Reto17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            LinkedList<String>  poema = crearPoema(scanner);
            comprobandoTotalLineasPoema(poema);
            calculandoPuntuacion(poema);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        scanner.close();
    }

    /**
     * Solicita al usuario que escriba varias líneas de un poema, mostrando previamente
     * una regla que debe cumplir cada línea. El usuario decide cuándo dejar de escribir.
     *
     * @param scanner Objeto Scanner para capturar la entrada del usuario.
     * @return Lista enlazada con las líneas del poema ingresadas por el usuario.
     */
    public static LinkedList<String> crearPoema(Scanner scanner){
        LinkedList<String> poema = new LinkedList<>();
        String[] reglas = new String[4];
        boolean estaEscribiendo = true;
        int numeroRegla = 0;

        reglas[0] = "Debe tener exactamente 5 palabras";
        reglas[1] = "Debe contener la letra 'z' al menos una vez";
        reglas[2] = "Debe tener más vocales que consonantes";
        reglas[3] = "Debe terminar con la misma palabra con la que empezó la primera línea";

        while (estaEscribiendo){

            if (numeroRegla < 4){
                System.out.print(reglas[numeroRegla++]);
            }

            System.out.print(". Escriba una linea de su poema: ");
            String linea = scanner.nextLine();
            poema.add(linea);
            estaEscribiendo = seguirEscribiendo(scanner);
        }
        return poema;
    }

    /**
     * Imprime por pantalla las líneas del poema proporcionadas por el usuario.
     *
     * @param poema Lista enlazada que contiene las líneas del poema.
     */
    public static void mostrarPoema(LinkedList<String> poema){
        for(String linea: poema){
            System.out.println(linea);
        }
    }

    /**
     * Pregunta al usuario si desea seguir escribiendo su poema.
     *
     * @param scanner Objeto Scanner para capturar la respuesta del usuario.
     * @return true si el usuario desea seguir escribiendo, false en caso contrario.
     */
    public static Boolean seguirEscribiendo(Scanner scanner){
        System.out.print("Seguir escribiendo: (S/N)");
        String respuesta = scanner.nextLine().toUpperCase();
        if (respuesta.equals("S")) {
            return true;
        }
        System.out.println("Poema Terminado.");
        return false;
    }

    /**
     * Verifica que el poema contenga al menos cuatro líneas. Si no es así, lanza una excepción.
     *
     * @param poema Lista enlazada que contiene las líneas del poema.
     * @throws Exception si el poema contiene menos de 4 líneas.
     */
    public static void comprobandoTotalLineasPoema(LinkedList<String> poema) throws Exception{
        if ( poema.size() < 4){
            throw new Exception("El poema debe contener al menos 4 lineas.");
        } else{
            mostrarPoema(poema);
        }
    }

    /**
     * Verifica si la primera línea del poema contiene exactamente 5 palabras.
     *
     * @param poema Lista enlazada que contiene las líneas del poema.
     * @return 1 punto si la primera línea tiene exactamente 5 palabras, 0 en caso contrario.
     */
    public static int contandoPalabras(LinkedList<String> poema){
        String[] linea1 = poema.getFirst().split(" ");
        if (linea1.length == 5){
            System.out.println("Contiene exactamente 5 palabras. Genial !!");
            return 1;
        } else if (linea1.length > 5) {
            System.out.println("Demasiadas palabras para mi gusto!!");
            return 0;
        }else {
            System.out.println("Pocas palabras para mi gusto.");
            return 0;
        }
    }

    /**
     * Verifica si la segunda línea del poema contiene al menos una letra 'z', sin importar mayúsculas.
     *
     * @param poema Lista enlazada que contiene las líneas del poema.
     * @return 1 punto si contiene la letra 'z', 0 si no la contiene.
     */
    public static int contieneZ(LinkedList<String> poema){
        String linea2 = poema.get(1).toUpperCase();
        if ( linea2.contains("Z")){
            System.out.println("Asombroso. Tu linea 2 contiene la Z.");
            return 1;
        }else {
            System.out.println("¡Le falta un toque de 'z'!");
            return 0;
        }
    }

    /**
     * Compara la cantidad de vocales y consonantes en la tercera línea del poema.
     *
     * @param poema Lista enlazada que contiene las líneas del poema.
     * @return 1 punto si hay más vocales que consonantes, 0 en caso contrario.
     */
    public static int comparandoVocalesConsonantes(LinkedList<String> poema){
        String linea3 = poema.get(2).toUpperCase();
        int totalVocales = 0;
        int totalConsonantes = 0;

        for (int letra = 0; letra < linea3.length(); letra++) {
            if ("aeiou".contains(linea3.substring(letra))){
                totalVocales++;
            }else{
                totalConsonantes++;
            }
        }

        if ( totalVocales> totalConsonantes){
            System.out.println("Ganan las Vocales!!");
            return 1;
        } else{
            System.out.println("Ganan las consonates. No me gusta!!");
            return 0;
        }
    }

    /**
     * Verifica si la cuarta línea del poema comienza y termina con la misma palabra.
     *
     * @param poema Lista enlazada que contiene las líneas del poema.
     * @return 1 punto si la primera y última palabra son iguales (ignorando mayúsculas), 0 en caso contrario.
     */
    public static int mismoInicioFinal(LinkedList<String> poema){
        String[] linea4 = poema.get(3).split(" ");
        String inicio = linea4[0];
        String termina = linea4[linea4.length - 1];
        if (inicio.equalsIgnoreCase(termina) && linea4.length >= 2){
            System.out.println("Fabuloso. Tu ultima linea termina igual que empieza!");
            return 1;
        } else {
            System.out.println("No cumples con las reglas.");
            return 0;
        }
    }

    /**
     * Calcula la puntuación total del poema evaluando el cumplimiento de cuatro reglas.
     * Muestra por pantalla la puntuación total obtenida.
     *
     * @param poema Lista enlazada que representa las líneas del poema ingresado por el usuario.
     */
    public static void calculandoPuntuacion(LinkedList<String> poema){
        int puntuacion = contandoPalabras(poema) + contieneZ(poema) + comparandoVocalesConsonantes(poema) + mismoInicioFinal(poema);
        System.out.println("Total puntuacion: " + puntuacion);
    }
}
