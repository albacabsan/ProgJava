import java.util.Scanner;

public class VolumenCono {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);

    System.out.print("Por favor, introduce el radio del cono: ");
    double radio = s.nextDouble();
    System.out.print("Por favor, introduce la altura del cono: ");
    double altura = s.nextDouble();
    double volumen = (Math.PI * Math.pow(radio,2) * altura) / 3;
    System.out.print("El volumen del cono es " + volumen);
    s.close();

  }
}
