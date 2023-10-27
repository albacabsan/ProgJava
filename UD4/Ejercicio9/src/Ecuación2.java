import java.util.Scanner;

public class Ecuación2 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        System.out.println("Este programa resuelve ecuaciones de segundo grado del tipo ax2 + bx + c = 0");
        System.out.print("Por favor, introduzca el valor de a: ");
        double a = s.nextDouble();
        System.out.print("Por favor, introduzca el valor de b: ");
        double b = s.nextDouble();
        System.out.print("Por favor, introduzca el valor de c: ");
        double c = s.nextDouble();
        double x1 = ((-b)+Math. sqrt((b*b)-4*a*c))/2*a;
        double x2 = ((-b)-Math. sqrt((b*b)-4*a*c))/2*a;
        if (a==0) {
            System.out.println("Esa ecuación no tiene solución real.");
        }
        else{
            System.out.println("Los resultados de la ecuación son: x= " + x1 + " y x= " + x2);
        }
        s.close();
    }
}