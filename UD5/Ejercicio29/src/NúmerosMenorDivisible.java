import java.util.Scanner;

public class NúmerosMenorDivisible {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int i;
        System.out.print("Introduce el número tope: ");
        int num1 = s.nextInt();
        System.out.print("Introduce el no divisor: ");
        int num2 = s.nextInt();
        s.close();
        
        System.out.println("Estos son los números menores de " + num1 + ", los cuales no son divisibles entre " + num2 + ": ");
        for (i=1; i<num1; i++) {
            if (i%num2!=0) {
                System.out.print(i + " ");
            }
        }
    }
}
