package RetosAbril;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Reto2 {
    public static void main(String[] args) {
        HashMap<String, Integer> calendario = new LinkedHashMap<>();
        calendario.put("Enero", 31);
        calendario.put("Febrero", 28);
        calendario.put("Marzo", 31);
        calendario.put("Abril", 30);
        calendario.put("Mayo", 31);
        calendario.put("Junio", 30);
        calendario.put("Julio", 31);
        calendario.put("Agosto", 31);
        calendario.put("Septiembre", 30);
        calendario.put("Octubre", 31);
        calendario.put("Noviembre", 30);
        calendario.put("Diciembre", 31);

        System.out.println("***** Calendario *****");
        for (Object mes : calendario.keySet()) {
            System.out.print(mes + ": \n");
            for (int i = 1; i < calendario.get(mes) + 1; i++) {
                if (i % 7 == 0) {
                    System.out.println(i + "\t");
                } else {
                    System.out.print(i + "\t");
                }
            }
            System.out.println("\n");
        }
    }
}
