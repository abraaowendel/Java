import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Alg3 {
    public static void main(String[] args) throws Exception {
        // for (String s : ZoneId.getAvailableZoneIds())
        // System.out.println(s);

        // Data local
        LocalDate d04 = LocalDate.parse("2022-07-20");
        // Data e hora local
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        // Data e hora no padrão londres
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        // Convertendo data no horario de londres para horario do sistema.
        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        // Convertendo data no horario de londres para horario de um pais (conferir no
        // ZoneId.getAvailableZoneIds)
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));

        // Convertendo data e hora de londres para horario do sistema.
        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        // Convertendo data e hora para horario de um pais (conferir no
        // ZoneId.getAvailableZoneIds)
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
        
        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);

        System.out.println("d04 dia = " + d04.getDayOfMonth());
        System.out.println("d04 mês = " + d04.getMonthValue());
        System.out.println("d04 ano = " + d04.getYear());

        System.out.println("d05 hora = " + d05.getHour());
        System.out.println("d05 minutos = " + d05.getMinute());
    }
}
