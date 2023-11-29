import java.util.Scanner;

public class DígitosParesImpares {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        long num1, num2;
        System.out.print("Introduce un número entero positivo: ");
        num1 = s.nextLong();
        System.out.print("Introduce un número entero positivo: ");
        num2 = s.nextLong();
        long revés1=0;
        long revés2=0;
        long dig=0;
        long pares=0;
        long impares=0;
        
        while (num1>0) {
            revés1= (revés1*10) + (num1%10);
            num1/=10;
        }
        while (num2>0) {
            revés2= (revés2*10) + (num2%10);
            num2/=10;
        }
        while (revés1>0) {
            dig=(int)(revés1%10);
            if (dig%2==0) {
                pares=pares*10 + dig;
            } else {
                impares=impares*10 + dig;
            }
            revés1/=10;
        }
        while (revés2>0) {
            dig=(int)(revés2%10);
            if (dig%2==0) {
                pares=pares*10 + dig;
            } else {
                impares=impares*10 + dig;
            }
            revés2/=10;
        }
        System.out.print("\nEl número formado por los dígitos pares es " + pares);
        System.out.print("\nEl número formado por los dígitos impares es " + impares);
        
        s.close();
        System.out.println();
    }
}