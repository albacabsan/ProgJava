import java.util.Scanner;

public class NúmeroPalos {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        long num;
        System.out.print("Introduce un número entero positivo: ");
        num = s.nextLong();
        s.close();
        long revés=0;
        long dig=0;
        int i;
        
        while (num>0) {
            revés= (revés*10) + (num%10);
            num/=10;
        }

        while (revés>0) {
            dig=(int)(revés%10);
            for (i=1; i<=dig; i++) {
                System.out.print("|");
            }
            System.out.print("-");
            revés/=10;
        }
    }
}

