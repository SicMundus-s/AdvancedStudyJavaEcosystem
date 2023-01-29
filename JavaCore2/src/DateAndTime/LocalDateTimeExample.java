package DateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExample {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String format = localDateTime.format(dateTimeFormatter);
        System.out.println(format);

        LocalDate prevDate = LocalDate.of(2018, 7, 7);
        Period period = Period.between(prevDate, localDateTime.toLocalDate());
        System.out.println(period);
    }
}
