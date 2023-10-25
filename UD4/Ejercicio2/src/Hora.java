import java.util.Scanner;

public class Hora {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    System.out.print("Dime una hora del día: ");
    int hora = s.nextInt();

    if (hora >= 6 && hora <= 12) {
      System.out.print("Buenos días");
    }
    if (hora >= 13 && hora <= 20) {
      System.out.print("Buenas tardes");
    }
    if ((hora >= 21 && hora < 24) || (hora >= 0 && hora <= 5)) {
      System.out.print("Buenas noches");
    }
    if (hora >= 24 || hora < 0) {
      System.out.print("La hora no es válida");
    }
    s.close();
  }
}
