import java.util.Scanner;

public class Conversor2 {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);

    System.out.print("Por favor, introduce un número de Kg: ");
    double Kb = s.nextDouble();
    double Mb= 1000;
    double resultado = (Kb/Mb);
    System.out.print(Kb + " Kg son "+ resultado);
    s.close();
  }
}
