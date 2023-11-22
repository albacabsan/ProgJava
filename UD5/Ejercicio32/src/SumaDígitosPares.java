import java.util.Scanner;

public class SumaDígitosPares {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        long num;
        System.out.print("Introduce un número entero positivo: ");
        num = s.nextLong();
        long revés=0;
        System.out.print("Dígitos pares: ");
        long dig=0;
        long sumaPares=0;
        
        while (num>0) {
            revés= (revés*10) + (num%10);
            num/=10;
        }

        
        while (revés>0) {
            dig=(int)(revés%10);
            if (dig%2==0) {
                System.out.print(dig + " ");
                sumaPares+=dig;
            }
            revés/=10;
        }
        System.out.println("\nLa suma de los dígitos pares es " + sumaPares);
        s.close();
        System.out.println();
    }
}
