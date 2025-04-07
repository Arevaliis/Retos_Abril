package RetosAbril;

public class Reto5 {
    public static void main(String[] args) {
        String exclamaciones = "¡ ¡ ¡ H o l a  M u n d o ! ! !";
        int contador1 = 0, contador2 = 0;

        for (int i = 0; i < exclamaciones.length(); i++) {
            if (exclamaciones.charAt(i) == '!') contador1++;
            if (exclamaciones.charAt(i) == '¡')  contador2++;
        }
        System.out.println("Contiene el mismo numero de exclamaciones al principio y al final: " +
                ((contador1 == contador2) ? "Si": "No"));
    }
}
