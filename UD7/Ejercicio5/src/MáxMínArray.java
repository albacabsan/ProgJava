import java.util.Scanner;

public class MáxMínArray {
    public static void main(String[] args) throws Exception {
        int[] num= new int[10];
        Scanner s = new Scanner(System.in);
        int i;
        int máximo=0;
        int mínimo=1000;
        System.out.println("Introduce 10 números: ");
        for (i=0; i<10; i++) {
            num[i]=s.nextInt();
            if (num[i]>máximo) {
                máximo=num[i];
            }
            if (num[i]<mínimo) {
                mínimo=num[i];
            }
        }
        s.close();
        System.out.println("Estos son los números con máx. y mín.: ");
        for (i=0; i<10; i++) {
            if (num[i]==máximo) {
                System.out.println(num[i] + " máximo");
            } else if (num[i]==mínimo) {
                System.out.println(num[i] + " mínimo");
            } else {
                System.out.println(num[i]);
            }
        }
    }
}
