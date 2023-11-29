import java.util.Scanner;

public class RelojArena {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce la altura del reloj: ");
        int altura= s.nextInt();
        int i, ast, esp;
        s.close();
        //condiciones para la altura (debe ser impar y mayor o igual que 3)
        if (altura<3 || altura%2==0) {
            System.out.println("Error de altura");
        } else {
            //parte de arriba
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
            }
        }
    }
}