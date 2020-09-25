import java.util.Arrays;

public class StringMetody {

  public static void uzycieReplace() {
    String str = "  Java   11  ";
    String actualValue = str.replaceAll(" ", "");
    System.out.println(str + "po usunieciu " + actualValue);
  }

  public static void uzycieToUpperCase() {
    // toUpperCase
    String str2 = "Java";
    String actualValue = str2.toUpperCase();
    System.out.println(actualValue);
  }

  public static void uzycieIsEmpty() {
    // isEmpty
    String strNotEmprt = "Java";
    String strEmpty = "";

    if (strEmpty.isEmpty()) {
      System.out.println("Zmienna typu String jest pusta");
    }
    if (!strNotEmprt.isEmpty()) {
      System.out.println("Zmienna strNotEmpty nie jest pusta");
    }
  }

  public static void uzycieLength() {
    // length
    String str = "Java";
    int value = str.length();
    System.out.println(value);
  }

  public static void uzycieCharAt() {
    // charAt
    String str = "Java";
    char value = str.charAt(2);
    System.out.println(value);
  }

  public static void uzycieSubstring() {
    // substring
    String str = "Java";
    String newValue = str.substring(0, 2);
    System.out.println(newValue);
  }

  public static void uzycieSplitIReplace() {
    // split
    String str2 = "J:a:v:a";
    String[] tablica = str2.split(":");
    System.out.println(Arrays.toString(tablica));

    // replace
    String strZTablicy = Arrays.toString(tablica);
    String value = strZTablicy.replace('a', 'A');
    System.out.println(value);
  }

  public static void uzycieEqualsIConcat() {
    // equals
    String strEq = "Java 8";
    String str2Eq = new String("Java 8");
    System.out.println(strEq == str2Eq);
    System.out.println(strEq.equals(str2Eq));

    // concat + replace
    String strZmieniony = strEq.replace("8", "11");
    strZmieniony = strZmieniony.concat(" to super wersja");
    System.out.println(strZmieniony);
  }
}
