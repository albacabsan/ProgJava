import java.util.Scanner;

public class Media3 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        System.out.print("Dime la primera nota: ");
        double primera = s.nextDouble();
        System.out.print("Dime la segunda nota: ");
        double segunda = s.nextDouble();
        System.out.print("Dime la tercera nota: ");
        double tercera = s.nextDouble();
        double media = (primera + segunda + tercera)/3;
        System.out.print("La media de las 3 notas es: " + media);
        s.close();
    }
}
