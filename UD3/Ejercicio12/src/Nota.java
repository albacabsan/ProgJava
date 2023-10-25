import java.util.Scanner;

public class Nota {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduce la nota del primer examen: ");
    double primerExamen = s.nextDouble();
    System.out.println("¿Qué nota quieres sacar en el trimestre?");
    double trimestre = s.nextDouble();
    double segundoExamen = (trimestre - primerExamen*0.4)/0.6 ;
    System.out.print("Para tener un " + trimestre + " en el trimestre necesitas sacar un " + segundoExamen + " en el segundo examen.");
    s.close();
  }
}
