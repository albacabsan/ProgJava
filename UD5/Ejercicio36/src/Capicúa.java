import java.util.Scanner;

public class Capicúa {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        long num1, num2;
        System.out.print("Introduce un número entero positivo: ");
        num1 = s.nextLong();
        s.close();
        long revés=0;
        num2=num1;

        while (num1>0) {
            revés= (revés*10) + (num1%10);
            num1/=10;
        }

        if (num2==revés) {
            System.out.println("El número introducido es capicúa");
        } else {
            System.out.println("El número introducido no es capicúa");
        }
    }
}
