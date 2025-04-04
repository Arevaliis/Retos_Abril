package RetosAbril;

public class Reto4 {
    public static void main(String[] args) {
        int contador = 5;

        do {
            if (contador > 0) {
                System.out.printf("""
                        __________
                       ( 00:00:0%d )
                        ----------
                       """, contador--);
            } else {
                System.out.printf("""
                        
                                    💥💥💥💥💥
                                  💥          💥
                                💥   00:00:0%d  💥
                                  💥          💥
                                    💥💥💥💥💥
                    """, contador--);
            }
        } while (contador >= 0);
    }
}
