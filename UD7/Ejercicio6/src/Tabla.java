import java.util.Scanner;

public class Tabla {
    public static void main(String[] args) throws Exception {
        int[] num= new int[15];
        Scanner s = new Scanner(System.in);
        int i;
        System.out.println("Introduce 10 números: ");
        for (i=0; i<15; i++) {
            num[i]=s.nextInt();
        }
        s.close();

        int aux=num[14];
        System.out.println("Estos son los números del array final: ");
        for (i = 14; i > 0; i--) {
            num[i] = num[i - 1];
        }
        num[0]=aux;
        for (i=0; i<15; i++) {
            System.out.println(num[i]);
        }
    }
}
