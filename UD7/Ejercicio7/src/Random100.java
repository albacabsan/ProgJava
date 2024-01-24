import java.util.Scanner;

public class Random100 {
    public static void main(String[] args) throws Exception {
        int[] num= new int[100];
        Scanner s = new Scanner(System.in);
        int i;
        System.out.println("Introduce 2 números: ");
        int num1=s.nextInt();
        int num2=s.nextInt();
        s.close();
        for (i=0; i<100; i++) {
            num[i]=(int)(Math.random()*21);
        }
        System.out.println("Estos son los números: ");
        for (i=0; i<100; i++) {
            if (num[i]==num1) {
                num[i]=num2;
                System.out.println("'" + num[i]+ "'");
            } else {
                System.out.println(num[i]);
            }
        }
    }
}
