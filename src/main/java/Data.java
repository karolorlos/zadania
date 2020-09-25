import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Calendar;
import java.util.Date;

public class Data {

  public static void datyPrzedJava8() {

    Date dateBeforeJava8 = new Date();
    System.out.println(dateBeforeJava8);
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
    System.out.println(simpleDateFormat.format(dateBeforeJava8));

    Calendar calendar = Calendar.getInstance();
    Date date = calendar.getTime();
    System.out.println(simpleDateFormat.format(date));
  }

  public static void dataWJavie8() {
    LocalDate localDate = LocalDate.now();
    System.out.println("LocalDate now : " + localDate);

    LocalDateTime localDateAsia = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
    System.out.println("Strefa czasowa Tokio LocalDate " + localDateAsia);

    LocalDateTime localDateTime = LocalDateTime.now();
    System.out.println("LocalDateTime : " + localDateTime);

    LocalDate localDate2 = LocalDate.of(2010, Month.JULY, 30);
    System.out.println(localDate2);

    System.out.println("Dzien miesiaca " + localDate.getDayOfMonth() );
    System.out.println("Dzien tygodnia " + localDate.getDayOfWeek());
    System.out.println("Dzien roku : " + localDate.getDayOfYear());
  }

  public static void zadania() {
    // zad 1
    LocalDateTime aktualnyDataICzas = LocalDateTime.now();
    System.out.println(aktualnyDataICzas);
    // zad 2
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss:SSS");
    String sformatowanaData = aktualnyDataICzas.format(dtf);

    System.out.println("Aktualna data i czas po sformatowaniu : " + sformatowanaData);
    // zad 3
    dtf = DateTimeFormatter.BASIC_ISO_DATE;
    String dataBasicIsoDate = aktualnyDataICzas.format(dtf);
    System.out.println("Data i czas w basic iso date : " + dataBasicIsoDate);

    Instant instant = Instant.now();

    dtf = DateTimeFormatter.ISO_INSTANT;

    String instantString = dtf.format(instant);
    System.out.println(instant);
    System.out.println("Instant po formacie :" + instantString);

    ZonedDateTime zonedDateTime = ZonedDateTime.now();

    // zad 4
    dtf = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
    System.out.println("ZonedDateTime w short :" + zonedDateTime.format(dtf));

    dtf = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
    System.out.println("ZonedDateTime w medium :" + zonedDateTime.format(dtf));

    dtf = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
    System.out.println("ZonedDateTime w long :" + zonedDateTime.format(dtf));

    dtf = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL);

    System.out.println("ZonedDateTime full :" + zonedDateTime.format(dtf));


  }


}
