import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        double base;
        int expo;
        double potencia;

        System.out.print("Introduce una base: ");
        base = s.nextDouble();
        System.out.print("Introduce un exponente:");
        expo = s.nextInt();
        
        if (expo==0) {
            potencia=1;
        } else {
            potencia= Math. pow(base, expo);
        }
        System.out.println("La potencia es " + potencia);
        s.close();
    }
}
