import java.util.Scanner;

public class Dígitos {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Dime un número");
        int num = s.nextInt();
        int numDígitos=1;
        while (num>10) {
            num/=10;
            numDígitos++;
        }
        System.out.println("El número " + num + " tiene " + numDígitos + " dígitos.");
        s.close();
    }
}
