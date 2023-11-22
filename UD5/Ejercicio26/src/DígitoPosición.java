import java.util.Scanner;

public class DígitoPosición {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        long num;
        System.out.print("Introduce un número: ");
        num = s.nextLong();
        System.out.print("Introduce un dígito: ");
        int dig = s.nextInt();
        int posición=1;
        long revés=0;
        System.out.println("El dígito " + dig + " aparece en el número " + num + " en las siguiente posición o posiciones: ");
        while (num>0) {
            revés= (revés*10) + (num%10);
            num/=10;
        }
        while (revés>0) {
            if (revés%10==dig) {
                System.out.print(posición + " ");
            }
            revés/=10;
            posición++;
        }
        s.close();
        System.out.println();
    }
}
