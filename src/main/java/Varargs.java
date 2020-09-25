public class Varargs {

  public static int sumowanie(int... args) {
    int suma = 0;
    for (int arg: args ) {
      suma += arg;
    }
    return suma;
  }

  public static int minimalnaWartosc(int... args) {
    if (args.length == 0) {
      throw new IllegalArgumentException("Za malo argumentow");
    }
    int min = args[0];
    for (int i = 1; i < args.length; i++) {
      if (args[i] < min) {
        min = args[i];
      }
    }
    return min;
  }

  public static int minimalna(int pierwszyArg, int... args) {

    int min = pierwszyArg;
    for (int arg: args) {
      if (arg < min) {
        min = arg;
      }
    }
    return min;
  }
}
