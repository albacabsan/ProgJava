import java.util.Scanner;

public class SalarioSemanal {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    System.out.print("Dime cuántas horas a la semana trabajas: ");
    int horasTotal = s.nextInt();

    if (horasTotal<=40) {
      int salario = horasTotal*12;
      System.out.print("Su salario semanal es " + salario + " euros");
    }
    else {
      int horasNormal = 40*12;
      int horasExtras= (horasTotal-40)*16;
      int salario= horasExtras + horasNormal;
      System.out.print("Su salario semanal es " + salario + " euros");
    }
    s.close();
  }
}

