import java.util.Scanner;

public class LetraU {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce la altura de la letra U: ");
        int altura= s.nextInt();
        int i, ast, esp;
        s.close();
        for (i=1; i<=altura-1; i++) {
            System.out.print("*");
            for (esp=1; esp<=altura-2; esp++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        System.out.print("  ");
        for (ast=1; ast<=(altura-2); ast++) {
            System.out.print("*");
        }

}
}
