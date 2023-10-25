import java.util.Scanner;

public class HorasLaborales {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);

    System.out.print("Por favor, introduzca el número de horas que trabaja semanalmente: ");
    double horas = s.nextDouble();
    double salario = horas * 12;

    System.out.println("Tu salario semanal es de " + salario + " euros");
    s.close();
  }
}
