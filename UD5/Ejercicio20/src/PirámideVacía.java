import java.util.Scanner;

public class PirámideVacía {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.print("Dime la altura de la pirámide: ");
        int altura= s.nextInt();
        System.out.print("Dime el caracter para la pirámide: ");
        char caracter = s.next().charAt(0);
        int i, esp, ast;
        for (i=1; i<=altura; i++) {
            for (esp=1; esp<=(altura-i); esp++) {
                System.out.print("  ");
            }
            for (ast=1; ast<=((2*i)-1); ast++ ) {
                if (i == 1 || i == altura || ast == 1 || ast == 2 * i - 1) {
                    System.out.print(caracter + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
        s.close();
    }
}
