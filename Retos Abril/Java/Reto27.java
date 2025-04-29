package RetosAbril;

public class Reto27 {
    public static void main(String[] args) {
        // Declaramos un array de frases cortas, incluyendo dos que contienen la palabra "tesoro"
        String[] frases = new String[]{
                "El sol brilla en el cielo",
                "Buscamos el tesoro escondido",
                "La luna llena ilumina el mar",
                "Un buen libro es un tesoro",
                "Las estrellas llenan la noche de magia",
                "El perro corre feliz por el parque"
        };

        // Iteramos sobre cada frase del array
        for (String frase: frases){
            // Si la frase contiene "tesoro"
            if (frase.toLowerCase().contains("tesoro")){
                System.out.printf("Tesoro encontrado: %s!\n", frase);
            }
        }
    }
}

