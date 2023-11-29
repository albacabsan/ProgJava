import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce la altura de la letra X: ");
        int altura= s.nextInt();
        int i, ast_izq, ast_der, esp_dentro, esp_fuera;
        s.close();

        if (altura<3 || altura%2==0) {
            System.out.println("Error de altura");
        } else {
            //parte de arriba
            for (i=1; i<=altura/2+1; i++) {
                for (esp_fuera=1; esp_fuera<i; esp_fuera++) {
                    System.out.print(" ");
                }
                for (ast_izq=1; ast_izq<=1; ast_izq++) {
                    System.out.print("*");
                }
                for (esp_dentro=altura/2+2; esp_dentro>i; esp_dentro--) {
                    System.out.print(" ");
                }
                for (ast_der=1; ast_der<=1; ast_der++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        /*for (i=1; i<=altura-1; i++) {
            System.out.print("*");
            for (ast=1; ast<=(altura-2); ast++) {
                System.out.print("*");
            }
            for (esp=1; esp<=altura; esp++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        System.out.print("  ");
        for (ast=1; ast<=(altura-2); ast++) {
            System.out.print("*");
        }*/

        /*//parte de arriba
            for (i=1; i<=altura; i+=2) {
                for (esp=1; esp<=i/2; esp++) {
                    System.out.print(" ");
                }
                for (ast=i; ast<=altura; ast++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            
            //parte de abajo
            for (i=altura; i>1; i-=2) {
                for (esp=i/2-1; esp>=1; esp--) {
                    System.out.print(" ");
                }
                for (ast=i-2; ast<=altura; ast++) {
                    System.out.print("*");
                }
                System.out.println();
            } */

}
}
