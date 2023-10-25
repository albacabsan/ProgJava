import java.util.Scanner;

public class Ecuación {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
        System.out.println("Por favor, introduzca el valor de a: ");
        double a = s.nextDouble();
        System.out.println("Por favor, introduzca el valor de b: ");
        double b = s.nextDouble();
        double x = (-b)/a;
        if (a==0) {
            System.out.println("Esa ecuación no tiene solución real.");
        }
        else{
            System.out.println("x = " + x);
        }
        s.close();
    }
}
