import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    String scannerInput = "";
    Notepad notepad = new Notepad();
    if ( scannerInput.isEmpty() ||  scannerInput.equals("Karol")) {
      System.out.println("warunek OR");
    }
    if ( 11%2 != 0) {

    }
    do {
      System.out.println("Co chcesz zrobic? \n Wpisz 'addNote' aby dodac notatke " +
          "\n Wpisz 'printNote' aby wyswietlic notatke \n Wpisz 'list' aby wypisac liste dodanych notatek " +
          " \n Wpisz 'delete' aby usunac notatke");

      scannerInput = scanner.nextLine();
      switch (scannerInput) {
        case "addNote": {
          System.out.println("Wpisz swoja notatke.");
          scannerInput = scanner.nextLine();
          notepad.addNote(scannerInput);
          System.out.println("Notatka dodana, co dalej?");
          break;
        }
        case "printNote": {
          System.out.println("Wpisz numer notatki");
          notepad.printNote(Integer.parseInt(scanner.nextLine()));
          System.out.println("Co dalej?");
          break;
        }
        case "list": {
          System.out.println("Lista twoich notatek: ");
          notepad.list();
          System.out.println("Co dalej?");
          break;
        }
        case "delete": {
          System.out.println("Podaj numer notatki do usuniecia ");
          notepad.delete(Integer.parseInt(scanner.nextLine()));
          System.out.println("Notatka usunieta, co dalej?");
          break;
        }
        default: {
          if (!scannerInput.equals("Exit")) {
            System.out.println("Bledna komenda");
          }
        }
      }
    }while (!scannerInput.equals("Exit"));
  }
}


