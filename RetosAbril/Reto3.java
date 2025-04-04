package RetosAbril;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Reto3 {
    public static void main(String[] args) {
        // Obtiene la fecha y hora actual
        LocalDateTime hoy = LocalDateTime.now();

        // Obtiene la fecha y hora del cumpleaños
        LocalDateTime fechaNacimiento = LocalDateTime.of(1996, 9, 9, 18, 0,0);

        // Calcula la diferencia entre las fechas anteriores
        String tiempoTranscurrido = calculandoTiempoTranscurrido(hoy, fechaNacimiento);

        String mensaje = String.format("""
                
                Dia del año actual %d.
                Dia de mi nacimiento %d
                Dia de la semana actual %s.
                Dia de la semana de mi nacimiento %s
                Mes actual %d.
                Mes de mi nacimiento %d
                
                Tiempo Transcurrido; %s
                """,
                hoy.getDayOfMonth(), fechaNacimiento.getDayOfMonth(),
                hoy.getDayOfWeek(), fechaNacimiento.getDayOfWeek(),
                hoy.getYear(), fechaNacimiento.getYear(),
                tiempoTranscurrido);

        System.out.println(mensaje);
    }

    /**
     * Calcula el tiempo transcurrido entre dos fechas y lo representa por un lado en años, meses, días,
     * y por otro lado, en horas, minutos y segundos.
     *
     * @param hoy Fecha y hora actual.
     * @param fechaNacimiento Fecha y hora de nacimiento.
     * @return Una cadena de texto con el tiempo transcurrido en años, meses, día así como su equivalente
     * en horas, minutos y segundos.
     */
    static String calculandoTiempoTranscurrido(LocalDateTime hoy, LocalDateTime fechaNacimiento){
        // Calcula la diferencia en años, meses y días
        Period periodo = fechaNacimiento.toLocalDate().until(hoy.toLocalDate());

        // Calcular la diferencia en horas, minutos y segundos
        long horas = ChronoUnit.HOURS.between(fechaNacimiento, hoy);
        long minutos = ChronoUnit.MINUTES.between(fechaNacimiento, hoy);
        long segundos= ChronoUnit.SECONDS.between(fechaNacimiento, hoy);

        return String.format("""
                %d años, %d meses y %d días.
                Equivalente a:
                - %d horas
                - %d minutos
                - %d segundos
                """,
                periodo.getYears(), periodo.getMonths(), periodo.getDays(),
                horas, minutos, segundos);
    }
}
