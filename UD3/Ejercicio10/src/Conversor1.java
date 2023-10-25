import java.util.Scanner;

public class Conversor1 {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);

    System.out.print("Por favor, introduce un número de Mb: ");
    double Mb = s.nextDouble();
    double Kb= 1000;
    double resultado = (Mb * Kb);
    System.out.print(Mb + " Mb son "+ resultado);
    s.close();
  }
}