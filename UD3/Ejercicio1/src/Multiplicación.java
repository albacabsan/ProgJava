import java.util.Scanner;

public class Multiplicación {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        System.out.print("Por favor, introduce un número: ");
        double num1= s.nextDouble();
        System.out.print("Por favor, introduce otro número: ");
        double num2= s.nextDouble();
        double mul= num1*num2;
        System.out.print(num1+ " * "+num2 + " = " + mul );
        s.close();
    }
}
