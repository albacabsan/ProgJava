import java.util.Scanner;

public class Columnas {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.print("Dime un número: ");
        double num_intro=0;
        int i;
        double num;

        num_intro = s.nextDouble();
        for (i=1; i<=5; i++) {
            num = num_intro+i;
            System.out.printf("%4.2f %6.2f %8.2f\n", num, num*num, num*num*num);
        }
        s.close();
    }
}
