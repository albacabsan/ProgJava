import java.util.Scanner;

public class Factura2 {
  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);

    System.out.print("Por favor, introduzca la base imponible: ");
    double baseImponible = s.nextDouble();
    double IVA = baseImponible * 0.21;
    double precioTotal = baseImponible + IVA;

    System.out.printf("Base imponible %8.2f\n", baseImponible);
    System.out.printf("IVA %18.2f\n", IVA);
    System.out.printf("------------------------\n");
    System.out.printf("Total %17.2f\n", precioTotal);
    s.close();
  }
}
