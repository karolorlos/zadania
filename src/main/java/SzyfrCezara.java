public class SzyfrCezara {

  private int przesuniecie;

  public SzyfrCezara(int przesuniecie) {
    this.przesuniecie = przesuniecie;
  }

  public String zaszyfruj(String tekstDoZaszyfrowania) {
    // zamiana liter na male
    String tekst = tekstDoZaszyfrowania.toLowerCase();

    StringBuilder stringBuilder = new StringBuilder();

    // petla ktora przechodzi po kazdym znaku tekstu, ktory szyfrujemy
    for (int i = 0; i < tekst.length(); i++) {
        char character = tekst.charAt(i);
        // if sprawdzajacy czy to wlasciwy znak do przesuniecia
        if (character >= 'a' && character <= 'z') {
          character += przesuniecie;

          // sprawdz czy nie nastapilo przekroczenie zakresu (a - z)
          if (character > 'z') {
            // zawiniecie znaku
            character = (char) ((character - 'z') + ('a' -1));
          }
        }
      stringBuilder.append(character);
    }
    return stringBuilder.toString();
  }

  public String odszyfruj(String zaszyfrowanyTekst) {
    String tekst = zaszyfrowanyTekst.toLowerCase();

    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < tekst.length(); i++) {
      char character = tekst.charAt(i);
      // if sprawdzajacy czy to wlasciwy znak do przesuniecia
      if (character >= 'a' && character <= 'z') {
        character -= przesuniecie;

        // sprawdz czy nie nastapilo przekroczenie zakresu (a - z)
        if (character < 'a') {
          // zawiniecie znaku
          character = (char) ((character + 'z') - ('a' -1));
        }
      }
      stringBuilder.append(character);
    }
    return stringBuilder.toString();
  }
}
