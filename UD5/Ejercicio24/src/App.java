import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.print("Dime la altura de la pirámide: ");
        int altura= s.nextInt();
        /*System.out.print("Dime el caracter para la pirámide: ");
        char caracter = s.next().charAt(0);*/
        int i, esp, ast;
        int n=1;
        int alt=1;
        for (i=1; i<=altura; i++) {
            for (esp=1; esp<=(altura-i); esp++) {
                System.out.print("  ");
            }
            for (ast=1; ast<((2*i)-1); ast++ ) {
                System.out.print(ast + " ");
            }
            for (n=alt; n>0; n--) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
        s.close();
    }
}
