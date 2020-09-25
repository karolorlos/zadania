
public class Pokoj {
  private double wysokosc;
  private double szerokosc;
  private double dlugosc;

  public double getWysokosc() {
    return wysokosc;
  }

  public double getSzerokosc() {
    return szerokosc;
  }

  public double getDlugosc() {
    return dlugosc;
  }

  public Pokoj(double wysokosc, double szerokosc, double dlugosc) {
    this.wysokosc = wysokosc;
    this.szerokosc = szerokosc;
    this.dlugosc = dlugosc;
  }

  public Pokoj(double szerokosc, double dlugosc) {
    this.wysokosc = 2.4;
    this.szerokosc = szerokosc;
    this.dlugosc = dlugosc;
  }

  public double obliczPolePowierzchni() {
    return szerokosc * dlugosc;
  }

  public double obliczObjetosc() {
    return szerokosc * wysokosc * dlugosc;
  }

  public String wyswietlPolePowierzchni() {
    return "Pole powierzchni pokoju wynosi :" + obliczPolePowierzchni();
  }

  public String wyswietlObjetosc() {
    return "Objetosc pokoju wynosi: " + obliczObjetosc();
  }

  @Override
  public String toString() {
    return "Pokoj{" +
        "wysokosc=" + wysokosc +
        ", szerokosc=" + szerokosc +
        ", dlugosc=" + dlugosc +
        '}';
  }
}
