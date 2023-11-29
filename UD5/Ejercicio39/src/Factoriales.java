import java.util.Scanner;

public class Factoriales {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.print("Dime un numero y te diré su factorial: ");
        int num= s.nextInt();
        s.close();
        int n=1;
        int i=1;

        System.out.println("Estos son los factoriales del 1 al " + num + " :");
        for (n=1; n<=num; n++) {
            int fact=n;
            for (i=1; i<n; i++) {
                fact*=i;
            }
            System.out.println(n + "! = " + fact);
        }
        
    }
}