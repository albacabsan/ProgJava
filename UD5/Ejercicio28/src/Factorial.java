import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.print("Dime un numero y te diré su factorial: ");
        int num= s.nextInt();
        s.close();
        int n=1;
        int i;
        for (i=num; i>1; i--) {
            n*=i;
        }
        System.out.println("El factorial de " + num + " es igual a " + n);
    }
}
