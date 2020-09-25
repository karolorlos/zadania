public class Pies {
  private String rasa;
  private int wiek;
  private String plec;

  public String getRasa() {
    return rasa;
  }

  public String getPlec() {
    return plec;
  }

  public int getWiek() {
    return wiek;
  }

  public void setWiek(int wiek) {
    this.wiek = wiek;
  }

  public Pies(String rasa, String plec) {
    this.rasa = rasa;
    this.wiek = 0;
    this.plec = plec;
  }

  public void dajGlos() {
    System.out.println("Woof!");
  }
}
