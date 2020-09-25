import java.util.Arrays;

public class Tablice {

  public static void znajdzNajwiekszaINajmniejszaWartosc(int[] tab) {

    int min = tab[0];
    int max = tab[0];

    for (int i = 0; i < tab.length; i++) {
      if (min > tab[i]) {
        min = tab[i];
      }
      if (max < tab[i]) {
        max = tab[i];
      }
    }
    System.out.println("Najmniejsza wartosc w tablicy to : " + min);
    System.out.println("Najwieksza wartosc w tablicy to : " + max);
  }

  public static void odwrocTablice(int[] tab) {
    System.out.println(Arrays.toString(tab));

    int start = 0;
    int end = tab.length - 1;

    while (start < end) {
      int temp = tab[start];
      tab[start] = tab[end];
      tab[end] = temp;

      start++;
      end--;
    }
    System.out.println("Po odwroceniu " + Arrays.toString(tab));
  }

  public static int znajdzNajczesciejWystepujacaWartosc(int[] tab) {
    int count = 0;
    int maxCount = 0;
    int id = 0;
    for (int i = 0; i < tab.length; i++) {
      for (int j = 0; j < tab.length; j++) {
        if (tab[i] == tab[j]) {
          count++;
        }
      }
      if (maxCount < count) {
        maxCount = count;
        id = i;
      }
      count = 0;
    }
    return tab[id];
  }

  public static int[] zlaczTablice(int[] tab1, int[] tab2) {

    System.out.println("Tablice przed zlaczeniem : " + Arrays.toString(tab1) + Arrays.toString(tab2));

    int[] result = new int[tab1.length + tab2.length];

    for (int i = 0; i < tab1.length; i++) {
      result[i] = tab1[i];
    }
    for (int i = 0; i < tab2.length; i++) {
      result[i + tab1.length] = tab2[i];
    }

    System.out.println("Tablice po zlaczeniu " + Arrays.toString(result));
    return result;
  }

  public static int[] posortujTablice(int[] tab) {
    System.out.println("Nieposortowana tablica : " + Arrays.toString(tab));

    int temp = 0;
    for (int i = 0; i < tab.length - 1; i++) {
      for (int j = 0; j < tab.length - 1; j++) {
        if (tab[j] > tab[j+1]) {
          temp = tab[j];
          tab[j] = tab[j+1];
          tab[j+1] = temp;
        }
      }
    }
    System.out.println("Posortowana tablica : " + Arrays.toString(tab));
    return tab;
  }

}
