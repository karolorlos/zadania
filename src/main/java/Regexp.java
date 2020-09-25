
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexp {

  public static void pierwszyRegexp() {
    Pattern pattern = Pattern.compile("Marcin");
    Matcher matcher = pattern.matcher("Nazywam siê Marcin Pietraszek");

    System.out.println("metoda find() = " + matcher.find());
    System.out.println("metoda matches() = " + matcher.matches());
  }

  public static void walidujKodPocztowy(String kod) {
    String wyrazenie = "\\d{2}-\\d{3}";
    Pattern pattern = Pattern.compile(wyrazenie);

    Matcher matcher = pattern.matcher(kod);

    String odpowiedz ="";

    if (matcher.find()) {
      odpowiedz = "prawidlowy";
    } else odpowiedz = "nieprawidlowy";

    System.out.println("Jest to " + odpowiedz + " kod pocztowy : " + kod);
  }
}
