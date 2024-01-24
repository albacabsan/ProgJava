import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int[] num= new int[100];
        Scanner s = new Scanner(System.in);
        int i;
        System.out.println("Introduce 8 números: ");
        for (i=0; i<8; i++) {
            num[i]=s.nextInt();
        }
        s.close();
        System.out.println("Estos son los números: ");
        for (i=0; i<8; i++) {
            if (num[i]%2==0) {
                System.out.println(num[i]+ " par");
            } else {
                System.out.println(num[i]+ " impar");
            }
        }
    }
}
