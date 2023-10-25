import java.util.Scanner;
public class ÁreaRectángulo {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        System.out.print("Por favor, introduce un lado del rectángulo: ");
        double lado1= s.nextDouble();
        System.out.print("Por favor, introduce el otro lado: ");
        double lado2= s.nextDouble();
        double área= lado1*lado2;
        System.out.print("El área del rectángulo es " + área);
        s.close();
    }
}
