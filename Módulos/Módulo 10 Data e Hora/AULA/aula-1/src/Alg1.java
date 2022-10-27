import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Alg1 {
    public static void main(String[] args) throws Exception {
        // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
        
        DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        // Data local
        LocalDate d01 = LocalDate.now();
        // Data e hora local
        LocalDateTime d02 = LocalDateTime.now();
        // Data e hora no horário de Londres
        Instant d03 = Instant.now();

        // Setando data local
        LocalDate d04 = LocalDate.parse("2022-07-20");
        // Setando data e hora local
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");

        // Setando data e hora no padrão Londres
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
        // Setando data e hora em um padrão GMT-3 que no caso é do Brasil
        Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");

        // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html

        // Setando uma data local em um padrão customizado
        LocalDate d08 = LocalDate.parse("20/07/2022", formato1);
        // Setando uma data e hora local em um padrão customizado
        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", formato2);

        // Setando uma data local escolhida
        LocalDate d10 = LocalDate.of(2022, 07, 20);
        // Setando uma data e hora local escolhida
        LocalDateTime d11 = LocalDateTime.of(2022, 07, 20, 1, 30);

        System.out.println("d01 = " + d01.toString());
        System.out.println("d02 = " + d02.toString());
        System.out.println("d03 = " + d03.toString());
        System.out.println("d04 = " + d04.toString());
        System.out.println("d05 = " + d05.toString());
        System.out.println("d06 = " + d06.toString());
        System.out.println("d07 = " + d07.toString());
        System.out.println("d08 = " + d08.toString());
        System.out.println("d09 = " + d09.toString());
        System.out.println("d10 = " + d10.toString());
        System.out.println("d11 = " + d11.toString());
    }
}
