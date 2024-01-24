import java.util.Scanner;

public class ArrayRevés {
    public static void main(String[] args) throws Exception {
        int[] num= new int[10];
        Scanner s = new Scanner(System.in);
        int i;
        System.out.println("Introduce 10 números: ");
        for (i=0; i<10; i++) {
            num[i]=s.nextInt();
        }
        s.close();
        System.out.println("Los 10 números introducidos al reves son: ");
        for (i=9; i>=0; i--) {
            System.out.println(num[i]);
        }
    }
}