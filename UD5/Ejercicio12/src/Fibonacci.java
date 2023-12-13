import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int n;
        n = s.nextInt();
        s.close();
        int i;
        int fib1, fib2, fib3;
        fib1=0;
        fib2=1;
        System.out.println("Estos son los " + n + " primeros números de la sucesión de Fibonacci: ");
        for (i=n; i>0; i--) {
            System.out.print(fib1 + " ");
            fib3=fib1+fib2;
            fib1=fib2;
            fib2=fib3;
        }
    }
}
