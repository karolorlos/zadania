import java.util.Scanner;

public class ZadaniaRozgrzewka {

  public static void od1do100() {
    for (int i = 1; i <= 100; i++) {
      System.out.println(i);
    }
  }

  public static void wypiszZPrzedzialu() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj liczbe poczatkowa ");
    int start = scanner.nextInt();
    System.out.println("Podaj liczbe konczaca ");
    int stop = scanner.nextInt();
    scanner.close();

    for (int i = start; i <= stop; i++) {
      System.out.println(i);
    }
  }

  public static void wypiszZPrzedzialuZKrokiem() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj liczbe poczatkowa ");
    int start = scanner.nextInt();
    System.out.println("Podaj liczbe konczaca ");
    int stop = scanner.nextInt();
    System.out.println("Podaj krok ");
    int krok = scanner.nextInt();
    scanner.close();

    for (int i = start; i <= stop; i += krok) {
      System.out.println(i);
    }
  }

  public static void sprawdzCzyParzysta() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj liczbe ");
    int liczba = scanner.nextInt();
    if (liczba % 2 == 0) {
      System.out.println(liczba + " jest parzysta");
    } else {
      System.out.println(liczba + " jest nieparzysta");
    }
  }

  public static void charToInt(char c) {
    int kod = (int) c;
    System.out.println("Znak : " + c + " ma kod : " + kod);
  }

  public static void intToChar(int i) {
    char c = (char) i;
    System.out.println(" Dla kodu : " + i + " jest znak " + c );
  }


}
