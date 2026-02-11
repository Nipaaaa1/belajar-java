import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {

  public static void main(String[] args) {
    // 36 - Datetime

    // Get local date / time
    LocalDate date = LocalDate.now();
    LocalTime time = LocalTime.now();

    // Get date time in UTC
    Instant instant = Instant.now();

    System.out.println(date);
    System.out.println(time);
    System.out.println(instant);

    // Format date time
    LocalDateTime datetime = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    String formattedDateTime = datetime.format(formatter);

    System.out.println(formattedDateTime);

    customDateTime();
  }

  static void customDateTime() {
    // Custom date
    LocalDate date = LocalDate.of(2026, 02, 12);

    System.out.println(date);

    // Custom date time
    LocalDateTime date1 = LocalDateTime.of(2026, 02, 12, 12, 0, 0);
    LocalDateTime date2 = LocalDateTime.of(2026, 02, 12, 13, 0, 0);

    System.out.println(date1);
    System.out.println(date2);

    if (date1.isBefore(date2)) {
      System.out.println(date1 + " is earlier than " + date2);
    }

  }
}
