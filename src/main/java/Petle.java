import java.util.Arrays;
import java.util.Scanner;

public class Petle {
  public static void petlaFor() {
    for (int i = 0; i < 5; i++) {
      System.out.println("Aktualna wartoœæ i : " + i);

    }
    for (int i = 0; i <= 5; i++) {
      System.out.println("Aktualna wartoœæ i : " + i);

    }
    for (int i = 0; i <= 5; ++i) {
      System.out.println("Aktualna wartoœæ i : " + i);
    }
  }

  public static void podajProdukt() {
    Scanner scanner = new Scanner(System.in);
    for (int i = 0; i < 10; i++) {
      System.out.println("Podaj nazwe produktu ");
      String produkt = scanner.next();
      System.out.println("Dodalem do koszyka " + produkt + ", to nasz " + (i + 1) + " produkt");
    }
  }

  public static void sumowanie() {
    Scanner scanner = new Scanner(System.in);
    int suma = 0;
    for (int i = 0; i < 5; i++) {
      System.out.println("Podaj liczbe ");
      suma = suma + scanner.nextInt();
    }
    System.out.println("Suma podanych liczb to " + suma);
  }

  public static void dwiePetle() {
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        System.out.println(i + " : " + j);
      }
    }
  }

  public static void petlaWhile() {
    int i = 0;
    while (i < 5) {
      System.out.printf("Aktualna wartoœæ i : %d \n ", i);
      i++;
    }
    System.out.println("Zerujemy wartoœæ licznika");
    i = 0;
    while (i++ < 5) {
      System.out.printf("Aktualna wartoœæ i : %d \n ", i);
    }
    System.out.println("Zerujemy wartoœæ iteratora");
    i = 0;
    while (++i < 5) {
      System.out.printf("Aktualna wartoœæ i : %d \n ", i);
    }
  }

  public static void petlaWhileTenTimes() {
    Scanner scanner = new Scanner(System.in);
    int i = 0;
    while (i < 10) {
      i++;
      System.out.println("Podaj nazwe produktu");
      String produkt = scanner.next();
      System.out.println("Dodalem do koszyka " + produkt + ", to nasz " + i + " produkt");
    }
  }

  public static void petlaWhileSumowanie() {
    Scanner scanner = new Scanner(System.in);
    int suma = 0;
    int i = 0;
    while (i < 5) {
      System.out.println("Podaj liczbe ");
      int liczba = scanner.nextInt();
      if (liczba > 10) {
        suma += liczba;
      } else {
        System.out.println("Poda³eœ za ma³¹ liczbê");
      }
      i++;
    }
    System.out.println("Suma liczb to: " + suma);
  }

  public static void petlaDoWhileKoniec() {
    Scanner scanner = new Scanner(System.in);
    String ciag = "";
    do {
      System.out.println("Podaj napis ");
      ciag = scanner.next();
      System.out.println(ciag);
    } while (!ciag.equals("koniec"));
  }

  public static void petlaForEach() {
    Scanner scanner = new Scanner(System.in);
    int i = 0;
    String[] tablica = new String[10];
    while (i < 10) {
      System.out.println("Podaj nazwe produktu ");
      tablica[i] = scanner.next();
      i++;
    }
    for (String produkt : tablica) {
      System.out.println(produkt);
    }
  }

  public static void podajRozmiarTablicy() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj rozmiar tablicy ");
    int rozmiar = scanner.nextInt();
    int[] tablica = new int[rozmiar];
    int suma = 0;

    for (int i = 0; i < rozmiar; i++) {
      System.out.println("Podaj liczbe ");
      tablica[i] = scanner.nextInt();
      suma += tablica[i];
    }
    System.out.println("Suma podanych liczb to: " + suma);
  }

  public static void ciagImion() {
    String[] tablicaImion = {"Ma³gorzata", "Jan", "Jakub", "Robert", "Monika"};
    System.out.println("Tablica wszystkich imion" + Arrays.toString(tablicaImion));
    String ciag = "";
    for (String imie : tablicaImion) {
      if (imie.length() < 5) {
        ciag += imie + ", ";
      }

    }
    System.out.println("Ciag przed usunieciem zbednych znakow " + ciag);

    ciag = ciag.substring(0, ciag.length() - 2);
    System.out.println("Po usunieciu " + ciag);
  }
}
