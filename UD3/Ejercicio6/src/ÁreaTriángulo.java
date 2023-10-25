import java.util.Scanner;

public class ÁreaTriángulo {
  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);

    System.out.print("Por favor, introduce la base del triángulo: ");
    double base = s.nextDouble();
    System.out.print("Por favor, introduce la altura del triángulo: ");
    double altura = s.nextDouble();
    double área = base * altura / 2;
    System.out.print("El área del triángulo es " + área);
    s.close();
  }
}
