import java.util.Scanner;

public class LetraL {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce la altura de la letra L: ");
        int altura= s.nextInt();
        int i, ast;
        s.close();
        for (i=1; i<=altura-1; i++) {
            System.out.print("* ");
            System.out.println(" ");
        }
        if (i==altura) {
            for (ast=1; ast<=(altura/2)+1; ast++) {
                System.out.print("* ");
            }
        }

}
}
