import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.ZoneId;

public class Alg2 {
    public static void main(String[] args) throws Exception {
       // Data local
       LocalDate d04 = LocalDate.parse("2022-07-20");
       // Data e hora local
       LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
       // Data padrão londres
       Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
       
       // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
       
       // Setando um padrao de data
       DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
       // Setando um padrao de data e hora
       DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
       // Setando um padrao de data e hora de acordo com o pais que você está
       DateTimeFormatter formato3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
       
       // Setando um padrao de data e hora prontos
       DateTimeFormatter formato4 = DateTimeFormatter.ISO_DATE_TIME;
       DateTimeFormatter formato5 = DateTimeFormatter.ISO_INSTANT;
       
       //.formart transforma a data/hora para string 

       System.out.println("d04 = " + d04.format(formato1));
       System.out.println("d04 = " + formato1.format(d04));
       System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
       
       System.out.println("d05 = " + d05.format(formato1));
       System.out.println("d05 = " + d05.format(formato2));
       System.out.println("d05 = " + d05.format(formato4));

       System.out.println("d06 = " + formato3.format(d06));
       System.out.println("d06 = " + formato5.format(d06));
       System.out.println("d06 = " + d06.toString());
    }
}
