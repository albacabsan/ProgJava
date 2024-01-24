import java.util.Scanner;

public class DestacaMaxMin {
    public static void main(String[] args) throws Exception {
        int[] num= new int[100];
        Scanner s = new Scanner(System.in);
        int i, máximo=0, mínimo=100;
        System.out.println("Estos son los 100 números: ");
        for (i=0; i<100; i++) {
            num[i]=(int)(Math.random()*501);
            if (num[i]>máximo) {
                máximo=num[i];
            }
            if (num[i]<mínimo) {
                mínimo=num[i];
            }
            System.out.print(num[i] + " ");
        }

        System.out.println("\n¿Quieres destacar el 1.Máximo o el 2.Mínimo?");
        int decision= s.nextInt();

        s.close();
        System.out.println("Estos son los números destacándolo: ");
        for (i=0; i<100; i++) {
            if (decision==1) {
                if (num[i]==máximo) {
                System.out.print("**" + num[i]+ "** ");
                } else {
                    System.out.print(num[i]+ " ");
                }
            } else if (decision==2) {
                if (num[i]==mínimo) {
                System.out.print("**" + num[i]+ "** ");
                } else {
                    System.out.print(num[i]+ " ");
                }
            } else {
                System.out.println("ERROR");
                i=100;
            }
        }
    }
}

