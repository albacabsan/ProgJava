import java.util.Scanner;

public class PrimosDelante {
    public static void main(String[] args) throws Exception {
        int[] ArrayInicial= new int[10];
        int[] ArrayPrimo= new int[10];
        int num, primos=0;
        Scanner s = new Scanner(System.in);
        for (int i=0; i<10; i++) {
            num=s.nextInt();
            ArrayInicial[i]=num;
            for(int n=2;n<num;i++) {
                if(num%i!=0)
                ArrayPrimo[primos++]=num;
            }
        }
        s.close();
        System.out.println("Array Original:");
        System.out.print("\nÍndice");
        for (int i=0; i<10; i++) {
            System.out.printf("%4d ", i);
        }
        System.out.print("\nValor ");
        for (int i=0; i<10; i++) {
            System.out.printf("%4d ",ArrayInicial[i]);
        }
        for (int i=0; i<primos; i++) {
            ArrayInicial[i]=ArrayPrimo[i];
        }
        for (int i=primos; i<10; i++) {
            ArrayInicial[i]=ArrayPrimo[i-primos];
        }
        System.out.println("\nArray resultante:");
        for (int i=0; i<10; i++) {
            System.out.print(ArrayInicial[i]+ " ");
        }
    }
}
