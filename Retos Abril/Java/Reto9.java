package RetosAbril;

public class Reto9 {
    public static void main(String[] args) {
        final int DIAS_CLASE = 30;

        for (int i = 1; i < DIAS_CLASE + 1; i++) {
            if (i % 3 == 0 && i % 5 == 0) System.out.println("FP + MASTER");
            else if (i % 3 == 0) System.out.println("FP");
            else if (i % 5 == 0) System.out.println("MASTER");
            else System.out.println(i);
        }
    }
}
