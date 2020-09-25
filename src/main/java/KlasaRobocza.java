import java.util.Scanner;

public class KlasaRobocza {
  public static void operatoryWarunkowe() {
    int value1 = 1;
    int value2 = 2;
    if ((value1 == 1) && (value2 == 2))
      System.out.println("value1 is 1 AND value2 is 2");
    if ((value1 == 1) || (value2 == 1))
      System.out.println("value1 is 1 OR value2 is 1");

    int result;
    boolean someCondition = true;
    // nazwaZmiennej = warunek jak w IF ? jeœli prawda to ustaw result value1 : w przeciwnym wypadku ustaw value2;
    result = someCondition == true ? value1 : value2;
    System.out.println(result);
  }


  public static void operatoryRownosci() {
    final int value1 = 1;
    int value2 = 2;

    if (value1 == value2)
      System.out.println("value1 == value2");
    if (value1 != value2)
      System.out.println("value1 != value2");
    if (value1 > value2)
      System.out.println("value1 > value2");
    if (value1 < value2)
      System.out.println("value1 < value2");
    if (value1 <= value2)
      System.out.println("value1 <= value2");


    boolean czyPrawda = false;
    int mojaLiczba = 10;
    byte mojaZmiennaByte = 100;
    int liczba = 0;

    System.out.println(liczba);
  }

  public static void operatoryArytmetyczne() {
    int a = 1;
    int b = 2;

    int result = a + b;

    System.out.println("1 + 2 = " + result);
    int original_result = result;

    result = result - 1;
    System.out.println(original_result + " -1 =" + result);
    original_result = result;

    result = result * 2;
    System.out.println(original_result + " * 2 =" + result);
    original_result = result;

    result = result / 2;
    System.out.println(original_result + " /2 = " + result);
    original_result = result;

    Object zmienna = new Object();
    if (zmienna != null) {
      System.out.println("Nie jest równa true");
    }
  }

  public static void rzutowanieParsowanie() {
    // rzutowanie double na int
    double a = 10.5;
    int b = 2;
    int wynik;

    wynik = (int) a / b;
    System.out.println(wynik);

    // rzutowanie int na char
    int kod_ascii = 36;
    char asd = '$';
    System.out.println(kod_ascii);
    System.out.println((char) kod_ascii);

    // parsowanie String na int

    String str = "12345";
    int parse = Integer.parseInt(str);
    int value = parse + 2;
    System.out.println("Zmienna str = " + str + " zmienna value = " + value);

    // parsowanie int/double na String
    int aInt = 20;
    String pom0 = "" + aInt;
    System.out.println(pom0);

    double bInt = 31.5;
    String pom1 = "" + bInt;
    System.out.println(pom1);

    double d = 90.7;
    String pom2 = Double.toString(d);
    System.out.println(pom2);
  }

  public static void uzycieScannera() {
    // uzycie Scannera
    Scanner sc = new Scanner(System.in);

    System.out.println("Podaj swoje imie");
    String imie = sc.next();
    System.out.println("Podaj swoj wiek");
    int wiek = sc.nextInt();
    System.out.println("Podaj swoja wage");
    double weight = sc.nextDouble();
    System.out.println("Twoje imie to " + imie + " twoj wiek to " + wiek + " twoja waga to " + weight);

    sc.close();
  }

}
